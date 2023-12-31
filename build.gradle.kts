plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.opencsv:opencsv:5.7.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")

}

tasks.test {
    useJUnitPlatform()
}