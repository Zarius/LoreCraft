package net.bless.lc;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftListener implements Listener {

    @EventHandler
    public void onCraftItem(CraftItemEvent event) {
        Log.normal("starting craft event for "+event.getInventory().getResult().toString());
        if (event.isCancelled()) {
            // ignore cancelled events
            return;
        }

        if (event.getCursor().getType() != Material.AIR) {
            // ignore - simple fix for non-stackable items
            return;
        }
        
        ItemStack result = event.getInventory().getResult();

        List<LoreItem> loreItemList = LoreCraft.itemMap.get(result.getType());
        if (loreItemList == null) {
            // no matching configs found
            return;
        }
        Log.normal("Matching config found - cursor: "+event.getCursor());

        // gather total weightings
        double totalWeight = 0;
        for (LoreItem item : loreItemList) {
            totalWeight += item.weight;
        }
        Log.normal("totalweight: "+totalWeight);

        // for each item, roll a dice and set values is success

        // current system:
        // <= 1 - lvl 6
        // <= 10 - lvl 5
        // <= 20 - lvl 4
        // <= 40 - lvl 3
        // <= 60 - lvl 2
        // <= 99 - lvl 1

        // "overallchance" = suggested 400, so lvl 1 chance is roughtly 1 in 4 (25%)
        
        // New system - via weightings
        double select = LoreCraft.rng.nextDouble() * totalWeight, cumul = 0;
        for (LoreItem item : loreItemList) {
            Log.normal("Checking "+item.name);

            cumul += item.weight;
            if (select <= cumul) {
                // do our thing
                Log.normal("setting: "+item.name);

                ItemMeta im = result.getItemMeta();
                im.setDisplayName(item.name);
                im.setLore(item.lore);
                result.setItemMeta(im);

                break;
            }
        }
    }
}
