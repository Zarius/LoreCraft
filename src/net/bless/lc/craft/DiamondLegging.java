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

public class DiamondLegging implements Listener {
	LoreCraft plugin;
	public File diamondlegging;

	public DiamondLegging(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onDiamondLegging(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack diamondlegging = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta item = diamondlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondlegging.setItemMeta(item);
			event.getInventory().setResult(diamondlegging);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack diamondlegging = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta item = diamondlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondlegging.setItemMeta(item);
			event.getInventory().setResult(diamondlegging);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack diamondlegging = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta item = diamondlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondlegging.setItemMeta(item);
			event.getInventory().setResult(diamondlegging);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack diamondlegging = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta item = diamondlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondlegging.setItemMeta(item);
			event.getInventory().setResult(diamondlegging);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack diamondlegging = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta item = diamondlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingtwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingtwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingtwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondlegging.setItemMeta(item);
			event.getInventory().setResult(diamondlegging);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack diamondlegging = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemMeta item = diamondlegging.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondLeggingone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondlegging.setItemMeta(item);
			event.getInventory().setResult(diamondlegging);
		}
	}
}
