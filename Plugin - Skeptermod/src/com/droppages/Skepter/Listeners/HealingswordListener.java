package com.droppages.Skepter.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.droppages.Skepter.Main.Skeptermod;

public class HealingswordListener
implements Listener
{

	public HealingswordListener(Skeptermod plugin)
	{
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteractBlock(PlayerInteractEvent event)
	{
		if(event.getPlayer().hasPermission("skeptermod.useitem.healingsword") || (event.getPlayer().isOp()))
		{
			if(event.getPlayer().getItemInHand().getTypeId() == Material.DIAMOND_SWORD.getId() && event.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 1)
			{
		    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 30, 1));
			}
		}else{
		
		}
	}
}
	

