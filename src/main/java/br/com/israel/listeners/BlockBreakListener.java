package br.com.israel.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import br.com.israel.LordWorld;
import br.com.israel.models.PlayerStats;

public class BlockBreakListener
                implements Listener {

        private final LordWorld plugin;

        public BlockBreakListener(
                        LordWorld plugin) {

                this.plugin = plugin;
        }

        @EventHandler
        public void onBlockBreak(
                        BlockBreakEvent event) {

                PlayerStats stats = plugin.getPlayerStatsService()
                                .incrementBlocks(
                                                event.getPlayer()
                                                                .getUniqueId());

                if (stats.isScoreboardEnabled()) {

                        plugin.getScoreboardService()
                                        .update(
                                                        event.getPlayer(),
                                                        stats.getBlocksBroken());
                }
        }

        public static void register(
                        LordWorld plugin) {

                plugin.getServer()
                                .getPluginManager()
                                .registerEvents(
                                                new BlockBreakListener(plugin),
                                                plugin);
        }
}
