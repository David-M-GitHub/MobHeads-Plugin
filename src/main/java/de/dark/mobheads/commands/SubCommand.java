package de.dark.mobheads.commands;

import org.bukkit.entity.Player;

public abstract class SubCommand {

    public abstract String getName();
    public abstract String getDescription();
    public abstract String getSyntax();
    public abstract String getPermission();

    public abstract void perform(Player p, String args[]);

}
