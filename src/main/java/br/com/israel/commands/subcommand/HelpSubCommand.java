package br.com.israel.commands.subcommand;

import org.bukkit.command.CommandSender;

import br.com.israel.LordWorld;

public class HelpSubCommand {

    @SuppressWarnings("unused")
    private final LordWorld plugin;

    public HelpSubCommand(LordWorld plugin) {
        this.plugin = plugin;
    }

    public boolean execute(CommandSender sender, String[] args) {

        sender.sendMessage("§6§m----------------------------------------");
        sender.sendMessage("§e§lLordWorld");
        sender.sendMessage("");
        sender.sendMessage("§6/lw help §7- Mostra esta ajuda.");
        sender.sendMessage("§6/lw edit <template> §7- Edita um template.");
        sender.sendMessage("§6/lw reset <world> §7- Reseta um mundo.");
        sender.sendMessage("§6/lw info <world> §7- Exibe informações do mundo.");
        sender.sendMessage("");
        sender.sendMessage("§6§m----------------------------------------");

        return true;
    }
}