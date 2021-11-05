package de.dark.mobheads.utils;

import de.dark.mobheads.MobHeads;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    private static File file;
    private static FileConfiguration config;

    public static void init() {
        Config.getConfig().addDefault("prefix", "&7[&9Server&7]");

        Config.getConfig().addDefault("pig.headname", "&aPig Head");
        Config.getConfig().addDefault("pig.chance", 5);
        Config.getConfig().addDefault("cow.headname", "&aCow Head");
        Config.getConfig().addDefault("cow.chance", 5);
        Config.getConfig().addDefault("sheep.headname", "&aSheep Head");
        Config.getConfig().addDefault("sheep.chance", 5);
        Config.getConfig().addDefault("zombie.headname", "&aZombie Head");
        Config.getConfig().addDefault("zombie.chance", 5);
        Config.getConfig().addDefault("skeleton.headname", "&aSkeleton Head");
        Config.getConfig().addDefault("skeleton.chance", 5);
        Config.getConfig().addDefault("creeper.headname", "&aPig Head");
        Config.getConfig().addDefault("creeper.chance", 5);
        Config.getConfig().addDefault("enderman.headname", "&aEnderman Head");
        Config.getConfig().addDefault("enderman.chance", 5);
        Config.getConfig().addDefault("chicken.headname", "&aChicken Head");
        Config.getConfig().addDefault("chicken.chance", 5);
        Config.getConfig().addDefault("drowned.headname", "&aDrowned Head");
        Config.getConfig().addDefault("drowned.chance", 5);
        Config.getConfig().addDefault("bee.headname", "&aBee Head");
        Config.getConfig().addDefault("bee.chance", 5);
        Config.getConfig().addDefault("blaze.headname", "&aBlaze Head");
        Config.getConfig().addDefault("blaze.chance", 5);
        Config.getConfig().addDefault("panda.headname", "&aPanda Head");
        Config.getConfig().addDefault("panda.chance", 5);
        Config.getConfig().addDefault("dolphin.headname", "&aDolphin Head");
        Config.getConfig().addDefault("dolphin.chance", 5);
        Config.getConfig().addDefault("turtle.headname", "&aTurtle Head");
        Config.getConfig().addDefault("turtle.chance", 5);
        Config.getConfig().addDefault("witch.headname", "&aWitch Head");
        Config.getConfig().addDefault("witch.chance", 5);
    }


    public static void setup() {
        file = new File(MobHeads.getInstance().getDataFolder(), "config.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    public static File getFile() {
        return file;
    }

    public static FileConfiguration getConfig() {
        return config;
    }

    public static void save() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reload() {
        config = YamlConfiguration.loadConfiguration(file);
    }
}
