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

public class ChainChestplate implements Listener {
	LoreCraft plugin;
	public File chainchestplate;

	public ChainChestplate(LoreCraft instance) {
	plugin = instance;
		
	}

	@EventHandler
	public void onChainChestplate(CraftItemEvent event) {
		Random random = new Random();
		int randomChance = plugin.getConfig().getInt("Over_All_Chance");;    //base %
		final int CRAFT_CHANCE = random.nextInt(randomChance);
		
		if (CRAFT_CHANCE <= 1) { // 1%
			
			
			ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta item = chainchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatesix.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatesix.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatesix.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatesix.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatesix.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatesix.lore5").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			chainchestplate.setItemMeta(item);
			event.getInventory().setResult(chainchestplate);
			
		} else if (CRAFT_CHANCE <= 10) { //10%
			
			ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta item = chainchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefive.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefive.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefive.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefive.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefive.lore4").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			chainchestplate.setItemMeta(item);
			event.getInventory().setResult(chainchestplate);
			
		} else if (CRAFT_CHANCE <= 20) { //20%
			
			ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta item = chainchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefour.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefour.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefour.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatefour.lore3").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			chainchestplate.setItemMeta(item);
			event.getInventory().setResult(chainchestplate);
			
		} else if (CRAFT_CHANCE <= 40) { //40%
			
			ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta item = chainchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatethree.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatethree.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatethree.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			chainchestplate.setItemMeta(item);
			event.getInventory().setResult(chainchestplate);
			
		} else if (CRAFT_CHANCE <= 60) { //60%
			
			ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta item = chainchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatetwo.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatetwo.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplatetwo.lore2").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			chainchestplate.setItemMeta(item);
			event.getInventory().setResult(chainchestplate);
			
		} else if (CRAFT_CHANCE <= 99) { //99%
			
			ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta item = chainchestplate.getItemMeta();
			item.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplateone.name").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ChainChestplateone.lore1").replaceAll("(&([a-f0-9]))", "\u00A7$2")));
			item.setLore(lore);
			chainchestplate.setItemMeta(item);
			event.getInventory().setResult(chainchestplate);
		}
	}
}
