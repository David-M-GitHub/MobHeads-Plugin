package de.dark.mobheads.events;

import de.dark.mobheads.MobHeads;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinQuitEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        if (e.getPlayer().isOp()) {
            if (MobHeads.getInstance().isUpdate()) {
                e.getPlayer().sendMessage(MobHeads.getInstance().getPrefix() + "§e==========================================");
                e.getPlayer().sendMessage(MobHeads.getInstance().getPrefix() + "§f A newer Version from plugin is online!");
                e.getPlayer().sendMessage(MobHeads.getInstance().getPrefix() + "§f    Please download it!");
                e.getPlayer().sendMessage(MobHeads.getInstance().getPrefix() + "§e==========================================");
            }
        }

    }

}
