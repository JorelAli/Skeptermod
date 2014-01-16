package com.droppages.Skepter.Main;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.droppages.Skepter.Commands.ClearCommand;
import com.droppages.Skepter.Commands.ClearxCommand;
import com.droppages.Skepter.Commands.ExplodeCommand;
import com.droppages.Skepter.Commands.GiveCommand;
import com.droppages.Skepter.Commands.LightningCommand;
import com.droppages.Skepter.Commands.MobCommand;
import com.droppages.Skepter.Commands.RecipeCommand;
import com.droppages.Skepter.Commands.SkeptermodCommand;
import com.droppages.Skepter.Listeners.ChaosChimeraListener;
import com.droppages.Skepter.Listeners.ChaosEmeraldListener;
import com.droppages.Skepter.Listeners.ChaosLightningListener;
import com.droppages.Skepter.Listeners.ChaosSpeedListener;
import com.droppages.Skepter.Listeners.DestinyDiamondListener;
import com.droppages.Skepter.Listeners.FireBowListener;
import com.droppages.Skepter.Listeners.GodswordListener;
import com.droppages.Skepter.Listeners.HealingswordListener;
import com.droppages.Skepter.Listeners.HellSwordListener;
import com.droppages.Skepter.Listeners.SkepterListener;
import com.droppages.Skepter.Listeners.WarhammerListener;
import com.droppages.Skepter.Listeners.WitherBowListener;


