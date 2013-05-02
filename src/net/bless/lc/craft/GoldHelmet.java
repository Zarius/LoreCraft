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

public class GoldHelmet implements Listener {
	LoreCraft plugin;
	public File goldhelmet;

	public GoldHelmet(LoreCraft instance) {
		plugin = instance;
		
	}

	@EventHandler
	public void onGoldHelmet(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack goldhelmet = new ItemStack(Material.GOLD_HELMET, 1);
			ItemMeta item = goldhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldhelmet.setItemMeta(item);
			event.getInventory().setResult(goldhelmet);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack goldhelmet = new ItemStack(Material.GOLD_HELMET, 1);
			ItemMeta item = goldhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldhelmet.setItemMeta(item);
			event.getInventory().setResult(goldhelmet);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack goldhelmet = new ItemStack(Material.GOLD_HELMET, 1);
			ItemMeta item = goldhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldhelmet.setItemMeta(item);
			event.getInventory().setResult(goldhelmet);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack goldhelmet = new ItemStack(Material.GOLD_HELMET, 1);
			ItemMeta item = goldhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldhelmet.setItemMeta(item);
			event.getInventory().setResult(goldhelmet);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack goldhelmet = new ItemStack(Material.GOLD_HELMET, 1);
			ItemMeta item = goldhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmettwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmettwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmettwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldhelmet.setItemMeta(item);
			event.getInventory().setResult(goldhelmet);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack goldhelmet = new ItemStack(Material.GOLD_HELMET, 1);
			ItemMeta item = goldhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldHelmetone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldhelmet.setItemMeta(item);
			event.getInventory().setResult(goldhelmet);
		}
	}
}
