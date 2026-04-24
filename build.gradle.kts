plugins {
  id("java")
  id("com.diffplug.spotless") version "6.25.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

spotless {
  java {
    googleJavaFormat() // standard formatter
    removeUnusedImports()
    trimTrailingWhitespace()
    endWithNewline()
  }
}

dependencies {
  testImplementation(platform("org.junit:junit-bom:6.0.0"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
  useJUnitPlatform()
}
