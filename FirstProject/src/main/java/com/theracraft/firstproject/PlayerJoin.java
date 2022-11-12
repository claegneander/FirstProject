package com.theracraft.firstproject;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.getPlayer().getInventory().addItem(ExplosionBow.createItem());
    }
}
