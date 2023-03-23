package com.myst;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * anarchyhelper java plugin
 */
public class Plugin extends JavaPlugin {
	private static final Logger LOGGER = Logger.getLogger("anarchyhelper");

	public void onEnable() {
		LOGGER.info("anarchyhelper enabled");

		this.getCommand("suicide").setExecutor(new CommandSuicide());
	}

	public void onDisable() {
		LOGGER.info("anarchyhelper disabled");
	}
}
