package com.myst;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	private static final Logger LOGGER = Logger.getLogger("betterchat");

	public void onEnable() {
		LOGGER.info("BetterChat enabled");
		getServer().getPluginManager().registerEvents(new EventListener(), this);
	}
}
