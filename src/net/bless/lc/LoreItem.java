package net.bless.lc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;

public class LoreItem {
    // shouldn't be all public but I'm being lazy :D
    public String name;
    public List<String> lore = new ArrayList<String>();
    public Double weight;
    
    
    /**
     * @param mat
     * @param filename
     */
    static List<LoreItem> loadConfig(Material mat, String folder) {
        String filename = folder+(mat.toString().toLowerCase().replace("_", ""))+".yml";
        File myFile = new File(LoreCraft.plugin.getDataFolder(), filename);
        if (!myFile.exists()) return null;
        YamlConfiguration config = YamlConfiguration.loadConfiguration(myFile);
        if (config == null) return null;
        
        Log.normal("Loading config for "+filename);
        
        List<LoreItem> itemList = LoreCraft.itemMap.get(mat);
        if (itemList == null) itemList = new ArrayList<LoreItem>();
        
        for (String key: config.getKeys(false)) {
            Log.normal("Loading key "+key);
            LoreItem item = new LoreItem();
            item.name = ChatColor.translateAlternateColorCodes('&', config.getString(key+".name", ""));

            List<String> tempLore = config.getStringList(key+".lore");
            if (tempLore == null) {
                // support strings too - FIXME: not currently working, lore must be in brackets for now
                String loreLine = config.getString(key+".lore");
                tempLore = new ArrayList<String>();
                if (loreLine != null) {
                    tempLore.add(loreLine);
                }
            }
            for (String loreLine : tempLore) {
                item.lore.add(ChatColor.translateAlternateColorCodes('&', loreLine));
            }
            
            Object weight = config.get(key+".weight");
            if (weight == null) {
                weight = config.get(key+".chance");
            }
            if (weight instanceof String) {
                item.weight = Double.valueOf((String) weight);
            } else if (weight instanceof Double) {
                item.weight = (Double) weight;
            } else if (weight instanceof Integer) {
                item.weight = Double.valueOf(((Integer) weight).toString());
            } else {
                Log.normal("Weight is a different type!");
                item.weight = 0.0;
            }
            
            itemList.add(item);
            
            Log.normal("loaded item: "+item.name + item.lore.toString() + item.weight);
        }
        
        return itemList;
    }
}
