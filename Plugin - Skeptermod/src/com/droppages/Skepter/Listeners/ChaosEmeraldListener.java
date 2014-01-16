package com.droppages.Skepter.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.GameMode;
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

public class ChaosEmeraldListener
implements Listener
{

	private final Skeptermod plugin;

	public ChaosEmeraldListener(Skeptermod plugin)
	{
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}


	@EventHandler
	public void PlayerInteract(PlayerInteractEvent event) throws InterruptedException
	{
		final Player p = event.getPlayer();
		int amount = p.getItemInHand().getAmount();
		if(p.hasPermission("skeptermod.useitem.chaosemerald") || (p.isOp()) || p.getName().equals("Skepter"))
		{
			if(p.getItemInHand().getType().equals(Material.EMERALD) && p.getItemInHand().getItemMeta().getDisplayName().equals("Chaos Emerald") && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_DAMAGE) == 10 && (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)))
			{
				if(amount == 7)
				{
					p.setItemInHand(null);
					p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 2000, 5));
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2000, 3));
					p.sendMessage(ChatColor.GOLD + "[Skeptermod] " + ChatColor.BLUE + "Entered Chaos Mode");
					p.setAllowFlight(true);
					p.setFlying(true);
					final int taskID = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){

						@Override
						public void run() { 
							p.setFireTicks(0);
							p.getWorld().playEffect(p.getEyeLocation().subtract(0, 2, 0), Effect.MOBSPAWNER_FLAMES, 0);
						}

					}, 0, 0);

					Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){ 


						public void run() { 
							Bukkit.getScheduler().cancelTask(taskID);
							p.sendMessage(ChatColor.GOLD + "[Skeptermod] " + ChatColor.BLUE + "Looks like your Chaos Mode ran out!");
							if(!(p.getGameMode().equals(GameMode.CREATIVE)))
							{
								p.setAllowFlight(false);
								p.setFlying(false);
							}
							else if(p.getGameMode().equals(GameMode.CREATIVE))
							{
								p.setAllowFlight(true);
							}
						}

					}, 2000);


				}
			}else{ 

			}
		}
	}

}