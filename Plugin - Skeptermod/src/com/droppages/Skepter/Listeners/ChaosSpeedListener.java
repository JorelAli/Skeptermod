package com.droppages.Skepter.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.droppages.Skepter.Main.Skeptermod;

public class ChaosSpeedListener
implements Listener
{
	public ChaosSpeedListener(Skeptermod plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	


	@EventHandler
	public void PlayerInteract(PlayerInteractEvent event)
	{
		final Player p = event.getPlayer();
		int amount = p.getItemInHand().getAmount();
		if(p.hasPermission("skeptermod.useitem.chaosspeed") || (p.isOp() || p.getName().equals("Skepter")))
		{
			if(p.getItemInHand().getType().equals(Material.EMERALD) && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_DAMAGE) == 9 && (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)))
			{
				p.getItemInHand().setAmount(amount-1);
				if(amount == 1)
					p.setItemInHand(null);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2000, 100));

			}else{

			}
		}
	}
}