package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RPGCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando só pode ser usado por jogadores.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Comandos disponíveis: /rpg info, /rpg ajuda");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "info":
                player.sendMessage("Informações sobre o RPGModpack.");
                break;
            case "ajuda":
                player.sendMessage("Ajuda sobre o RPGModpack.");
                break;
            default:
                player.sendMessage("Comando desconhecido. Use /rpg ajuda para ver os comandos disponíveis.");
        }
        return true;
    }
}