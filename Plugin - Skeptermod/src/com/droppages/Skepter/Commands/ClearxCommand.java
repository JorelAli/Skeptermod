package com.droppages.Skepter.Commands;

import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;

import com.droppages.Skepter.Main.Skeptermod;

public class ClearxCommand implements CommandExecutor{
	
	public ClearxCommand(Skeptermod plugin) {
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
    	if(command.getName().equalsIgnoreCase("smclearx"));
    	{
    		if(args.length == 0)
    		{    	            
    			for(@SuppressWarnings("rawtypes")
				Iterator iterator1 = Bukkit.getServer().getWorlds().iterator(); iterator1.hasNext();)
    			{
    				World world = (World)iterator1.next();
    				for(@SuppressWarnings("rawtypes")
					Iterator iterator2 = world.getEntities().iterator(); iterator2.hasNext();)
    				{
    					Entity e = (Entity)iterator2.next();
    					if(e instanceof Item)
	                    {
    						e.remove();
    						
	                    }
    				}
    			}
    		}	
    	}
			return true;
    	}
    }
