package com.droppages.Skepter.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.droppages.Skepter.Main.Skeptermod;

public class GiveCommand implements CommandExecutor {

	public GiveCommand(Skeptermod skeptermod) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player)sender;
		ChatColor gold = ChatColor.GOLD;
    	ChatColor blue = ChatColor.AQUA;
    	ChatColor green = ChatColor.GREEN;
    	if(command.getName().equalsIgnoreCase("smgive") && (player.isOp() || player.hasPermission("skeptermod.usecommand.smgive")));
    	{
		if(args.length == 0 || args[0].equalsIgnoreCase("help"))
		{
		player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Give help" + blue + "---");
		player.sendMessage(blue + "Usage: " + green + "/smgive <item> <amount of items>");
		player.sendMessage(green + "Item Names: " + blue + "witherbow, firebow, desdiamond, godsword, healingsword, warhammer, cemerald, hsemerald, chimemerald, lightemerald, hellsword");
    	player.sendMessage(green + "Abbreviations: " + blue + "wb, fb, dd, gs, hs, wh, ce, hse, che, le, hes");
    	return true;
		}
		
		else if(args[0].equalsIgnoreCase("witherbow") || args[0].equalsIgnoreCase("wb"))
		{
		    if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
	    int n = Integer.parseInt(args[1]);
		ItemStack witherbow = new ItemStack(Material.BOW, n);
	    witherbow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 10);
	    ItemMeta im = witherbow.getItemMeta();
	    im.setDisplayName("Witherbow");
		witherbow.setItemMeta(im);
		player.getInventory().addItem(new ItemStack[] {
                witherbow
            });
		return true;
		
		}
		
		else if(args[0].equalsIgnoreCase("firebow") || args[0].equalsIgnoreCase("fb"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
		ItemStack firebow = new ItemStack(Material.BOW, n);
	    firebow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 9);
	    ItemMeta im1 = firebow.getItemMeta(); 
		im1.setDisplayName("Firebow");
		firebow.setItemMeta(im1);
		player.getInventory().addItem(new ItemStack[] {
                firebow
            });
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("desdiamond") || args[0].equalsIgnoreCase("dd"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
		ItemStack destinydiamond = new ItemStack(Material.DIAMOND, n);
	    destinydiamond.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 11);
	    ItemMeta im2 = destinydiamond.getItemMeta();
		im2.setDisplayName("Diamond of Destiny");
		destinydiamond.setItemMeta(im2);	
		player.getInventory().addItem(new ItemStack[] {
                destinydiamond
            });
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("godsword") || args[0].equalsIgnoreCase("gs"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
			ItemStack godsword = new ItemStack(Material.IRON_SWORD, n);
	        godsword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 16960);
	        ItemMeta im3 = godsword.getItemMeta();
			im3.setDisplayName("The Sword of the Gods");
			godsword.setItemMeta(im3);
		player.getInventory().addItem(new ItemStack[] {
                godsword
            });
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("healingsword") || args[0].equalsIgnoreCase("hs"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
			ItemStack healingsword = new ItemStack(Material.DIAMOND_SWORD, n);
	        healingsword.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
	        ItemMeta im4 = healingsword.getItemMeta();
			im4.setDisplayName("Healing Sword");
			healingsword.setItemMeta(im4);
		player.getInventory().addItem(new ItemStack[] {
                healingsword
            });
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("warhammer") || args[0].equalsIgnoreCase("wh"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
			ItemStack warhammer = new ItemStack(Material.GOLD_AXE, n);
	        warhammer.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 1);
	        ItemMeta im5 = warhammer.getItemMeta();
			im5.setDisplayName("War Hammer");
			warhammer.setItemMeta(im5);
			player.getInventory().addItem(new ItemStack[] {
                    warhammer
                });
			return true;
		}
		
		else if(args[0].equalsIgnoreCase("cemerald") || args[0].equalsIgnoreCase("ce"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
			ItemStack cemerald = new ItemStack(Material.EMERALD, n);
			cemerald.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
			ItemMeta im6 = cemerald.getItemMeta();
			im6.setDisplayName("Chaos Emerald");
			cemerald.setItemMeta(im6);
			player.getInventory().addItem(new ItemStack[] {
                    cemerald
                });
			return true;
		}
		
		else if(args[0].equalsIgnoreCase("hsemerald") || args[0].equalsIgnoreCase("hse"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
			ItemStack cSpeed = new ItemStack(Material.EMERALD, n);
			cSpeed.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 9);
			ItemMeta im7 = cSpeed.getItemMeta();
			im7.setDisplayName("HyperSpeed Chaos Emerald");
			cSpeed.setItemMeta(im7);
			player.getInventory().addItem(new ItemStack[] {
                    cSpeed
                });
			return true;
		}
		
		else if(args[0].equalsIgnoreCase("chimemerald") || args[0].equalsIgnoreCase("che"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
			ItemStack cchimera = new ItemStack(Material.EMERALD, n);
			cchimera.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 8);
			ItemMeta im8 = cchimera.getItemMeta();
			im8.setDisplayName("Chimera Chaos Emerald");
			cchimera.setItemMeta(im8);
			player.getInventory().addItem(new ItemStack[] {
                    cchimera
                });
			return true;
		}
		
		else if(args[0].equalsIgnoreCase("lightemerald") || args[0].equalsIgnoreCase("le"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }
			int n = Integer.parseInt(args[1]);
			ItemStack clightning = new ItemStack(Material.EMERALD, n);
			clightning.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 7);
			ItemMeta im9 = clightning.getItemMeta();
			im9.setDisplayName("Lightning Chaos Emerald");
			clightning.setItemMeta(im9);
			player.getInventory().addItem(new ItemStack[] {
                    clightning
                });
			return true;
		}
		
		else if(args[0].equalsIgnoreCase("hellsword") || args[0].equalsIgnoreCase("hes"))
		{
			if(args.length != 2){
		    	player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number of items to give");
		    	return true;
		    }	
			int n = Integer.parseInt(args[1]);
		ItemStack hellsword = new ItemStack(Material.STONE_SWORD, n);
		hellsword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 16960);
		ItemMeta im10 = hellsword.getItemMeta();
		im10.setDisplayName("The Sword from Hell");
		hellsword.setItemMeta(im10);
		player.getInventory().addItem(new ItemStack[] {
                hellsword
            });
		return true;
    		}

    	}
		return true;
	}
}


