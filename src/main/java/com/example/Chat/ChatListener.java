package com.example.Chat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class ChatListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.GREEN + event.getPlayer().getName() + " подключился");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        event.setQuitMessage(ChatColor.RED + event.getPlayer().getName() + " вышел");
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        event.setFormat(
                ChatColor.GOLD + "<" + event.getPlayer().getName() + "> -> " + ChatColor.WHITE + event.getMessage());
    }
}
