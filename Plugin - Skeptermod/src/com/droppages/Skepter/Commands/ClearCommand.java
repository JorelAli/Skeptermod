package com.droppages.Skepter.Commands;

import java.util.Iterator;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.*;

import com.droppages.Skepter.Main.Skeptermod;

public class ClearCommand implements CommandExecutor {

	public ClearCommand(Skeptermod plugin) {
	}

	@SuppressWarnings("rawtypes")
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player player = (Player) sender;
		ChatColor blue = ChatColor.AQUA;
		ChatColor gold = ChatColor.GOLD;
		if (player.hasPermission("skeptermod.usecommand.smclear")
				|| (player.isOp())); {
			if (command.getName().equalsIgnoreCase("smclear")); {
				if (args.length == 0) {
					int i = 0;
					for (Iterator iterator1 = Bukkit.getServer().getWorlds()
							.iterator(); iterator1.hasNext();) {
						World world = (World) iterator1.next();
						for (Iterator iterator2 = world.getEntities()
								.iterator(); iterator2.hasNext();) {
							Entity e = (Entity) iterator2.next();
							if (e instanceof Item) {
								i++;
								e.remove();
							}
						}

					}
					player.sendMessage(gold + "[Skeptermod] " + blue
							+ "Removed " + i + " dropped items");
				}
			}
		}
		return true;
	}
}
