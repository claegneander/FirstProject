package com.theracraft.firstproject;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;
    @Override
    public void onEnable() {
        instance = this;
        registerListeners();

        System.out.println("Hello world.");
        Main.getInstance().getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "Hello world.");
        Main.getInstance().getServer().getConsoleSender().sendMessage(Component.text("Hello world.")
                .color(TextColor.color(176, 7, 53)));

    }

    @Override
    public void onDisable() {
        instance = null;
    }
    public static Main getInstance(){
        return instance;
    }
    public void registerListeners(){
        try {
            PluginManager pm = this.getServer().getPluginManager();
            pm.registerEvents(new PlayerJoin(), this);
            pm.registerEvents(new ProjectileHit(), this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
