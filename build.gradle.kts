plugins {
    id("java")
    id("net.serenity-bdd.serenity-gradle-plugin") version "2.4.34"
}

group = "co.com.banistmo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("net.serenity-bdd:serenity-core:2.0.81")
    testImplementation("net.serenity-bdd:serenity-junit:2.0.81")
    testImplementation("net.serenity-bdd:serenity-cucumber:1.9.45")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("net.serenity-bdd:serenity-screenplay:2.0.81")
}

tasks.test {
    useJUnitPlatform()
}