package com.theracraft.firstproject;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileHit implements Listener {

    @EventHandler
    public void onEvent(ProjectileHitEvent event){
        if(event.getEntity().getShooter() instanceof Player player){
            if(player.getInventory().getItemInMainHand().equals(ExplosionBow.createItem())){
                Location location = event.getEntity().getLocation();
                location.createExplosion(event.getEntity(), 10F);
            }
        }
    }
}
