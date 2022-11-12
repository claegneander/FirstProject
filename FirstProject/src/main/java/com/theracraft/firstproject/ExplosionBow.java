package com.theracraft.firstproject;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ExplosionBow {

    public static ItemStack createItem(){
        ItemStack itemStack = new ItemStack(Material.BOW);
        ItemMeta itemMeta = itemStack.getItemMeta();
        if(itemMeta != null) {
            itemMeta.displayName(Component.text("Explosion Bow"));
            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
