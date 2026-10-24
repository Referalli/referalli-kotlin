plugins {
    kotlin("jvm") version "2.4.10"
    `java-library`
    `maven-publish`
    signing
}

group = "com.referalli"
version = "0.2.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    // Public API: suspend functions and Flow; also CompletableFuture.await for the JVM transport.
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

// The conformance runner (driven by sdk-conformance) and the compiled README samples; not part of the library.
sourceSets {
    create("conformance") {
        compileClasspath += sourceSets.main.get().output
        runtimeClasspath += sourceSets.main.get().output
    }
}

configurations["conformanceImplementation"].extendsFrom(configurations.implementation.get(), configurations.api.get())

tasks.register<JavaExec>("runConformance") {
    group = "verification"
    description = "Runs the shared SDK conformance plan: -Pconformance=\"<mock-url> <cases.json> <vectors.json>\""
    classpath = sourceSets["conformance"].runtimeClasspath
    mainClass.set("com.referalli.conformance.MainKt")
    args = (project.findProperty("conformance") as String?)?.split(" ") ?: emptyList()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "referalli-kotlin"
            from(components["java"])
            pom {
                name.set("Referalli Kotlin SDK")
                description.set("Official Referalli SDK: typed coroutine API client, webhook verification and the app tracker.")
                url.set("https://github.com/Referalli/referalli-kotlin")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("referalli")
                        name.set("Referalli")
                    }
                }
                scm {
                    url.set("https://github.com/Referalli/referalli-kotlin")
                    connection.set("scm:git:https://github.com/Referalli/referalli-kotlin.git")
                    developerConnection.set("scm:git:ssh://git@github.com/Referalli/referalli-kotlin.git")
                }
            }
        }
    }
    repositories {
        // Staged here, then uploaded to Maven Central's Portal by the release workflow.
        maven {
            name = "staging"
            url = uri(layout.buildDirectory.dir("staging"))
        }
    }
}

signing {
    // Only when publishing from CI: SIGNING_KEY / SIGNING_PASSWORD (ASCII-armored GPG key).
    val key = System.getenv("SIGNING_KEY")
    if (key != null) {
        useInMemoryPgpKeys(key, System.getenv("SIGNING_PASSWORD"))
        sign(publishing.publications["maven"])
    }
}
