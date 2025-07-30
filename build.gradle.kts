plugins {
    kotlin("jvm") version "2.2.0"
    id("com.gradleup.shadow") version "8.3.8"
    `maven-publish`
}

group = "kr.starly.invy"
version = "1.0.0"

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public")
    maven("https://repo.minebench.de/")
}

dependencies {
    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    // Library
    implementation("de.themoep:minedown-adventure:1.7.5-SNAPSHOT")

    // NMS
    implementation(project(":nms:common"))
    implementation(project(":nms:v1_20_R1"))
    implementation(project(":nms:v1_20_R2"))
    implementation(project(":nms:v1_20_R3"))
    implementation(project(":nms:v1_20_R4"))
    implementation(project(":nms:v1_21_R1"))
    implementation(project(":nms:v1_21_R2"))
    implementation(project(":nms:v1_21_R3"))
    implementation(project(":nms:v1_21_R4"))
    implementation(project(":nms:v1_21_R5"))
}

tasks {
    shadowJar {
        archiveClassifier.set("")
    }

    build {
        dependsOn(shadowJar)
    }
}

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public")
        maven("https://repo.minebench.de/")
    }

    dependencies {
        // Minecraft
        compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
        compileOnly("net.kyori:adventure-api:4.22.0")
    }

}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
        freeCompilerArgs.add("-Xjvm-default=all")
    }
}

publishing {
    repositories {
        mavenLocal()
    }
}