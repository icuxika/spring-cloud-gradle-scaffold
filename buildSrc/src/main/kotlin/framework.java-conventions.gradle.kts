import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.gradle.api.tasks.testing.logging.TestLogEvent.STANDARD_OUT
import org.gradle.api.tasks.testing.logging.TestLogEvent.STANDARD_ERROR
import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL

plugins {
    java
}

repositories {
    mavenCentral()
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.7.2")
            targets {
                all {
                    testTask.configure {
                        jvmArgs = listOf(
                            "-Dsun.stdout.encoding=UTF-8",
                            "-Dsun.stderr.encoding=UTF-8",
                        )
                        testLogging {
                            exceptionFormat = FULL
                            showExceptions = true
                            showStandardStreams = true
                            events(PASSED, SKIPPED, FAILED, STANDARD_OUT, STANDARD_ERROR)
                        }
                    }
                }
            }
        }

        val integrationTest by registering(JvmTestSuite::class) {
            dependencies {
                implementation(project())
            }

            targets {
                all {
                    testTask.configure {
                        shouldRunAfter(test)
                        jvmArgs = listOf(
                            "-Dsun.stdout.encoding=UTF-8",
                            "-Dsun.stderr.encoding=UTF-8",
                        )
                        testLogging {
                            exceptionFormat = FULL
                            showExceptions = true
                            showStandardStreams = true
                            events(PASSED, SKIPPED, FAILED, STANDARD_OUT, STANDARD_ERROR)
                        }
                    }
                }
            }
        }
    }
}

tasks.named("check") {
    dependsOn(testing.suites.named("integrationTest"))
}