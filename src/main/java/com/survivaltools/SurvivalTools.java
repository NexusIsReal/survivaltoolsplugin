package com.survivaltools;

import com.survivaltools.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class SurvivalTools extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("backpack").setExecutor(new BackpackCommand());
        getCommand("craft").setExecutor(new CraftCommand());
        getCommand("kit").setExecutor(new KitCommand());
        getCommand("repair").setExecutor(new RepairCommand());
        getCommand("trash").setExecutor(new TrashCommand());
    }
} 