plugins {
    kotlin("jvm") version "2.2.0"
    id("me.tagavari.nmsremap") version "1.0.0"
}

tasks {
    remap {
        version.set("1.21.5-R0.1-SNAPSHOT")
        archiveClassifier.set("")
    }

    jar {
        dependsOn(remap)
    }
}