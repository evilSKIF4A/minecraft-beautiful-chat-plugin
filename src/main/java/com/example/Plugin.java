package com.example;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.example.Chat.ChatListener;

public class Plugin extends JavaPlugin {
  private static final Logger LOGGER = Logger.getLogger("Beautiful-chat");

  public void onEnable() {
    LOGGER.info("Beautiful-chat enabled");

    Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
  }

  public void onDisable() {
    LOGGER.info("Beautiful-chat disabled");
  }
}
