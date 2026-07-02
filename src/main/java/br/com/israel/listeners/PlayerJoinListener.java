package br.com.israel.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import br.com.israel.LordWorld;

public class PlayerJoinListener implements Listener {
    private final LordWorld plugin;

    public static void register(LordWorld plugin) {
        plugin.getServer()
                .getPluginManager()
                .registerEvents(
                        new PlayerJoinListener(plugin),
                        plugin);
    }

    public PlayerJoinListener(LordWorld plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(plugin.getMessageService().getWelcomeMessage());
    }
}
