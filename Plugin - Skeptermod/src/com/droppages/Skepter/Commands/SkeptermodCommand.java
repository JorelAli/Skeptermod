package com.droppages.Skepter.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.droppages.Skepter.Main.Skeptermod;

public class SkeptermodCommand implements CommandExecutor{
	
	public SkeptermodCommand(Skeptermod plugin) {
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
    	Player player = (Player)sender;
    	ChatColor blue = ChatColor.AQUA;
    	ChatColor gold = ChatColor.GOLD;
    	ChatColor green = ChatColor.GREEN;
    	if(command.getName().equalsIgnoreCase("sm") && (player.isOp() || player.hasPermission("skeptermod.usecommand.sm") || player.getName().equals("Skepter")));
    	{
    		if((args.length == 0) || (args[0].equalsIgnoreCase("help")))
    		{
    			//Main command
    		player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Help Page" + blue + "---");
        	player.sendMessage(green + "Commands:");
        	player.sendMessage(green + "/sm info " + blue + "Displays information about the Skeptermod");
        	player.sendMessage(green + "/sm items " + blue + "Displays help about Skeptermod's items");
        	player.sendMessage(green + "/smrecipe help " + blue + "Displays Skeptermod item recipes");
        	player.sendMessage(green + "/sm changelog " + blue + "Displays Skeptermod's changelog");
        	player.sendMessage(green + "/smexplode " + blue + "Displays explosion commands");
        	player.sendMessage(green + "/smmob " + blue + "Displays mob commands");
        	player.sendMessage(green + "/smclear " + blue + "Clears all dropped items");
        	player.sendMessage(green + "/smlightning " + blue + "Creates lightning at that area");
        	player.sendMessage(green + "/smgive " + blue + "Gives Skeptermod items");
			}
    		
    		else if(args[0].equalsIgnoreCase("info"))
    		{
    			//Information
    		player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Information" + blue +"---");
    		player.sendMessage(blue + "Version: " + green + "[1.8]");
    		player.sendMessage(blue + "Author: " + green + "Skepter");
    		}
    		
    		else if(args[0].equalsIgnoreCase("changelog"))
    		{
    			//Changelog
    		player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Changelog" + "---");
    		player.sendMessage(green + "[1.0]");
    		player.sendMessage(blue + "Official release");
    		player.sendMessage(blue + "Added witherbow, firebow, megadiamond");
    		player.sendMessage(green + "[1.1]");
    		player.sendMessage(blue + "Reduced megadiamond's power:");
    		player.sendMessage(blue + "Removed explosion, ghast sound and flame effect");
    		player.sendMessage(blue + "Fixed megadiamond inventory bug");
    		player.sendMessage(green + "[1.2]");
    		player.sendMessage(blue + "Added The Sword of the Gods");
    		player.sendMessage(blue + "Named all recipes");
    		player.sendMessage(green + "[1.2.1]");
    		player.sendMessage(blue + "Added lightning effect and full health effect to Sword of the Gods when used");
    		player.sendMessage(green + "[1.3]");
    		player.sendMessage(blue + "Added Healing Sword");
    		player.sendMessage(green + "[1.3.1]");
    		player.sendMessage(blue + "Added /skeptermod command");
    		player.sendMessage(green + "[1.4]");
    		player.sendMessage(blue + "Added /smexplode command");
    		player.sendMessage(blue + "Added Warhammer");
    		player.sendMessage(green + "[1.4.1]");
    		player.sendMessage(blue + "Bug fixes");
    		player.sendMessage(green + "[1.4.2]");
    		player.sendMessage(blue + "Added permissions");
    		player.sendMessage(blue + "Added health gain when you kill mobs/players");
    		player.sendMessage(green + "[1.5 - command update]");
    		player.sendMessage(blue + "Mass code cleanup");
    		player.sendMessage(blue + "Added any value for /smexplode");
    		player.sendMessage(blue + "Added /smlightning command");
    		player.sendMessage(blue + "Added /smclear command");
    		player.sendMessage(blue + "Added Chaos emerald");
    		player.sendMessage(blue + "Improved Megadiamond: Now called 'Diamond of Destiny', easier to craft and has multiple powers");
    		player.sendMessage(green + "[1.6 - emerald update]");
    		player.sendMessage(blue + "Added Mobs");
    		player.sendMessage(blue + "Added /Skeptermod items command");
    		player.sendMessage(blue + "Added HyperSpeed Emerald, Lightning Emerald and Chimera Emerald");
    		player.sendMessage(blue + "Added /Skeptermod recipes help command");
    		player.sendMessage(green + "[1.7 - give update]");
    		player.sendMessage(blue + "Added /sm Give command to give items");
    		player.sendMessage(blue + "Fixed bug regarding to bows not being able to fire");
    		player.sendMessage(green + "[1.7.1]");
    		player.sendMessage(blue + "Fixed /smgive command");
    		player.sendMessage(green + "[1.7.2]");
    		player.sendMessage(blue + "Increased HyperSpeedChaos Emerald to 5 seconds instead of 1");
    		player.sendMessage(blue + "Tweaked Chaos Emerald Recipe for easier use");
    		player.sendMessage(green + "[1.7.3]");
    		player.sendMessage(blue + "Added Potato Skeleton mob");
    		player.sendMessage(blue + "Fixed bug where mobs spawn in the ground");
    		player.sendMessage(green + "[1.7.4]");
    		player.sendMessage(blue + "Allowed user to spawn multiple mobs by adding a number");
    		player.sendMessage(blue + "Fixed coloring bug");
    		player.sendMessage(green + "[1.7.5]");
    		player.sendMessage(blue + "Ajusted /smlightning command to spawn your defined amount of bolts");
    		player.sendMessage(blue + "Tweaked limits on mob and lightning amounts");
    		player.sendMessage(blue + "Ajusted recipes for bows");
    		player.sendMessage(blue + "Allowed user to give a certain amount of items with /smgive");
    		player.sendMessage(blue + "Ajusted /sm recipe command to /smrecipe");
    		player.sendMessage(green + "[1.7.6]");
    		player.sendMessage(blue + "Fixed bug with /smgive command");
    		player.sendMessage(green + "[1.7.7]");
    		player.sendMessage(blue + "Added radius input for /smlightning command");
    		player.sendMessage(green + "[1.8]");
    		player.sendMessage(blue + "Added The Sword from Hell");
    		player.sendMessage(blue + "Godsword now extinguishes player from fire");
    		}
    		
    		else if(args[0].equalsIgnoreCase("items"))
    		{
    			//Item help
    		player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Item Help" + blue +"---");
    		player.sendMessage(green + "Witherbow " + blue + "Bow which fires wither heads");
    		player.sendMessage(green + "Firebow " + blue + "Bow which fires fireballs");
    		player.sendMessage(green + "Diamond of Destiny " + blue + "Diamond which has many features when you right click");
    		player.sendMessage(green + "Sword of the Gods " + blue + "Instant hit kill, regens health, strikes lightning");
    		player.sendMessage(green + "Healing Sword " + blue + "Sword which heals you when you right click");
    		player.sendMessage(green + "Warhammer " + blue + "Hammer which causes mass destruction and damage with right click");
    		player.sendMessage(green + "Chaos Emerald " + blue + "Activates Chaos mode when you right click with all 7");
    		player.sendMessage(green + "HyperSpeed Chaos Emerald " + blue + "Temporarily move 20 times faster when you right click");
    		player.sendMessage(green + "Chimera Chaos Emerald " + blue + "Teleports to where you look at when you right click");
    		player.sendMessage(green + "Lightning Chaos Emerald " + blue + "Creates 5 lightning strikes to where you look at when you right click");
    		player.sendMessage(green + "The Sword from Hell " + blue + "A sword weilding such power, has to have a disadvantage");
    		}
    		
    		}
		return true;
    		
    	}

}
	
