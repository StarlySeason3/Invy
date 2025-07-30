package kr.starly.invy.nms.version

import org.bukkit.Bukkit

enum class NmsRevision(
    private val supportedVersions: List<String>
) {

    V1_20_R1(listOf("1.20", "1.20.1")),
    V1_20_R2(listOf("1.20.2")),
    V1_20_R3(listOf("1.20.4")),
    V1_20_R4(listOf("1.20.5")),
    V1_21_R1(listOf("1.21", "1.21.1")),
    V1_21_R2(listOf("1.21.2", "1.21.3")),
    V1_21_R3(listOf("1.21.4")),
    V1_21_R4(listOf("1.21.5")),
    V1_21_R5(listOf("1.21.6", "1.21.7", "1.21.8"));

    companion object {

        val REQUIRED_REVISION: NmsRevision
            private set

        init {
            val currentVersion = Bukkit.getMinecraftVersion()
            REQUIRED_REVISION = NmsRevision.entries.find {
                it.supportedVersions.contains(currentVersion)
            } ?: throw UnsupportedOperationException("Your version of Minecraft is not supported by NmsMultiver")
        }

    }

}