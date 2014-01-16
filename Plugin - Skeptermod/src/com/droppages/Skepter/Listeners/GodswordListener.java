package com.droppages.Skepter.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.droppages.Skepter.Main.Skeptermod;

public class GodswordListener
implements Listener
{

	public GodswordListener(Skeptermod plugin)
	{
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteractBlock(PlayerInteractEvent event)
	{
		if(event.getPlayer().hasPermission("skeptermod.useitem.godsword") || (event.getPlayer().isOp()))
		{
			if(event.getPlayer().getItemInHand().getTypeId() == Material.IRON_SWORD.getId() && event.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.DAMAGE_ALL) == 16960)
			{
				if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
				event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 200).getLocation());
				event.getPlayer().setFireTicks(0);
				if(event.getPlayer().getHealth() < 20);
					event.getPlayer().setHealth(20);
        }}
    }else{
    	
    }
	}
}
	
	
	

