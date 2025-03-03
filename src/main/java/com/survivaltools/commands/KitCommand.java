package com.survivaltools.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;
        ItemStack[] items = {
            new ItemStack(Material.STONE_SWORD),
            new ItemStack(Material.STONE_PICKAXE),
            new ItemStack(Material.STONE_AXE),
            new ItemStack(Material.STONE_SHOVEL),
            new ItemStack(Material.BREAD, 16),
            new ItemStack(Material.TORCH, 16)
        };

        for (ItemStack item : items) {
            player.getInventory().addItem(item);
        }
        return true;
    }
} 