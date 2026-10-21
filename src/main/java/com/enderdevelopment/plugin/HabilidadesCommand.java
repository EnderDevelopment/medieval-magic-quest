package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HabilidadesCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando só pode ser usado por jogadores.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Comandos de habilidades disponíveis: /habilidades listar, /habilidades evoluir <habilidade>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "listar":
                player.sendMessage("Lista de habilidades disponíveis.");
                break;
            case "evoluir":
                if (args.length < 2) {
                    player.sendMessage("Use: /habilidades evoluir <habilidade>");
                } else {
                    player.sendMessage("Tentando evoluir a habilidade: " + args[1]);
                }
                break;
            default:
                player.sendMessage("Comando desconhecido. Use /habilidades ajuda para ver os comandos disponíveis.");
        }
        return true;
    }
}