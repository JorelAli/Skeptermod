package com.droppages.Skepter.Commands;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.droppages.Skepter.Main.Skeptermod;

public class LightningCommand implements CommandExecutor{
	
	public LightningCommand(Skeptermod plugin) {
	}

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
    	final Player player = (Player)sender;
    	ChatColor blue = ChatColor.AQUA;
    	ChatColor gold = ChatColor.GOLD;
    	ChatColor green = ChatColor.GREEN;    	
    	
    	if(player.hasPermission("skeptermod.usecommand.smlightning") || (player.isOp()));
    	{
    	if(command.getName().equalsIgnoreCase("smlightning"));
    	{
    		if(args.length == 0)
    		{
    			player.sendMessage(gold + "[Skeptermod] " + blue + "---" + green + "Lightning help" + blue + "---");
    			player.sendMessage(blue + "Usage: " + green + "/smlightning <amount of bolts>");
    			player.sendMessage(blue + "Usage: " + green + "/smlightning <amount of bolts> radius");
    			return true;
    		}
    		
    		else if(args.length == 1)
    		{
			int i;
			int n;
			n = Integer.parseInt(args[0]);
			if(n > 1000){
				player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number lower than 1000");
				return true;
						}
				for (i = 0; i < n; i++) {
					player.getWorld().strikeLightning(player.getTargetBlock(null, 256).getLocation());
				}
    		}
    		else if(args.length == 2)
    		{
    			int radius;
    			radius = Integer.parseInt(args[1]);
    			if(radius == 0 || radius < 0)
    			{
    				radius = 1;
    			}
    			int i;
    			int n;
    			n = Integer.parseInt(args[0]);
    			if(n > 1000){
    				player.sendMessage(gold + "[Skeptermod] " + blue + "Please enter a number lower than 1000");
    				return true;
    						}
    				for (i = 0; i < n; i++) {
    					Random random = new Random();
    					int distance = radius;
    			        int addX = random.nextBoolean() ? -random.nextInt(distance) : random.nextInt(distance);
    			        int addZ = random.nextBoolean() ? -random.nextInt(distance) : random.nextInt(distance);
    	    			Location loc = player.getTargetBlock(null, 256).getLocation().add(addX, 0.0D, addZ);
    	    			player.getWorld().strikeLightning(loc);
    		}
    	}
    }}
		return true;
}
}
    	
	
