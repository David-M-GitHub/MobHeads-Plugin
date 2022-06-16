package de.dark.mobheads;

import de.dark.mobheads.bStats.Metrics;
import de.dark.mobheads.commands.CommandManager;
import de.dark.mobheads.events.JoinQuitEvent;
import de.dark.mobheads.events.MobKillEvent;
import de.dark.mobheads.utils.Config;
import de.dark.mobheads.utils.Heads;
import de.dark.mobheads.utils.UpdateChecker;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobHeads extends JavaPlugin {

    private static MobHeads instance;

    private boolean update = false;

    private String prefix;

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
        

        prefix = Config.getConfig().getString("prefix");


        Metrics metrics = new Metrics(this, 13246);
        new UpdateChecker(this, 97388).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                getServer().getConsoleSender().sendMessage(prefix + "§fPlugin is up to date!");
                update = false;
            }else {
                getServer().getConsoleSender().sendMessage(prefix + "§cPlugin has a newer Version!");
                update = true;
            }
        });

        getCommand("mobheads").setExecutor(new CommandManager());

        getServer().getPluginManager().registerEvents(new MobKillEvent(), this);
        getServer().getPluginManager().registerEvents(new JoinQuitEvent(), this);
    }

    public String getPrefix() {
        return prefix;
    }

    public boolean isUpdate() {
        return update;
    }

    @Override
    public void onDisable() {
    }

    public static MobHeads getInstance() {
        return instance;
    }
}
