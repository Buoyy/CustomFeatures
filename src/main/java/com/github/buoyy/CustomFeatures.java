package com.github.buoyy;

import org.bukkit.plugin.java.JavaPlugin;

public class CustomFeatures extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Started successfully.");
    }
    @Override
    public void onDisable() {
        getLogger().info("Shutdown successfully.");
    }
}