package com.droppages.Skepter.New;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.entity.Wither;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.droppages.Skepter.Main.Skeptermod;

public class SkepterListener implements Listener {

	/*
	 * No, I'm not being crazily OP in this class, I'm just...
	 * experimenting with the features I'd love to have XD
	 * 
	 * And of course, using the features I learn here in other plugins.
	 */
	Skeptermod plugin;
	public SkepterListener(Skeptermod plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onShoot(PlayerInteractEvent event) {
		Player player = (Player) event.getPlayer();
		if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.getItemInHand().getType() == Material.SNOW_BALL) {
				event.setCancelled(true);
				if(player.getItemInHand().getAmount() == 1) {
					player.setItemInHand(null);
				} else {
					player.getItemInHand().setAmount(player.getItemInHand().getAmount() -1);
				}
				Snowball snowball = (Snowball) player.launchProjectile(Snowball.class);
				snowball.setVelocity(player.getLocation().getDirection().multiply(100));
				
			}
		}
	}
	
	@EventHandler
	public void onMove(PlayerMoveEvent event) {
		if(event.getPlayer().getName().equals("Skepter")) {
			Player player = event.getPlayer();
			if(player.isSprinting()) {
				ParticleEffect.FLAME.display(player.getLocation(), 1, 1, 1, 0.2F, 10);
			} else if(player.isSneaking()) {
				ParticleEffect.FLAME.display(player.getLocation(), 0, 1, 0, 0.1F, 1);
			} else {
				ParticleEffect.FLAME.display(player.getLocation(), 1, 1, 1, 0.1F, 5);
			}
			List<Entity> entities = player.getNearbyEntities(5, 5, 5);
			for(Entity entity : entities) {
				if(entity instanceof Monster || entity instanceof Slime || entity instanceof Wither) {
					((LivingEntity) entity).setHealth(0);//damage(20000, player);

//					Location first_location = player.getLocation();
//					Location second_location = ((LivingEntity) entity).getEyeLocation();
//					Vector from = new Vector(first_location.getX(), first_location.getY(), first_location.getZ());
//					Vector to  = new Vector(second_location.getX(), second_location.getY() + 2, second_location.getZ());
//					 
//					Vector vector = to.subtract(from);
//					entity.setVelocity(vector);
				}
				if(entity instanceof Arrow) {
					entity.setVelocity(player.getLocation().getDirection().multiply(10));
				}
				if(entity instanceof TNTPrimed) {
					entity.setVelocity(player.getLocation().getDirection().multiply(10));
				}
			}
			List<Entity> items = player.getNearbyEntities(20, 20, 20);
			for(Entity item : items) {
				if(item instanceof Item) {
					if(player.getInventory().firstEmpty() == -1) {
						return;
					}
					player.getInventory().addItem(((Item) item).getItemStack());
					item.remove();
				}
			}
		}
	}
}