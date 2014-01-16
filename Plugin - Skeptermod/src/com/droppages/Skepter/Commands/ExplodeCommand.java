package com.droppages.Skepter.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.droppages.Skepter.Main.Skeptermod;

public class ExplodeCommand implements CommandExecutor{
	
	public ExplodeCommand(Skeptermod plugin) {
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
    	Player player = (Player)sender;
    	ChatColor blue = ChatColor.AQUA;
    	ChatColor gold = ChatColor.GOLD;
    	ChatColor green = ChatColor.GREEN;
    	if(player.hasPermission("skeptermod.usecommand.smexplode") || (player.isOp()));
    	{
    	if(command.getName().equalsIgnoreCase("smexplode"));
    	{
    		if(args.length == 0 || args[0].equalsIgnoreCase("help"))
    		{
    			player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Explode help" + blue + "---");
    			player.sendMessage(blue + "Usage: " + green + "/smexplode <number>");
    			player.sendMessage(blue + "Example: " + green + "/smexplode 10");
    		}
    		
    		else
    		{
    			player.getWorld().createExplosion(player.getLocation(), Float.parseFloat(args[0])); 		
    		}
    		
    		/*else if(args[0].equals("normal") || args[0].equals("4"))
    		{
    			player.getWorld().createExplosion(player.getLocation(), 4.0F); 		
    		}
    		
    		else if(args[0].equalsIgnoreCase("large") || args[0].equals("6"))
    		{
        		player.getWorld().createExplosion(player.getLocation(), 6.0F);
    		}
    		
    		else if(args[0].equalsIgnoreCase("massive") || args[0].equals("10"))
    		{
        		player.getWorld().createExplosion(player.getLocation(), 10.0F);
    		}
    		
    		else if(args[0].equalsIgnoreCase("nuke") || args[0].equals("20"))
    		{
        		player.getWorld().createExplosion(player.getLocation(), 20.0F);
    		}
    		
    		else if(args[0].equalsIgnoreCase("obliterator") || args[0].equals("50"))
    		{
        		player.getWorld().createExplosion(player.getLocation(), 50.0F);
    		}
    		
    		else if(args[0].equalsIgnoreCase("sizes"))
    		{
    			player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Explosion sizes" + blue + "---");
        		player.sendMessage(blue + "mini (1), normal (4), large (6), massive (10), nuke (20), obliterator (50)");
        		player.sendMessage(green + "You can enter name or number - not both");
        		player.sendMessage(blue + "Example: " + green + "/smexplode massive");	
        		player.sendMessage(blue + "Example: " + green + "/smexplode 50");	
    		}*/
       		{
    		return true;
    		}
    	}
    }
}
}

    	
	
