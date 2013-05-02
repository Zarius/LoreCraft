package net.bless.lc.craft;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import net.bless.lc.LoreCraft;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class IronBoot implements Listener {
	LoreCraft plugin;
	public File ironrboot;

	public IronBoot(LoreCraft instance) {
		plugin = instance;
		
	}

	@EventHandler
	public void onIronBoot(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack leatherboot = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta item = leatherboot.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherboot.setItemMeta(item);
			event.getInventory().setResult(leatherboot);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack leatherboot = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta item = leatherboot.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherboot.setItemMeta(item);
			event.getInventory().setResult(leatherboot);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack leatherboot = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta item = leatherboot.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherboot.setItemMeta(item);
			event.getInventory().setResult(leatherboot);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack leatherboot = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta item = leatherboot.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherboot.setItemMeta(item);
			event.getInventory().setResult(leatherboot);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack leatherboot = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta item = leatherboot.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBoottwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBoottwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBoottwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherboot.setItemMeta(item);
			event.getInventory().setResult(leatherboot);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack leatherboot = new ItemStack(Material.IRON_BOOTS, 1);
			ItemMeta item = leatherboot.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherBootone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherboot.setItemMeta(item);
			event.getInventory().setResult(leatherboot);
		}
	}
}

