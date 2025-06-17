package com.minecraftmusicmanager;

import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftMusicManager extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("MinecraftMusicManager Enabled!");
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("MinecraftMusicManager Disabled!");
    }
}