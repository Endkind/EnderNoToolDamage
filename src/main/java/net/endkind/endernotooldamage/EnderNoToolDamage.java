package net.endkind.endernotooldamage;

import net.endkind.endernotooldamage.Listener.ListenerManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderNoToolDamage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabling EnderNoToolDamage");

        new ListenerManager(this);

        getLogger().info("EnderNoToolDamage is enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabling EnderNoToolDamage");
        getLogger().info("EnderNoToolDamage is disabled");
    }
}
