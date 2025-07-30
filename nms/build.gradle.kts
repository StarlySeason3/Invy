plugins {
    kotlin("jvm") version "2.2.0"
}

subprojects {
    group = "kr.starly.invy.nms.${project.name}"
    version = rootProject.version

    repositories {
        mavenLocal()
    }
}

project(":nms:common") {
    group = "kr.starly.invy.nms"
}