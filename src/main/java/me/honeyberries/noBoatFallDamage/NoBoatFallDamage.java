package me.honeyberries.noBoatFallDamage;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoBoatFallDamage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getLogger().info("No Boat Fall Damage has been enabled!");
        getServer().getLogger().info("Boat fall damage has been fixed for the specific heights");

        //Register the EntityDamageListener listener
        getServer().getPluginManager().registerEvents(new EntityDamageListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getServer().getLogger().info("No Boat Fall Damage has been disabled!");

    }

    public static NoBoatFallDamage getInstance() {
        return getPlugin(NoBoatFallDamage.class);
    }

}
