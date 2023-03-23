package com.myst;

import java.util.logging.Logger;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.Listener;

public class EventListener implements Listener {
    private static final Logger LOGGER = Logger.getLogger("betterchat");

    private final String[] JOIN_MESSAGES = {
		" has joined our party",
		" has joined the server",
		", welcome to our party",
		", welcome to the server",
		", welcome!"
	};
	private final String[] LEAVE_MESSAGES = {
		" has left our party",
		" has left",
		" has left, bye-bye!",
		", goodbye!"
	};

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage(ChatColor.AQUA + p.getName() + ChatColor.RESET + JOIN_MESSAGES[new Random().nextInt(JOIN_MESSAGES.length)]);
	}

    @EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage(ChatColor.AQUA + p.getName() + ChatColor.RESET + LEAVE_MESSAGES[new Random().nextInt(LEAVE_MESSAGES.length)]);
	}

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		String message = e.getMessage();

		e.setFormat(ChatColor.AQUA + p.getName() + ChatColor.YELLOW + " > " + ChatColor.RESET + message);
	}
}
