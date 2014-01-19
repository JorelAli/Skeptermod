package com.droppages.Skepter.New;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class TabCompleteCommandTest implements TabCompleter {

	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {

		if(cmd.getName().equalsIgnoreCase("gmtabcompletetest")) {
			if(args.length == 0 || args.length == 1) {
				List<String> x = new ArrayList<String>();
				x.add("survival");
				x.add("creative");
				x.add("adventure");
				return x;
				//return TabCompletionHelper.getPossibleCompletionsForGivenArgs(args, new String[] {"survival", "creative", "adventure"});
			}

			if(args.length == 2) {
				return TabCompletionHelper.getPossibleCompletionsForGivenArgs(args, TabCompletionHelper.getOnlinePlayerNames());
			}
		}

		return null;
	}


}
