package kr.starly.invy

import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

data class ClickEvent(
    val player: Player,
    val clickType: ClickType,
    val hotbarButon: Int,
    var cancelled: Boolean
)