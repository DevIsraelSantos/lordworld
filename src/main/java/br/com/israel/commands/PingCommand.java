package br.com.israel.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.israel.LordWorld;

public class PingCommand implements CommandExecutor {

    private final LordWorld plugin;

    public static void register(LordWorld plugin) {
        PingCommand command = new PingCommand(plugin);

        plugin.getCommand("ping").setExecutor(command);
    }

    public PingCommand(LordWorld plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args) {

        sender.sendMessage(plugin.getMessageService().getPingMessage());

        return true;
    }

}
