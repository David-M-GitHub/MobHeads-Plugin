package de.dark.mobheads.events;

import de.dark.mobheads.utils.Heads;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class MobKillEvent implements Listener {

    @EventHandler
    public void onMobKill(EntityDeathEvent e) {

        for (Heads heads : Heads.values()) {
            if (heads.getEntityType() == null) return;
            if (e.getEntityType() == null) return;
            if (e.getEntityType() == heads.getEntityType()) {
                Random r = new Random();
                int ra = r.nextInt(100);
                if (ra <= heads.getChance() && ra != 0) {
                    e.getDrops().add(heads.getHead());
                }
            }
        }

    }

}
