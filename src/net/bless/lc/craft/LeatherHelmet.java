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

public class LeatherHelmet implements Listener {
	LoreCraft plugin;
	public File leatherhelmet;

	public LeatherHelmet(LoreCraft instance) {
		plugin = instance;
		
	}

	@EventHandler
	public void onLeatherHelmet(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
			ItemMeta item = leatherhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherhelmet.setItemMeta(item);
			event.getInventory().setResult(leatherhelmet);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
			ItemMeta item = leatherhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherhelmet.setItemMeta(item);
			event.getInventory().setResult(leatherhelmet);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
			ItemMeta item = leatherhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherhelmet.setItemMeta(item);
			event.getInventory().setResult(leatherhelmet);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
			ItemMeta item = leatherhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherhelmet.setItemMeta(item);
			event.getInventory().setResult(leatherhelmet);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
			ItemMeta item = leatherhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmettwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmettwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmettwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherhelmet.setItemMeta(item);
			event.getInventory().setResult(leatherhelmet);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
			ItemMeta item = leatherhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherHelmetone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherhelmet.setItemMeta(item);
			event.getInventory().setResult(leatherhelmet);
		}
	}
}
