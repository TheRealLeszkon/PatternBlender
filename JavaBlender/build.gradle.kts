plugins {
    id("java")
}

group = "com.kevin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // Source: https://mvnrepository.com/artifact/org.projectlombok/lombok
    implementation("org.projectlombok:lombok:1.18.42")
    annotationProcessor("org.projectlombok:lombok:1.18.42")
//    // Source: https://mvnrepository.com/artifact/junit/junit
//    testImplementation("junit:junit:4.13.2")
}

tasks.test {
    useJUnitPlatform()
}