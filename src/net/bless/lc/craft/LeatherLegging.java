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

public class LeatherLegging implements Listener {
	LoreCraft plugin;
	public File leatherlegging;

	public LeatherLegging(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onLeatherLegging(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack leatherlegging = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherlegging.setItemMeta(item);
			event.getInventory().setResult(leatherlegging);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack leatherlegging = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherlegging.setItemMeta(item);
			event.getInventory().setResult(leatherlegging);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack leatherlegging = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherlegging.setItemMeta(item);
			event.getInventory().setResult(leatherlegging);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack leatherlegging = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherlegging.setItemMeta(item);
			event.getInventory().setResult(leatherlegging);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack leatherlegging = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingtwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingtwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingtwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherlegging.setItemMeta(item);
			event.getInventory().setResult(leatherlegging);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack leatherlegging = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherLeggingone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherlegging.setItemMeta(item);
			event.getInventory().setResult(leatherlegging);
		}
	}
}
