package com.myst;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSuicide implements CommandExecutor {
    private static final Logger LOGGER = Logger.getLogger("anarchyhelper");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;

            LOGGER.info(p.getName() + " has killed yourself by /suicide");

            p.setHealth(0);
        }
        
        return true;
    }
}
