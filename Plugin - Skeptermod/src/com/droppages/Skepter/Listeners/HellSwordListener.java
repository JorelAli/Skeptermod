package com.droppages.Skepter.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.droppages.Skepter.Main.Skeptermod;

public class HellSwordListener
implements Listener
{

	public HellSwordListener(Skeptermod plugin)
	{
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteractBlock(PlayerInteractEvent event)
	{
		final Player player = event.getPlayer();
		if(player.hasPermission("skeptermod.useitem.hellsword") || (event.getPlayer().isOp()))
		{
			if(player.getItemInHand().getTypeId() == Material.STONE_SWORD.getId() && event.getPlayer().getItemInHand().getEnchantmentLevel(Enchantment.DAMAGE_ALL) == 16960)
			{
				if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK)){
					player.getWorld().strikeLightning(player.getTargetBlock(null, 200).getLocation());
					player.getWorld().createExplosion(player.getTargetBlock(null, 200).getLocation(), 3.0F);
				player.setHealth(player.getHealth() - 2);
				player.setFoodLevel(player.getFoodLevel() - 10);
				
				
        }}
    }else{
    	
    }
	}
}
	
	
	

