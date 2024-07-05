package net.endkind.endernotooldamage.Listener;

import net.endkind.endernotooldamage.EnderNoToolDamage;

public class ListenerManager {
    public ListenerManager (EnderNoToolDamage plugin) {
        plugin.getServer().getPluginManager().registerEvents(new ItemDamageListener(), plugin);
    }
}
