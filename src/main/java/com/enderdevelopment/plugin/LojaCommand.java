package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LojaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando só pode ser usado por jogadores.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Comandos de loja disponíveis: /loja comprar <item>, /loja vender <item>, /loja listar");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "comprar":
                if (args.length < 2) {
                    player.sendMessage("Use: /loja comprar <item>");
                } else {
                    player.sendMessage("Tentando comprar o item: " + args[1]);
                }
                break;
            case "vender":
                if (args.length < 2) {
                    player.sendMessage("Use: /loja vender <item>");
                } else {
                    player.sendMessage("Tentando vender o item: " + args[1]);
                }
                break;
            case "listar":
                player.sendMessage("Lista de itens disponíveis na loja.");
                break;
            default:
                player.sendMessage("Comando desconhecido. Use /loja ajuda para ver os comandos disponíveis.");
        }
        return true;
    }
}