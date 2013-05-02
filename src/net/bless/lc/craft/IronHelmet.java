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

public class IronHelmet implements Listener {
	LoreCraft plugin;
	public File ironhelmet;

	public IronHelmet(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onIronHelmet(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta item = ironhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetsix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetsix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetsix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetsix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetsix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetsix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironhelmet.setItemMeta(item);
			event.getInventory().setResult(ironhelmet);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta item = ironhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironhelmet.setItemMeta(item);
			event.getInventory().setResult(ironhelmet);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta item = ironhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetfour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironhelmet.setItemMeta(item);
			event.getInventory().setResult(ironhelmet);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta item = ironhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetthree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetthree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetthree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironhelmet.setItemMeta(item);
			event.getInventory().setResult(ironhelmet);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta item = ironhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmettwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmettwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmettwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironhelmet.setItemMeta(item);
			event.getInventory().setResult(ironhelmet);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
			ItemMeta item = ironhelmet.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("IronHelmetone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			ironhelmet.setItemMeta(item);
			event.getInventory().setResult(ironhelmet);
		}
	}
}
