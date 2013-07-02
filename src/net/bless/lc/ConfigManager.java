package net.bless.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;

public class ConfigManager {

    private LoreCraft loreCraft;

    public ConfigManager(LoreCraft loreCraft) {
        this.loreCraft = loreCraft;
    }

    public boolean loadConfigs() {
        LoreCraft.itemMap.clear();
        // TODO/Idea: rather than a fixed list here you could loop through all files in 
        // the LoreCraft/configs folder and if they match a material load the file
        // TODO: fix configs for all other armors based on leatherleggings.yml
        
        List<String> prefixes = new ArrayList<String>(Arrays.asList("Leather", "Iron", "Gold", "Diamond", "Chainmail"));
        List<String> bases = new ArrayList<String>(Arrays.asList("Boots", "Chestplate", "Helmet", "Leggings"));
        loadItem(prefixes, bases, "Armor/");
        
        // bow
        // Get the relevant material
        LoreCraft.itemMap.put(Material.BOW, LoreItem.loadConfig(Material.BOW, "Weapons/"));
    
        prefixes = new ArrayList<String>(Arrays.asList("Wood", "Stone", "Iron", "Gold", "Diamond"));
        bases = new ArrayList<String>(Arrays.asList("Sword"));
        loadItem(prefixes, bases, "Weapons/");
    
        prefixes = new ArrayList<String>(Arrays.asList("Wood", "Stone", "Iron", "Gold", "Diamond"));
        bases = new ArrayList<String>(Arrays.asList("Axe", "Pickaxe", "Spade", "Hoe"));
        loadItem(prefixes, bases, "Tools/");

        return true;        
    }

    public void loadItem(List<String> prefixes, List<String> bases, String folder) {
        // loop through prefix & suffix to make LeatherBoot, LeatherChestplate, etc...
        for (String prefix : prefixes) {
            for (String base : bases) {
                // Get the relevant material
                Material mat = Material.getMaterial(prefix.toUpperCase() + (base.isEmpty()?"":"_") + base.toUpperCase());
                if (mat == null) {
                    loreCraft.log.high("Failed to load material: "+prefix.toUpperCase() + (base.isEmpty()?"":"_") + base.toUpperCase());
                } else {
                    // load the config
                    LoreCraft.itemMap.put(mat, LoreItem.loadConfig(mat, folder));
                    loreCraft.log.high("Loaded material: "+prefix.toUpperCase() + (base.isEmpty()?"":"_") + base.toUpperCase());
                }
            }
        }
    }

}
