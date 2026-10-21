package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MagiaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando só pode ser usado por jogadores.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Comandos de magia disponíveis: /magia listar, /magia aprender <feitiço>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "listar":
                player.sendMessage("Lista de feitiços disponíveis.");
                break;
            case "aprender":
                if (args.length < 2) {
                    player.sendMessage("Use: /magia aprender <feitiço>");
                } else {
                    player.sendMessage("Tentando aprender o feitiço: " + args[1]);
                }
                break;
            default:
                player.sendMessage("Comando desconhecido. Use /magia ajuda para ver os comandos disponíveis.");
        }
        return true;
    }
}