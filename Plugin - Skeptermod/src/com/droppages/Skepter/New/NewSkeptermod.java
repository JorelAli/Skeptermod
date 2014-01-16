package com.droppages.Skepter.New;

import com.droppages.Skepter.Main.Skeptermod;

public class NewSkeptermod {

	public NewSkeptermod(Skeptermod plugin) {
		//yup. Register stuff here and commands & stuff yeah.
		plugin.getServer().getPluginManager().registerEvents(new SkepterListener(plugin), plugin);

	}
}
