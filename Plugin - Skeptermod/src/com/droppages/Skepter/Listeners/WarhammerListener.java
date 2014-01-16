package com.droppages.Skepter.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.droppages.Skepter.Main.Skeptermod;

public class WarhammerListener
implements Listener
{

	public WarhammerListener(Skeptermod plugin)
	{
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteractBlock(PlayerInteractEvent event)
	{
		if(event.getPlayer().hasPermission("skeptermod.useitem.warhammer") || (event.getPlayer().isOp()))
	    if(event.getPlayer().getItemInHand().getTypeId() == Material.GOLD_AXE.getId() && event.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.ARROW_DAMAGE) == 1 && (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)))
	    {
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 20).getLocation());
	    	event.getPlayer().getWorld().createExplosion(event.getPlayer().getTargetBlock(null, 20).getLocation(), 8.0F, true);
	    	}
	}
}
	

