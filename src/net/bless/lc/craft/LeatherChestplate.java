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

public class LeatherChestplate implements Listener {
	LoreCraft plugin;
	public File leatherchestplate;

	public LeatherChestplate(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onLeatherChestplate(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack leatherchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatesix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatesix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatesix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatesix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatesix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatesix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherchestplate.setItemMeta(item);
			event.getInventory().setResult(leatherchestplate);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack leatherchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherchestplate.setItemMeta(item);
			event.getInventory().setResult(leatherchestplate);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack leatherchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatefour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherchestplate.setItemMeta(item);
			event.getInventory().setResult(leatherchestplate);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack leatherchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatethree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatethree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatethree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherchestplate.setItemMeta(item);
			event.getInventory().setResult(leatherchestplate);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack leatherchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatetwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatetwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplatetwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherchestplate.setItemMeta(item);
			event.getInventory().setResult(leatherchestplate);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack leatherchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			ItemMeta item = leatherchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplateone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("LeatherChestplateone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			leatherchestplate.setItemMeta(item);
			event.getInventory().setResult(leatherchestplate);
		}
	}
}
