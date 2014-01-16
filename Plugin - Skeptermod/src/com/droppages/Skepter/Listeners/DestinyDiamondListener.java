package com.droppages.Skepter.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

import java.util.Random;

import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.droppages.Skepter.Main.Skeptermod;

public class DestinyDiamondListener
	implements Listener
{
	
    public DestinyDiamondListener(Skeptermod plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);

    }


@EventHandler
	public void PlayerInteract(PlayerInteractEvent event)
	{
		Player p = event.getPlayer();
		int amount = p.getItemInHand().getAmount();
		if(p.hasPermission("skeptermod.useitem.destinydiamond") || (p.isOp()))
		{
			if(p.getItemInHand().getType().equals(Material.DIAMOND) && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 11 && (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)))
			{
				p.getItemInHand().setAmount(amount-1); //remove 1 diamond from their inventory
            		if(amount == 1) //but if they only have 1 left
            			p.setItemInHand(null); //set it to 0
			Random random = new Random(); //make a new random
			int choose = random.nextInt(9) + 1; //call it choose and make it up to a maximum of 9
			switch(choose) { //start a new switch based on 'choose'
			default: //default it to 1
			case 1: //case 1...						so, if the random integer is 1, it will choose case 1.
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 5));
				break;
			case 2: //case 2... etc.
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 1));
				break;
			case 3:
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 5));
				break;
			case 4:
				p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 5));
				break;
			case 5:
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 3));
				break;
			case 6:
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 5));
				break;
			case 7:
				p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 1));
				break;
			case 8:
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 3));
				break;
			case 9:
				p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 5));
				break;
						}
			}
		}
	}
}