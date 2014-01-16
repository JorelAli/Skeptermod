package com.droppages.Skepter.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.droppages.Skepter.Main.Skeptermod;

public class RecipeCommand implements CommandExecutor {

	public RecipeCommand(Skeptermod skeptermod) {
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		ChatColor gold = ChatColor.GOLD;
		ChatColor blue = ChatColor.AQUA;
		ChatColor green = ChatColor.GREEN;
		Player player = (Player)sender;
		
		if(args.length == 0 || args[0].equalsIgnoreCase("help"))
		{
			//Recipe help
		player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "recipe help" + blue + "---");
		player.sendMessage(blue + "Usage: " + green + "/smrecipe <item>");
		player.sendMessage(blue + "For a list of items, use " + green + "/smrecipe items");
		player.sendMessage(blue + "'air' is where you leave empty");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("items"))
		{
		player.sendMessage(green + "Names: " + blue + "witherbow, firebow, desdiamond, godsword, healingsword, warhammer, cemerald, hsemerald, chimemerald, lightemerald, hellsword");
		player.sendMessage(green + "Abbreviations: " + blue + "wb, fb, dd, gs, hs, wh, ce, hse, che, le, hes");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("witherbow") || args[0].equalsIgnoreCase("wb"))
		{
		player.sendMessage(green + "Witherbow");
		player.sendMessage(blue + "string, stick, air");
		player.sendMessage(blue + "string, soulsand, stick");
		player.sendMessage(blue + "string, stick, air");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("firebow") || args[0].equalsIgnoreCase("fb"))
		{
    	player.sendMessage(green + "Firebow");
		player.sendMessage(blue + "string, stick, air");
		player.sendMessage(blue + "string, fire charge, stick");
		player.sendMessage(blue + "string, stickr, air");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("desdiamond") || args[0].equalsIgnoreCase("dd"))
		{
    	player.sendMessage(green + "Diamond of destiny");
		player.sendMessage(blue + "diamond, diamond, diamond");
		player.sendMessage(blue + "diamond, enderpearl, diamond");
		player.sendMessage(blue + "diamond, diamond, diamond");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("godsword") || args[0].equalsIgnoreCase("gs"))
		{
		player.sendMessage(green + "Sword of the Gods");
		player.sendMessage(blue + "diamond, nether star, diamond");
		player.sendMessage(blue + "nether star, iron sword, nether star");
		player.sendMessage(blue + "diamond, nether star, diamond");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("healingsword") || args[0].equalsIgnoreCase("hs"))
		{
    	player.sendMessage(green + "Healing Sword");
		player.sendMessage(blue + "glistering melon, glistering melon, glistering melon");
		player.sendMessage(blue + "glistering melon, diamond sword, glistering melon");
		player.sendMessage(blue + "glistering melon, glistering melon, glistering melon");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("warhammer") || args[0].equalsIgnoreCase("wh"))
		{
    	player.sendMessage(green + "Warhammer");
		player.sendMessage(blue + "gold block, gold block, gold block");
		player.sendMessage(blue + "gold block, blaze rod, gold block");
		player.sendMessage(blue + "air, blaze rod, air");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("cemerald") || args[0].equalsIgnoreCase("ce"))
		{
    	player.sendMessage(green + "Chaos Emerald");
		player.sendMessage(blue + "air, emerald, air");
		player.sendMessage(blue + "emerald, diamond block, emerald");
		player.sendMessage(blue + "air, emerald, air");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("hsemerald") || args[0].equalsIgnoreCase("hse"))
		{
    	player.sendMessage(green + "HyperSpeed Chaos Emerald");
		player.sendMessage(blue + "air, emerald, air");
		player.sendMessage(blue + "emerald, sugar, emerald");
		player.sendMessage(blue + "air, emerald, air");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("chimemerald") || args[0].equalsIgnoreCase("che"))
		{
    	player.sendMessage(green + "Chimera Chaos Emerald");
		player.sendMessage(blue + "air, emerald, air");
		player.sendMessage(blue + "emerald, feather, emerald");
		player.sendMessage(blue + "air, emerald, air");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("lightemerald") || args[0].equalsIgnoreCase("le"))
		{
    	player.sendMessage(green + "Lightning Chaos Emerald");
		player.sendMessage(blue + "air, emerald, air");
		player.sendMessage(blue + "emerald, iron ingot, emerald");
		player.sendMessage(blue + "air, emerald, air");
		return true;
		}
		
		else if(args[0].equalsIgnoreCase("hellsword") || args[0].equalsIgnoreCase("hes"))
		{
    	player.sendMessage(green + "The Sword from Hell");
		player.sendMessage(blue + "netherrack, cobblestone, netherrack");
		player.sendMessage(blue + "lava bucket, cobblestone, lava bucket");
		player.sendMessage(blue + "air, blaze rod, air");
		return true;
	}
		return true;
	}
}
