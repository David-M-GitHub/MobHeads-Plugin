package de.dark.mobheads.commands.subcommands;

import de.dark.mobheads.MobHeads;
import de.dark.mobheads.commands.SubCommand;
import de.dark.mobheads.utils.Config;
import org.bukkit.entity.Player;

public class ReloadCommand extends SubCommand {

    @Override
    public String getName() {
        return "reload";
    }

    @Override
    public String getDescription() {
        return "reloads configs";
    }

    @Override
    public String getSyntax() {
        return "reload";
    }

    @Override
    public String getPermission() {
        return "mobheads.reload";
    }

    @Override
    public void perform(Player p, String[] args) {

        Config.reload();
        p.sendMessage(MobHeads.getInstance().getPrefix() + "§aYou succesfully reloaded configs!");

    }
}
