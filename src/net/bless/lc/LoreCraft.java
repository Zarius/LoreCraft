package net.bless.lc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class LoreCraft extends JavaPlugin implements Listener {
	public static Log log;
	public static LoreCraft plugin;
	public static ConfigManager configManager;
    public static Random rng = new Random();
    public static Map<Material, List<LoreItem>> itemMap = new HashMap<Material, List<LoreItem>>();

	@Override
    public void onEnable() {
	    plugin = this;
	    log = new Log(this);
	    loadConfig();
        registerCommands();
		registerEvents();
	}

    public void loadConfig() {
        configManager = new ConfigManager(this);
        configManager.loadConfigs();
    }

	public void registerEvents() {
	    getServer().getPluginManager().registerEvents(new CraftListener(), this);
	}
	
	public void registerCommands() {
        getCommand("lorecraft").setExecutor(new CommandManager(this));
    }

    @Override
    public void onDisable() {
    }

}
