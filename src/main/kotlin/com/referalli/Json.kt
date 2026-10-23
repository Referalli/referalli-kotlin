package com.referalli

/** A JSON value. The SDK carries its own tiny parser and writer (no JSON library dependency). */
sealed class JsonValue {
    object Null : JsonValue()
    data class Bool(val value: Boolean) : JsonValue()
    data class Num(val value: Double) : JsonValue()
    data class Str(val value: String) : JsonValue()
    data class Arr(val items: List<JsonValue>) : JsonValue()
    data class Obj(val fields: Map<String, JsonValue>) : JsonValue()

    operator fun get(key: String): JsonValue? = (this as? Obj)?.fields?.get(key)

    fun string(): String = (this as? Str)?.value ?: throw JsonException("expected a string, got ${kind()}")
    fun long(): Long = (this as? Num)?.value?.toLong() ?: throw JsonException("expected a number, got ${kind()}")
    fun double(): Double = (this as? Num)?.value ?: throw JsonException("expected a number, got ${kind()}")
    fun bool(): Boolean = (this as? Bool)?.value ?: throw JsonException("expected a boolean, got ${kind()}")
    fun array(): List<JsonValue> = (this as? Arr)?.items ?: throw JsonException("expected an array, got ${kind()}")
    fun obj(): Map<String, JsonValue> = (this as? Obj)?.fields ?: throw JsonException("expected an object, got ${kind()}")
    fun orNull(): JsonValue? = if (this is Null) null else this

    fun queryString(): String? = when (this) {
        is Str -> value
        is Num -> if (value == Math.floor(value)) value.toLong().toString() else value.toString()
        is Bool -> value.toString()
        else -> null
    }
    fun queryLong(): Long? = when (this) {
        is Num -> value.toLong()
        is Str -> value.toLongOrNull()
        else -> null
    }
    fun queryDouble(): Double? = when (this) {
        is Num -> value
        is Str -> value.toDoubleOrNull()
        else -> null
    }
    fun queryBoolean(): Boolean? = when (this) {
        is Bool -> value
        is Str -> value == "true"
        else -> null
    }

    private fun kind() = this::class.simpleName

    /**
     * Compact JSON. (Not `toString()`: the data-class cases generate their own, which would win.)
     */
    fun stringify(): String = StringBuilder().also { write(this, it) }.toString()

    companion object {
        fun parse(text: String): JsonValue = Parser(text).run { val v = value(); skipWs(); if (i != s.length) error("trailing data"); v }

        private fun write(v: JsonValue, out: StringBuilder) {
            when (v) {
                is Null -> out.append("null")
                is Bool -> out.append(v.value)
                is Num -> if (v.value == Math.floor(v.value) && !v.value.isInfinite() && Math.abs(v.value) < 9.007199254740992E15) out.append(v.value.toLong()) else out.append(v.value)
                is Str -> quote(v.value, out)
                is Arr -> {
                    out.append('[')
                    v.items.forEachIndexed { i, x -> if (i > 0) out.append(','); write(x, out) }
                    out.append(']')
                }
                is Obj -> {
                    out.append('{')
                    var first = true
                    for ((k, x) in v.fields) {
                        if (!first) out.append(',')
                        first = false
                        quote(k, out)
                        out.append(':')
                        write(x, out)
                    }
                    out.append('}')
                }
            }
        }

        private fun quote(s: String, out: StringBuilder) {
            out.append('"')
            for (c in s) {
                when (c) {
                    '"' -> out.append("\\\"")
                    '\\' -> out.append("\\\\")
                    '\n' -> out.append("\\n")
                    '\r' -> out.append("\\r")
                    '\t' -> out.append("\\t")
                    else -> if (c < ' ') out.append(String.format("\\u%04x", c.code)) else out.append(c)
                }
            }
            out.append('"')
        }
    }

    private class Parser(val s: String) {
        var i = 0

        fun skipWs() {
            while (i < s.length && s[i].isWhitespace()) i++
        }

        fun error(msg: String): Nothing = throw JsonException("$msg at $i")

        fun value(): JsonValue {
            skipWs()
            if (i >= s.length) error("unexpected end")
            return when (val c = s[i]) {
                '{' -> obj()
                '[' -> arr()
                '"' -> Str(str())
                't' -> lit("true", Bool(true))
                'f' -> lit("false", Bool(false))
                'n' -> lit("null", Null)
                else -> if (c == '-' || c.isDigit()) num() else error("unexpected '$c'")
            }
        }

        fun lit(word: String, v: JsonValue): JsonValue {
            if (!s.startsWith(word, i)) error("expected $word")
            i += word.length
            return v
        }

        fun num(): JsonValue {
            val start = i
            while (i < s.length && (s[i].isDigit() || s[i] in "+-.eE")) i++
            return Num(s.substring(start, i).toDouble())
        }

        fun str(): String {
            i++
            val out = StringBuilder()
            while (true) {
                if (i >= s.length) error("unterminated string")
                val c = s[i++]
                when (c) {
                    '"' -> return out.toString()
                    '\\' -> {
                        val e = s[i++]
                        when (e) {
                            'n' -> out.append('\n')
                            'r' -> out.append('\r')
                            't' -> out.append('\t')
                            'b' -> out.append('\b')
                            'f' -> out.append('\u000c')
                            'u' -> {
                                out.append(s.substring(i, i + 4).toInt(16).toChar())
                                i += 4
                            }
                            else -> out.append(e)
                        }
                    }
                    else -> out.append(c)
                }
            }
        }

        fun arr(): JsonValue {
            i++
            val items = mutableListOf<JsonValue>()
            skipWs()
            if (s[i] == ']') { i++; return Arr(items) }
            while (true) {
                items.add(value())
                skipWs()
                when (s[i++]) {
                    ',' -> continue
                    ']' -> return Arr(items)
                    else -> error("expected , or ]")
                }
            }
        }

        fun obj(): JsonValue {
            i++
            val fields = LinkedHashMap<String, JsonValue>()
            skipWs()
            if (s[i] == '}') { i++; return Obj(fields) }
            while (true) {
                skipWs()
                if (s[i] != '"') error("expected a key")
                val k = str()
                skipWs()
                if (s[i++] != ':') error("expected :")
                fields[k] = value()
                skipWs()
                when (s[i++]) {
                    ',' -> continue
                    '}' -> return Obj(fields)
                    else -> error("expected , or }")
                }
            }
        }
    }
}

class JsonException(message: String) : RuntimeException(message)

/** A required field: missing is an error. */
internal fun Map<String, JsonValue>.field(name: String): JsonValue = this[name] ?: JsonValue.Null
