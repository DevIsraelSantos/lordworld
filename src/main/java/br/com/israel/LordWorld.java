package br.com.israel;

import org.bukkit.plugin.java.JavaPlugin;

import br.com.israel.commands.LordWorldCommand;
import br.com.israel.commands.PingCommand;
import br.com.israel.services.MessageService;

public class LordWorld extends JavaPlugin {

    private MessageService messageService;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        registerServices();
        registerCommands();
        registerListeners();

        getLogger().info("Plugin iniciado!");
    }

    private void registerServices() {
        this.messageService = new MessageService();

    }

    private void registerCommands() {
        PingCommand.register(this);
        LordWorldCommand.register(this);

    }

    private void registerListeners() {
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin desligado!");
    }

    public MessageService getMessageService() {
        return this.messageService;
    }
}
