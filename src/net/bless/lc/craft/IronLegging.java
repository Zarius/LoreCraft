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

public class IronLegging implements Listener {
	LoreCraft plugin;
	public File ironlegging;

	public IronLegging(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onIronLegging(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack ironlegging = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta item = ironlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironlegging.setItemMeta(item);
			event.getInventory().setResult(ironlegging);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack ironlegging = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta item = ironlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironlegging.setItemMeta(item);
			event.getInventory().setResult(ironlegging);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack ironlegging = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta item = ironlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironlegging.setItemMeta(item);
			event.getInventory().setResult(ironlegging);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack ironlegging = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta item = ironlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironlegging.setItemMeta(item);
			event.getInventory().setResult(ironlegging);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack ironlegging = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta item = ironlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingtwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingtwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingtwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironlegging.setItemMeta(item);
			event.getInventory().setResult(ironlegging);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack ironlegging = new ItemStack(Material.IRON_LEGGINGS, 1);
			ItemMeta item = ironlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronLeggingone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironlegging.setItemMeta(item);
			event.getInventory().setResult(ironlegging);
		}
	}
}
