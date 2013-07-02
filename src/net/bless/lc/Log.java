// Log.java - Bukkit Plugin Logger Wrapper
// Copyright (C) 2012 Zarius Tularial
//
// This file released under Evil Software License v1.1
// <http://fredrikvold.info/ESL.htm>

package net.bless.lc;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class Log {
    // Place these in your plugins onEnable:
    //      pluginName = this.getDescription().getName();
    //      pluginVersion = this.getDescription().getVersion();

    private final int version = 20130702;
    public static Logger log;
    public Verbosity verbosity = Verbosity.NORMAL;
    public String pluginName = "";
    public String pluginVersion = "";
    ConsoleCommandSender console;

    public Log(final Plugin plugin) {
        if (plugin == null) {
            pluginName = "Testing";
            pluginVersion = "1.test";
            this.log = Logger.getLogger(pluginName);
        } else {
            this.log = plugin.getLogger();
            this.pluginName = plugin.getDescription().getName();
            this.pluginVersion = plugin.getDescription().getVersion();

            console = Bukkit.getServer().getConsoleSender();
            setConfigVerbosity(plugin.getConfig());
        }
    }

    // LogInfo & LogWarning - if given a level will report the message
    // only for that level & above
    public void logInfo(final String msg, final Verbosity level) {
        if (verbosity.exceeds(level)) {
            //if (OtherDropsConfig.gColorLogMessages) {
                ChatColor col = ChatColor.GREEN;
                switch (level) {
                case EXTREME:
                    col = ChatColor.GOLD;
                    break;
                case HIGHEST:
                    col = ChatColor.YELLOW;
                    break;
                case HIGH:
                    col = ChatColor.AQUA;
                    break;
                case NORMAL:
                    col = null;
                    break;
                case LOW:
                    col = ChatColor.GRAY;
                    break;
                default:
                    break;
                }
                sendMessage(msg, col);
        }
    }

    /**
     * @param msg
     * @param col
     */
    public void sendMessage(final String msg, final ChatColor col) {
        if (console == null) {
            log.info("["+pluginName+":"+pluginVersion+"] "+msg);
        } else {
            console.sendMessage((col==null?"":col) + "[" + pluginName + ":"
                    + pluginVersion + "] " + (col==null?"":ChatColor.RESET)
                    + msg);
        }
    }

    /**
     * logWarning - display a warning log message with a standard prefix
     * 
     * @param msg Message to be displayed
     */
    void logWarning(String msg) {
        log.warning("["+pluginName+":"+pluginVersion+"] "+msg);
    }


    public void warning(String msg) {
        logWarning(msg);
    }

    public void low(String msg) {
        if (verbosity.exceeds(Verbosity.LOW)) logInfo(msg, Verbosity.LOW);
    }

    public void normal(String msg) {
        if (verbosity.exceeds(Verbosity.NORMAL)) logInfo(msg, Verbosity.NORMAL);
    }

    public void high(String msg) {
        if (verbosity.exceeds(Verbosity.HIGH)) logInfo(msg, Verbosity.HIGH);
    }

    public void highest(String msg) {
        if (verbosity.exceeds(Verbosity.HIGHEST)) logInfo(msg, Verbosity.HIGHEST);
    }

    public void extreme(String msg) {
        if (verbosity.exceeds(Verbosity.EXTREME)) logInfo(msg, Verbosity.EXTREME);
    }

    // TODO: This is only for temporary debug purposes.
    public void stackTrace() {
        if(verbosity.exceeds(Verbosity.EXTREME)) Thread.dumpStack();
    }

    /**
     * dMsg - used for debug messages that are expected to be removed before
     * distribution
     * 
     * @param msg
     */
    public void dMsg(String msg) {
        // Deliberately doesn't check gColorLogMessage as I want these messages
        // to stand out in case they
        // are left in by accident
        if (verbosity.exceeds(Verbosity.HIGHEST))
            console.sendMessage(ChatColor.RED + "[" + pluginName
                    + ":" + pluginVersion + "] " + ChatColor.RESET
                    + msg);

    }
    
    public enum Verbosity {
        LOW(1), NORMAL(2), HIGH(3), HIGHEST(4), EXTREME(5);
        private final int level;
        
        private Verbosity(int lvl) {
            level = lvl;
        }
        
        public boolean exceeds(Verbosity other) {
            return (level >= other.level);
        }
    }

    private final void setConfigVerbosity(FileConfiguration config) {
        if (config == null) verbosity = Verbosity.NORMAL;
        
        String verbosityString = config.getString("verbosity", "normal").toLowerCase();
        if(verbosityString.equals("low")) verbosity = Verbosity.LOW;
        else if(verbosityString.equals("high")) verbosity =  Verbosity.HIGH;
        else if(verbosityString.equals("highest")) verbosity =  Verbosity.HIGHEST;
        else if(verbosityString.equals("extreme")) verbosity =  Verbosity.EXTREME;
        else verbosity =  Verbosity.NORMAL;
    }

    public Verbosity getVerbosity() {
        return verbosity;
    }

}