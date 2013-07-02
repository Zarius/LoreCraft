package net.bless.lc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandManager implements CommandExecutor {

    private LoreCraft parent;

    public CommandManager(LoreCraft loreCraft) {
        this.parent = loreCraft;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equalsIgnoreCase("reload")) {
            cmdReload(sender);
            return true;
        }
        return false;
    }

    private void cmdReload(CommandSender sender) {
        if (LoreCraft.configManager.loadConfigs()) {
            sender.sendMessage(ChatColor.GREEN+"[LoreCraft] Config reloaded.");
        } else {
            sender.sendMessage(ChatColor.RED+"[LoreCraft] Config reload failed.");
        }
    }

}
