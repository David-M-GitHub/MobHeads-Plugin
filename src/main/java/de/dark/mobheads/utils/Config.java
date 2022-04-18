package de.dark.mobheads.utils;

import de.dark.mobheads.MobHeads;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Random;

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
        Config.getConfig().addDefault("creeper.headname", "&aCreeper Head");
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
        Config.getConfig().addDefault("shulker.headname", "&aShulker Head");
        Config.getConfig().addDefault("shulker.chance", 5);
        Config.getConfig().addDefault("slime.headname", "&aSlime Head");
        Config.getConfig().addDefault("slime.chance", 5);
        Config.getConfig().addDefault("squid.headname", "&aSquid Head");
        Config.getConfig().addDefault("squid.chance", 5);
        Config.getConfig().addDefault("husk.headname", "&aHusk Head");
        Config.getConfig().addDefault("husk.chance", 5);
        Config.getConfig().addDefault("phantom.headname", "&aPhantom Head");
        Config.getConfig().addDefault("phantom.chance", 5);
        Config.getConfig().addDefault("piglin.headname", "&aPiglin Head");
        Config.getConfig().addDefault("piglin.chance", 5);
        Config.getConfig().addDefault("cave-spider.headname", "§aCave Spider Head");
        Config.getConfig().addDefault("cave-spider.chance", 5);
        Config.getConfig().addDefault("iron-golem.headname", "&aIron Golem Head");
        Config.getConfig().addDefault("iron-golem.chance", 5);
        Config.getConfig().addDefault("lama.headname", "&aLama Head");
        Config.getConfig().addDefault("lama.chance", 5);
        Config.getConfig().addDefault("polar-bear.headname", "&aPolar Bear Head");
        Config.getConfig().addDefault("polar-bear.chance", 5);
        Config.getConfig().addDefault("spider.headname", "&aSpider Head");
        Config.getConfig().addDefault("spider.chance", 5);
        Config.getConfig().addDefault("wolf.headname", "&aWolf Head");
        Config.getConfig().addDefault("wolf.chance", 5);
        Config.getConfig().addDefault("elder-guardian.headname", "&aElder Guardian Head");
        Config.getConfig().addDefault("elder-guardian.chance", 5);
        Config.getConfig().addDefault("evokder.headname", "&aEvokder Head");
        Config.getConfig().addDefault("evokder.chance", 5);
        Config.getConfig().addDefault("ghast.headname", "&aGhast Head");
        Config.getConfig().addDefault("ghast.chance", 5);
        Config.getConfig().addDefault("guardian.headname", "&aGuardian Head");
        Config.getConfig().addDefault("guardian.chance", 5);
        Config.getConfig().addDefault("magma-cube.headname", "&aMagma Cube Head");
        Config.getConfig().addDefault("magma-cube.chance", 5);
        Config.getConfig().addDefault("pillager.headname", "&aPillager Head");
        Config.getConfig().addDefault("pillager.chance", 5);
        Config.getConfig().addDefault("ravager.headname", "&aRavager Head");
        Config.getConfig().addDefault("ravager.chance", 5);
        Config.getConfig().addDefault("silverfish.headname", "&aSilverfish Head");
        Config.getConfig().addDefault("silverfish.chance", 5);
        Config.getConfig().addDefault("vex.headname", "&aVex Head");
        Config.getConfig().addDefault("vex.chance", 5);
        Config.getConfig().addDefault("bat.headname", "&aBat Head");
        Config.getConfig().addDefault("bat.chance", 5);
        Config.getConfig().addDefault("cat.headname", "&aCat Head");
        Config.getConfig().addDefault("cat.chance", 5);
        Config.getConfig().addDefault("cod.headname", "&aCod Head");
        Config.getConfig().addDefault("cod.chance", 5);
        Config.getConfig().addDefault("donkey.headname", "&aDonkey Head");
        Config.getConfig().addDefault("donkey.chance", 5);
        Config.getConfig().addDefault("fox.headname", "&aFox Head");
        Config.getConfig().addDefault("fox.chance", 5);
        Config.getConfig().addDefault("horse.headname", "&aHorse Head");
        Config.getConfig().addDefault("horse.chance", 5);
        Config.getConfig().addDefault("mushroom-cow.headname", "&aMushroom Cow Head");
        Config.getConfig().addDefault("mushroom-cow.chance", 5);
        Config.getConfig().addDefault("mule.headname", "&aMule Head");
        Config.getConfig().addDefault("mule.chance", 5);
        Config.getConfig().addDefault("ocelot.headname", "&aOcelot Head");
        Config.getConfig().addDefault("ocelot.chance", 5);
        Config.getConfig().addDefault("parrot.headname", "&aParrot Head");
        Config.getConfig().addDefault("parrot.chance", 5);
        Config.getConfig().addDefault("pufferfish.headname", "&aPufferfish Head");
        Config.getConfig().addDefault("pufferfish.chance", 5);
        Config.getConfig().addDefault("rabbit.headname", "&aRabbit Head");
        Config.getConfig().addDefault("rabbit.chance", 5);
        Config.getConfig().addDefault("salmon.headname", "&aSalmon Head");
        Config.getConfig().addDefault("salmon.chance", 5);
        Config.getConfig().addDefault("skeleton-horse.headname", "&aSkeleton Horse Head");
        Config.getConfig().addDefault("skeleton-horse.chance", 5);
        Config.getConfig().addDefault("snowman.headname", "&aSnowman Head");
        Config.getConfig().addDefault("snowman.chance", 5);
        Config.getConfig().addDefault("tropical-fish.headname", "&aTropical Fish Head");
        Config.getConfig().addDefault("tropical-fish.chance", 5);
        Config.getConfig().addDefault("villager.headname", "&aVillager Head");
        Config.getConfig().addDefault("villager.chance", 5);
        Config.getConfig().addDefault("wandering-trader.headname", "&aWandering Trader Head");
        Config.getConfig().addDefault("wandering-trader.chance", 5);
        Config.getConfig().addDefault("trader-llama.headname", "&aTrader Lama Head");
        Config.getConfig().addDefault("trader-llama.chance", 5);
        Config.getConfig().addDefault("zombified-piglin.headname", "&aZombified Piglin Head");
        Config.getConfig().addDefault("zombified-piglin.chance", 5);
        Config.getConfig().addDefault("piglin-brute.headname", "&aPiglin Brute Head");
        Config.getConfig().addDefault("piglin-brute.chance", 5);
        Config.getConfig().addDefault("vindicator.headname", "&aVindicator Head");
        Config.getConfig().addDefault("vindicator.chance", 5);
        Config.getConfig().addDefault("zoglin.headname", "&aZoglin Head");
        Config.getConfig().addDefault("zoglin.chance", 5);
        Config.getConfig().addDefault("zombie-villager.headname", "&aZombie Villager Head");
        Config.getConfig().addDefault("zombie-villager.chance", 5);
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
