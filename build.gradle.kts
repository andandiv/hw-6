plugins {
    id("java")
    id("checkstyle")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

checkstyle {
    toolVersion = "10.15.0"
    configFile = file("${rootProject.projectDir}/checkstyle.xml")
}

tasks.test {
    useJUnitPlatform()
}