package de.dark.mobheads.commands;

import de.dark.mobheads.MobHeads;
import de.dark.mobheads.commands.subcommands.ReloadCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CommandManager implements CommandExecutor {

    private ArrayList<SubCommand> subCommands = new ArrayList<>();

    public CommandManager() {
        subCommands.add(new ReloadCommand());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (args.length > 0) {
                for (int i = 0; i < getSubCommands().size(); i++) {
                    if (args[0].equalsIgnoreCase(getSubCommands().get(i).getName())) {
                        if (p.hasPermission(getSubCommands().get(i).getPermission())) {
                            getSubCommands().get(i).perform(p, args);
                        }else {
                            p.sendMessage(MobHeads.getInstance().getPrefix() + "§cYou don't have enough permissions.");
                        }
                    }
                }
            }else if (args.length == 0) {
                if (p.hasPermission("mobheads")) {
                    p.sendMessage("§f§n                                          ");
                    for (int i = 0; i < getSubCommands().size(); i++) {
                        p.sendMessage("§e" + getSubCommands().get(i).getSyntax() + " §7- §e" + getSubCommands().get(i).getDescription());
                    }
                    p.sendMessage("§f§n                                          ");
                }else {
                    p.sendMessage(MobHeads.getInstance().getPrefix() + "§cYou don't have enough permissions.");
                }
            }
        }

        return false;
    }

    public ArrayList<SubCommand> getSubCommands() {
        return subCommands;
    }
}
