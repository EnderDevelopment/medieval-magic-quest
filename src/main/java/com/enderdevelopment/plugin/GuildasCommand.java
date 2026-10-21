package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuildasCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando só pode ser usado por jogadores.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Comandos de guildas disponíveis: /guildas criar <nome>, /guildas convidar <jogador>, /guildas listar");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "criar":
                if (args.length < 2) {
                    player.sendMessage("Use: /guildas criar <nome>");
                } else {
                    player.sendMessage("Tentando criar a guilda: " + args[1]);
                }
                break;
            case "convidar":
                if (args.length < 2) {
                    player.sendMessage("Use: /guildas convidar <jogador>");
                } else {
                    player.sendMessage("Tentando convidar o jogador: " + args[1]);
                }
                break;
            case "listar":
                player.sendMessage("Lista de guildas disponíveis.");
                break;
            default:
                player.sendMessage("Comando desconhecido. Use /guildas ajuda para ver os comandos disponíveis.");
        }
        return true;
    }
}