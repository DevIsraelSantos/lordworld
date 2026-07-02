package br.com.israel.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import br.com.israel.LordWorld;
import br.com.israel.commands.subcommand.HelpSubCommand;

public class LordWorldCommand implements CommandExecutor {

    private final HelpSubCommand helpSubCommand;

    public LordWorldCommand(LordWorld plugin) {
        this.helpSubCommand = new HelpSubCommand(plugin);
    }

    public static void register(LordWorld plugin) {
        LordWorldCommand command = new LordWorldCommand(plugin);

        plugin.getCommand("lw").setExecutor(command);
    }

    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args) {

        if (args.length == 0) {
            return helpSubCommand.execute(sender, args);
        }

        switch (args[0].toLowerCase()) {
            case "help":
                return helpSubCommand.execute(sender, args);

            default:
                sender.sendMessage("§cComando desconhecido.");
                return true;
        }
    }
}