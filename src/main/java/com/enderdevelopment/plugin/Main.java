package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("RPGModpack ativado!");
        // Inicializar sistemas
        getCommand("rpg").setExecutor(new RPGCommand());
        getCommand("magia").setExecutor(new MagiaCommand());
        getCommand("habilidades").setExecutor(new HabilidadesCommand());
        getCommand("guildas").setExecutor(new GuildasCommand());
        getCommand("loja").setExecutor(new LojaCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("RPGModpack desativado!");
    }
}