plugins {
    java
    checkstyle
}

group = "de.philippulti"
version = "1.0-SNAPSHOT"

subprojects {

    apply(plugin="java")
    apply(plugin="checkstyle")

    repositories {
        mavenCentral()
    }

    dependencies {
        compileOnly("org.projectlombok:lombok:1.18.20")
        annotationProcessor("org.projectlombok:lombok:1.18.20")
        implementation("org.jetbrains:annotations:16.0.2")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    }

    checkstyle {
        toolVersion = "8.41"
        config = project.resources.text.fromUri("https://paraalgo.informatik.uni-bremen.de/kram/checkstyle.xml")
    }

    tasks.test {
        useJUnit()
    }

}
