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

public class GoldChestplate implements Listener {
	LoreCraft plugin;
	public File goldchestplate;

	public GoldChestplate(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onGoldChestplate(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack goldchestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
			ItemMeta item = goldchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatesix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatesix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatesix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatesix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatesix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatesix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldchestplate.setItemMeta(item);
			event.getInventory().setResult(goldchestplate);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack goldchestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
			ItemMeta item = goldchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldchestplate.setItemMeta(item);
			event.getInventory().setResult(goldchestplate);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack goldchestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
			ItemMeta item = goldchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatefour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldchestplate.setItemMeta(item);
			event.getInventory().setResult(goldchestplate);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack goldchestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
			ItemMeta item = goldchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatethree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatethree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatethree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldchestplate.setItemMeta(item);
			event.getInventory().setResult(goldchestplate);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack goldchestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
			ItemMeta item = goldchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatetwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatetwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplatetwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldchestplate.setItemMeta(item);
			event.getInventory().setResult(goldchestplate);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack goldchestplate = new ItemStack(Material.GOLD_CHESTPLATE, 1);
			ItemMeta item = goldchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplateone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GoldChestplateone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			goldchestplate.setItemMeta(item);
			event.getInventory().setResult(goldchestplate);
		}
	}
}
