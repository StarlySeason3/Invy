package kr.starly.invy

import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class Click(
    val player: Player,
    val clickType: ClickType,
    val hotbatButton: Int = -1
)