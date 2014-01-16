package com.droppages.Skepter.Listeners;

import java.util.List;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.droppages.Skepter.Main.Skeptermod;
import com.droppages.Skepter.Utils.ParticleEffect;

public class SkepterListener implements Listener {

	Skeptermod plugin;
	public SkepterListener(Skeptermod plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
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
				if(entity instanceof Monster || entity instanceof Slime) {
					((LivingEntity) entity).damage(100, player);
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