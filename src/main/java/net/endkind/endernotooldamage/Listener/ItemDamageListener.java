package net.endkind.endernotooldamage.Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

public class ItemDamageListener implements Listener {
    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent event) {
        ItemStack item = event.getItem();

        if (item != null && item.getType() != Material.AIR && item.getAmount() >= event.getDamage()) {
            event.setCancelled(true);
        }
    }
}
