package net.bless.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LoreCraft extends JavaPlugin implements Listener {
	public static LoreCraft plugin;
	public final Logger logger = this.getLogger();
    public static Map<Material, List<LoreItem>> itemMap = new HashMap<Material, List<LoreItem>>();
    public static Random rng = new Random();

	@Override
    public void onDisable() {
	}

	@Override
    public void onEnable() {
        plugin = this;
        Log.pluginName = this.getDescription().getName();
        Log.pluginVersion = this.getDescription().getVersion();
        Log.setConfigVerbosity(getConfig());

	    
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new CraftListener(), this);

		loadConfigs();
	}
		
	public void loadConfigs() {
	    // TODO/Idea: rather than a fixed list here you could loop through all files in 
	    // the LoreCraft/configs folder and if they match a material load the file
	    
        List<String> prefixes = new ArrayList<String>(Arrays.asList("Leather", "Iron", "Gold", "Diamond", "Chain"));
	    List<String> bases = new ArrayList<String>(Arrays.asList("Boot", "Chestplate", "Helmet", "Leggings"));

	    // TODO: fix configs for all other armors based on leatherleggings.yml
	    
	    // loop through prefix & suffix to make LeatherBoot, LeatherChestplate, etc...
	    for (String prefix : prefixes) {
	        for (String base : bases) {
	            // Get the relevant material
	            Material mat = Material.getMaterial(prefix.toUpperCase() + (base.isEmpty()?"":"_") + base.toUpperCase());
                Log.normal("Attempting to load material: "+prefix.toUpperCase() + (base.isEmpty()?"":"_") + base.toUpperCase());
	            if (mat == null) {
	                // show an error message to console here if material not found
	            } else {
	                // load the config
	                List<LoreItem> list = LoreItem.loadConfig(mat, "Armor/");
	                if (list != null) itemMap.put(mat, list);
	            }
	        }
	    }
	    
	    // bow
	    // Get the relevant material
	    itemMap.put(Material.BOW, LoreItem.loadConfig(Material.BOW, "Weapons/"));

	    // Swords
	    prefixes = new ArrayList<String>(Arrays.asList("Wood", "Stone", "Iron", "Gold", "Diamond"));
	    bases = new ArrayList<String>(Arrays.asList("Sword"));

        
        // loop through prefix & suffix to make LeatherBoot, LeatherChestplate, etc...
        for (String prefix : prefixes) {
            for (String base : bases) {
                // Get the relevant material
                Material mat = Material.getMaterial(prefix.toUpperCase() + (base.isEmpty()?"":"_") + base.toUpperCase());
                Log.normal("Attempting to load material: "+prefix.toUpperCase() + (base.isEmpty()?"":"_") + base.toUpperCase());
                if (mat == null) {
                    // show an error message to console here if material not found
                } else {
                    // load the config
                    List<LoreItem> list = LoreItem.loadConfig(mat, "Weapons/");
                    if (list != null) itemMap.put(mat, list);
                }
            }
        }
        
	}
}
