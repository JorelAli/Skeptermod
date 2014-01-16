package com.droppages.Skepter.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.droppages.Skepter.Main.Skeptermod;

public class ChaosLightningListener
	implements Listener
{
	private final Skeptermod plugin;

	public ChaosLightningListener(Skeptermod plugin)
    {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
        }


@SuppressWarnings("deprecation")
@EventHandler
	public void PlayerInteract(PlayerInteractEvent event)
	{
		final Player p = event.getPlayer();
		int amount = p.getItemInHand().getAmount();
		final Location loc = p.getTargetBlock(null, 256).getLocation();
		if(p.hasPermission("skeptermod.useitem.chaoslightning") || (p.isOp()))
		{
			if(p.getItemInHand().getType().equals(Material.EMERALD) && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_DAMAGE) == 7 && (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)))
				{
					p.getItemInHand().setAmount(amount-1);
	            	if(amount == 1)
	            		p.setItemInHand(null);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){ //create a new DELAYED runnable task

						
						public void run() { //when run...
							p.getWorld().strikeLightning(loc);
							}
						}
        				
        			, 10);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){ //create a new DELAYED runnable task

						
						public void run() { //when run...
							p.getWorld().strikeLightning(loc);
							}
						}
        				
        			, 20);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){ //create a new DELAYED runnable task

						
						public void run() { //when run...
							p.getWorld().strikeLightning(loc);
							}
						}
        				
        			, 30);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){ //create a new DELAYED runnable task

						
						public void run() { //when run...
							p.getWorld().strikeLightning(loc);
							}
						}
        				
        			, 40);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){ //create a new DELAYED runnable task

						
						public void run() { //when run...
							p.getWorld().strikeLightning(loc);
							}
						}
        				
        			, 50);


		}
	}
}
}