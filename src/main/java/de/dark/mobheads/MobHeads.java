package de.dark.mobheads;

import de.dark.mobheads.bStats.Metrics;
import de.dark.mobheads.events.MobKillEvent;
import de.dark.mobheads.utils.Config;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobHeads extends JavaPlugin {

    private static MobHeads instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {

        Config.setup();
        Config.init();
        Config.getConfig().options().copyDefaults(true);
        Config.save();

        Metrics metrics = new Metrics(this, 13246);

        getServer().getPluginManager().registerEvents(new MobKillEvent(), this);
    }

    @Override
    public void onDisable() {
    }

    public static MobHeads getInstance() {
        return instance;
    }
}
