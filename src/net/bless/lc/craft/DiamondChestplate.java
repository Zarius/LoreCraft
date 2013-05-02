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

public class DiamondChestplate implements Listener {
	LoreCraft plugin;
	public File diamondchestplate;

	public DiamondChestplate(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onDiamondChestplate(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack diamondchestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta item = diamondchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatesix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatesix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatesix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatesix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatesix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatesix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondchestplate.setItemMeta(item);
			event.getInventory().setResult(diamondchestplate);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack diamondchestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta item = diamondchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondchestplate.setItemMeta(item);
			event.getInventory().setResult(diamondchestplate);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack diamondchestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta item = diamondchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatefour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondchestplate.setItemMeta(item);
			event.getInventory().setResult(diamondchestplate);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack diamondchestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta item = diamondchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatethree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatethree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatethree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondchestplate.setItemMeta(item);
			event.getInventory().setResult(diamondchestplate);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack diamondchestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta item = diamondchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatetwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatetwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplatetwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondchestplate.setItemMeta(item);
			event.getInventory().setResult(diamondchestplate);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack diamondchestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemMeta item = diamondchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplateone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("DiamondChestplateone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			diamondchestplate.setItemMeta(item);
			event.getInventory().setResult(diamondchestplate);
		}
	}
}
