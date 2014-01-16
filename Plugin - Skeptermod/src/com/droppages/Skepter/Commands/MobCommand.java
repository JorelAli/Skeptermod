package com.droppages.Skepter.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.droppages.Skepter.Main.Skeptermod;

public class MobCommand implements CommandExecutor{
	
	public MobCommand(Skeptermod plugin) 
	{
		
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
    	Player player = (Player)sender;
    	World world = player.getWorld();
    	@SuppressWarnings("deprecation")
		Location spawnmob = player.getTargetBlock(null, 200).getLocation();
    	spawnmob.setY(spawnmob.getY() + 1);
    	spawnmob.setX(spawnmob.getX() + 0.5);
    	ChatColor blue = ChatColor.AQUA;
    	ChatColor gold = ChatColor.GOLD;
    	ChatColor green = ChatColor.GREEN;
    	if(player.hasPermission("skeptermod.usecommand.smmob") || (player.isOp()));
    	{
    		if(command.getName().equalsIgnoreCase("smmob"));
    		{
    			if(args.length == 0 || args[0].equalsIgnoreCase("help"))
    			{
    				player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Mob help" + blue + "---");
    				player.sendMessage(green + "Usage: " + blue + "/smmob <mob>");
					player.sendMessage(green + "For a list of mobs, use " + blue + "/smmob mobs");
					return true;
				}
    		
    			else if(args[0].equalsIgnoreCase("mobs"))
    			{
    				player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Mob list" + blue +"---");
    				player.sendMessage(green + "superzombie " + blue + "zombie with strong armour and strength");
    				player.sendMessage(green + "Skepter " + blue + "Skepter");
    				player.sendMessage(green + "Potatoskeleton " + blue + "witherskeleton powered by potatoes"); 
    				player.sendMessage(green + "More to come soon! - If you have any ideas, contact Skepter");
    				return true;
    			}
    			
    			else if(args[0].equalsIgnoreCase("superzombie"))
    			{
    				int i;
    				int n;
    				if(args.length != 2){
    					player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of mobs to spawn");
    					return true;
    				}
    				n = Integer.parseInt(args[1]);
    				if(n > 500){
    					player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number lower than 500");
    					return true;
    				}
    					for (i = 0; i < n; i++) {
                    LivingEntity zombie = (LivingEntity)world.spawnEntity(spawnmob, EntityType.ZOMBIE);
                    EntityEquipment zombieInventory = zombie.getEquipment();
					zombieInventory.setItemInHand(new ItemStack (Material.DIAMOND_SWORD));
					zombieInventory.getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, 3);
                    zombieInventory.setChestplate(new ItemStack (Material.IRON_CHESTPLATE));
                    zombieInventory.setHelmet(new ItemStack (Material.IRON_HELMET));
                    PotionEffect effect = new PotionEffect(PotionEffectType.INVISIBILITY, 12000, 10);
                    effect.apply(zombie);
    					}
    			}
    			
    			else if(args[0].equalsIgnoreCase("skepter"))
    			{
    				int i;
    				int n;
    				if(args.length != 2){
    					player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of mobs to spawn");
    					return true;
    				}
    				n = Integer.parseInt(args[1]);
    				if(n > 500){
    					player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number lower than 500");
    					return true;
    				}
    					for (i = 0; i < n; i++) {
    				LivingEntity zombie = (LivingEntity)world.spawnEntity(spawnmob, EntityType.ZOMBIE);
    				EntityEquipment zombieInventory = zombie.getEquipment();
    				zombieInventory.setItemInHand(new ItemStack (Material.MILK_BUCKET));
    				zombieInventory.setChestplate(new ItemStack (Material.DIAMOND_CHESTPLATE));
    				zombieInventory.setBoots(new ItemStack (Material.DIAMOND_BOOTS));
    				zombieInventory.setLeggings(new ItemStack (Material.DIAMOND_LEGGINGS));
    				ItemStack skullitem = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
    		        SkullMeta skullmeta = (SkullMeta)skullitem.getItemMeta();
    		        skullmeta.setOwner("Skepter");
    		        skullitem.setItemMeta(skullmeta);
    				zombieInventory.setHelmet(new ItemStack(skullitem));
    				PotionEffect effect = new PotionEffect(PotionEffectType.INVISIBILITY, 12000, 10);
    				PotionEffect effect1 = new PotionEffect(PotionEffectType.SPEED, 12000, 10);
    				effect.apply(zombie);
    				effect1.apply(zombie);
    			}}
    			
    			else if(args[0].equalsIgnoreCase("potatoskeleton"))
    			{
    				int i;
    				int n;
    				if(args.length != 2){
    					player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of mobs to spawn");
    					return true;
    				}
    				n = Integer.parseInt(args[1]);
    				if(n > 500){
    					player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number lower than 500");
    					return true;
    				}
    					for (i = 0; i < n; i++) {
    				Skeleton skeleton = (Skeleton)world.spawnEntity(spawnmob, EntityType.SKELETON);
    				skeleton.setSkeletonType(org.bukkit.entity.Skeleton.SkeletonType.WITHER);
    				EntityEquipment skeletonInventory = skeleton.getEquipment();
    				ItemStack head = new ItemStack (Material.GOLD_HELMET);
    				head.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
    				ItemStack chest = new ItemStack (Material.GOLD_CHESTPLATE);
    				chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
    				ItemStack legs = new ItemStack (Material.GOLD_LEGGINGS);
    				legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
    				ItemStack feet = new ItemStack (Material.GOLD_BOOTS);
    				feet.addEnchantment(Enchantment.PROTECTION_FALL, 2);
    				ItemStack potato = new ItemStack (Material.POISONOUS_POTATO);
    				potato.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
    				skeletonInventory.setItemInHand(potato);
    				skeletonInventory.setHelmet(head);
    				skeletonInventory.setChestplate(chest);
    				skeletonInventory.setLeggings(legs);
    				skeletonInventory.setBoots(feet);
    			}}
    		}
    	}
		return true;
    }
}

	
