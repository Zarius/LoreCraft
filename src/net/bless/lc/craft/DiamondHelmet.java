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

public class DiamondHelmet implements Listener {
	LoreCraft plugin;
	public File diamondhelmet;

	public DiamondHelmet(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onDiamondHelmet(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack diamondhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta item = diamondhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondhelmet.setItemMeta(item);
			event.getInventory().setResult(diamondhelmet);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack diamondhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta item = diamondhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondhelmet.setItemMeta(item);
			event.getInventory().setResult(diamondhelmet);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack diamondhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta item = diamondhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondhelmet.setItemMeta(item);
			event.getInventory().setResult(diamondhelmet);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack diamondhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta item = diamondhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondhelmet.setItemMeta(item);
			event.getInventory().setResult(diamondhelmet);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack diamondhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta item = diamondhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmettwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmettwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmettwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondhelmet.setItemMeta(item);
			event.getInventory().setResult(diamondhelmet);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack diamondhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemMeta item = diamondhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondHelmetone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondhelmet.setItemMeta(item);
			event.getInventory().setResult(diamondhelmet);
		}
	}
}
