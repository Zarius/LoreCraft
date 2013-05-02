package net.bless.lc;

import java.util.logging.Logger;
import net.bless.lc.craft.Bow;
import net.bless.lc.craft.ChainBoot;
import net.bless.lc.craft.ChainChestplate;
import net.bless.lc.craft.ChainHelmet;
import net.bless.lc.craft.ChainLegging;
import net.bless.lc.craft.DiamondBoot;
import net.bless.lc.craft.DiamondChestplate;
import net.bless.lc.craft.DiamondHelmet;
import net.bless.lc.craft.DiamondLegging;
import net.bless.lc.craft.DiamondSword;
import net.bless.lc.craft.GoldBoot;
import net.bless.lc.craft.GoldChestplate;
import net.bless.lc.craft.GoldHelmet;
import net.bless.lc.craft.GoldLegging;
import net.bless.lc.craft.GoldSword;
import net.bless.lc.craft.IronBoot;
import net.bless.lc.craft.IronChestplate;
import net.bless.lc.craft.IronHelmet;
import net.bless.lc.craft.IronLegging;
import net.bless.lc.craft.IronSword;
import net.bless.lc.craft.LeatherBoot;
import net.bless.lc.craft.LeatherChestplate;
import net.bless.lc.craft.LeatherHelmet;
import net.bless.lc.craft.LeatherLegging;
import net.bless.lc.craft.StoneSword;
import net.bless.lc.craft.WoodenSword;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LoreCraft extends JavaPlugin implements Listener {
	public static LoreCraft plugin;
	public final Logger logger = Logger.getLogger("MineCraft");

	public void onDisable() {

	}

	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(new WoodenSword(this), this);
		pm.registerEvents(new GoldSword(this), this);
		pm.registerEvents(new StoneSword(this), this);
		pm.registerEvents(new IronSword(this), this);
		pm.registerEvents(new DiamondSword(this), this);

		pm.registerEvents(new Bow(this), this);

		pm.registerEvents(new LeatherBoot(this), this);
		pm.registerEvents(new GoldBoot(this), this);
		pm.registerEvents(new ChainBoot(this), this);
		pm.registerEvents(new IronBoot(this), this);
		pm.registerEvents(new DiamondBoot(this), this);

		pm.registerEvents(new LeatherHelmet(this), this);
		pm.registerEvents(new GoldHelmet(this), this);
		pm.registerEvents(new ChainHelmet(this), this);
		pm.registerEvents(new IronHelmet(this), this);
		pm.registerEvents(new DiamondHelmet(this), this);

		pm.registerEvents(new LeatherChestplate(this), this);
		pm.registerEvents(new GoldChestplate(this), this);
		pm.registerEvents(new ChainChestplate(this), this);
		pm.registerEvents(new IronChestplate(this), this);
		pm.registerEvents(new DiamondChestplate(this), this);

		pm.registerEvents(new LeatherLegging(this), this);
		pm.registerEvents(new GoldLegging(this), this);
		pm.registerEvents(new ChainLegging(this), this);
		pm.registerEvents(new IronLegging(this), this);
		pm.registerEvents(new DiamondLegging(this), this);

	}
}