public class Skeptermod extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");

	public void onEnable() {
		PluginDescriptionFile description = this.getDescription();
		log = getLogger();
		// Item Listeners
		new WitherBowListener(this);
		new FireBowListener(this);
		new DestinyDiamondListener(this);
		new GodswordListener(this);
		new HealingswordListener(this);
		new WarhammerListener(this);
		new ChaosEmeraldListener(this);
		new ChaosSpeedListener(this);
		new ChaosChimeraListener(this);
		new ChaosLightningListener(this);
		new HellSwordListener(this);
		new SkepterListener(this);
		// Commands
		getCommand("skeptermod").setExecutor(new SkeptermodCommand(this));
		getCommand("smexplode").setExecutor(new ExplodeCommand(this));
		getCommand("smlightning").setExecutor(new LightningCommand(this));
		getCommand("smclear").setExecutor(new ClearCommand(this));
		getCommand("smclearx").setExecutor(new ClearxCommand(this));
		getCommand("smmob").setExecutor(new MobCommand(this));
		getCommand("smgive").setExecutor(new GiveCommand(this));
		getCommand("smrecipe").setExecutor(new RecipeCommand(this));
		Recipes();
		log.info("Skeptermod " + description.getVersion() + " activated!");
	}

	public void onDisable() {
		PluginDescriptionFile description = this.getDescription();
		log.info("Skeptermod " + description.getVersion() + " de-activated!");
	}

	public void Recipes() {
		// Wither bow
		ItemStack witherbow = new ItemStack(Material.BOW, 1);
		witherbow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 10);
		ItemMeta im = witherbow.getItemMeta();
		im.setDisplayName("Witherbow");
		witherbow.setItemMeta(im);
		ShapedRecipe recipewither = new ShapedRecipe(witherbow);
		recipewither.shape(new String[] { "SB ", "STB", "SB " });
		recipewither.setIngredient('S', Material.STRING);
		recipewither.setIngredient('T', Material.SOUL_SAND);
		recipewither.setIngredient('B', Material.STICK);
		getServer().addRecipe(recipewither);

		// Fire ball bow
		ItemStack firebow = new ItemStack(Material.BOW, 1);
		firebow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 9);
		// because there are different "im's", they have to each (per recipe)
		// have a different number
		ItemMeta im1 = firebow.getItemMeta(); // Get the metadata from the
												// firebow item
		im1.setDisplayName("Firebow"); // Set the firebow's display name to
										// 'firebow'
		firebow.setItemMeta(im1); // Add a new metadata which is 'displayname =
									// Firebow'
		ShapedRecipe recipefirebow = new ShapedRecipe(firebow);
		recipefirebow.shape(new String[] { "SB ", "SFB", "SB " });
		recipefirebow.setIngredient('S', Material.STRING);
		recipefirebow.setIngredient('F', Material.FIREBALL);
		recipefirebow.setIngredient('B', Material.STICK);
		getServer().addRecipe(recipefirebow);

		// Destiny Diamond
		ItemStack destinydiamond = new ItemStack(Material.DIAMOND, 1);
		destinydiamond.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 11);
		ItemMeta im2 = destinydiamond.getItemMeta();
		im2.setDisplayName("Diamond of Destiny");
		destinydiamond.setItemMeta(im2);
		ShapedRecipe recipedestinydiamond = new ShapedRecipe(destinydiamond);
		recipedestinydiamond.shape(new String[] { "DDD", "DED", "DDD" });
		recipedestinydiamond.setIngredient('D', Material.DIAMOND);
		recipedestinydiamond.setIngredient('E', Material.ENDER_PEARL);
		getServer().addRecipe(recipedestinydiamond);

		// Sword of the gods
		ItemStack godsword = new ItemStack(Material.IRON_SWORD, 1);
		godsword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 16960);
		ItemMeta im3 = godsword.getItemMeta();
		im3.setDisplayName("The Sword of the Gods");
		godsword.setItemMeta(im3);
		ShapedRecipe recipegodsword = new ShapedRecipe(godsword);
		recipegodsword.shape(new String[] { "DND", "NSN", "DND" });
		recipegodsword.setIngredient('D', Material.DIAMOND);
		recipegodsword.setIngredient('N', Material.NETHER_STAR);
		recipegodsword.setIngredient('S', Material.IRON_SWORD);
		getServer().addRecipe(recipegodsword);

		// HealingSword
		ItemStack healingsword = new ItemStack(Material.DIAMOND_SWORD, 1);
		healingsword.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		ItemMeta im4 = healingsword.getItemMeta();
		im4.setDisplayName("Healing Sword");
		healingsword.setItemMeta(im4);
		ShapedRecipe recipehealingsword = new ShapedRecipe(healingsword);
		recipehealingsword.shape(new String[] { "GGG", "GSG", "GGG" });
		recipehealingsword.setIngredient('G', Material.SPECKLED_MELON);
		recipehealingsword.setIngredient('S', Material.DIAMOND_SWORD);
		getServer().addRecipe(recipehealingsword);

		// WarHammer
		ItemStack warhammer = new ItemStack(Material.GOLD_AXE, 1);
		warhammer.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 1);
		ItemMeta im5 = warhammer.getItemMeta();
		im5.setDisplayName("War Hammer");
		warhammer.setItemMeta(im5);
		ShapedRecipe recipewarhammer = new ShapedRecipe(warhammer);
		recipewarhammer.shape(new String[] { "GGG", "GPG", " P " });
		recipewarhammer.setIngredient('G', Material.GOLD_BLOCK);
		recipewarhammer.setIngredient('P', Material.BLAZE_ROD);
		getServer().addRecipe(recipewarhammer);

		// cemerald
		ItemStack cemerald = new ItemStack(Material.EMERALD, 1);
		cemerald.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
		ItemMeta im6 = cemerald.getItemMeta();
		im6.setDisplayName("Chaos Emerald");
		cemerald.setItemMeta(im6);
		ShapedRecipe recipecemerald = new ShapedRecipe(cemerald);
		recipecemerald.shape(new String[] { " E ", "EDE", " E " });
		recipecemerald.setIngredient('D', Material.DIAMOND_BLOCK);
		recipecemerald.setIngredient('E', Material.EMERALD);
		getServer().addRecipe(recipecemerald);

		// chaos Speed
		ItemStack cSpeed = new ItemStack(Material.EMERALD, 1);
		cSpeed.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 9);
		ItemMeta im7 = cSpeed.getItemMeta();
		im7.setDisplayName("HyperSpeed Chaos Emerald");
		cSpeed.setItemMeta(im7);
		ShapedRecipe recipecSpeed = new ShapedRecipe(cSpeed);
		recipecSpeed.shape(new String[] { " E ", "ESE", " E " });
		recipecSpeed.setIngredient('S', Material.SUGAR);
		recipecSpeed.setIngredient('E', Material.EMERALD);
		getServer().addRecipe(recipecSpeed);

		// chaos chimera
		ItemStack cchimera = new ItemStack(Material.EMERALD, 1);
		cchimera.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 8);
		ItemMeta im8 = cchimera.getItemMeta();
		im8.setDisplayName("Chimera Chaos Emerald");
		cchimera.setItemMeta(im8);
		ShapedRecipe recipecchimera = new ShapedRecipe(cchimera);
		recipecchimera.shape(new String[] { " E ", "EFE", " E " });
		recipecchimera.setIngredient('F', Material.FEATHER);
		recipecchimera.setIngredient('E', Material.EMERALD);
		getServer().addRecipe(recipecchimera);

		// chaos lightning
		ItemStack clightning = new ItemStack(Material.EMERALD, 1);
		clightning.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 7);
		ItemMeta im9 = clightning.getItemMeta();
		im9.setDisplayName("Lightning Chaos Emerald");
		clightning.setItemMeta(im9);
		ShapedRecipe recipeclightning = new ShapedRecipe(clightning);
		recipeclightning.shape(new String[] { " E ", "EIE", " E " });
		recipeclightning.setIngredient('I', Material.IRON_INGOT);
		recipeclightning.setIngredient('E', Material.EMERALD);
		getServer().addRecipe(recipeclightning);

		// hellsword
		ItemStack hellsword = new ItemStack(Material.STONE_SWORD, 1);
		hellsword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 16960);
		ItemMeta im10 = hellsword.getItemMeta();
		im10.setDisplayName("The Sword from Hell");
		hellsword.setItemMeta(im10);
		ShapedRecipe recipehellsword = new ShapedRecipe(hellsword);
		recipehellsword.shape(new String[] { " B ", "LCL", "NCN" });
		recipehellsword.setIngredient('B', Material.BLAZE_ROD);
		recipehellsword.setIngredient('L', Material.LAVA_BUCKET);
		recipehellsword.setIngredient('C', Material.COBBLESTONE);
		recipehellsword.setIngredient('N', Material.NETHERRACK);
		getServer().addRecipe(recipehellsword);
	}
}
