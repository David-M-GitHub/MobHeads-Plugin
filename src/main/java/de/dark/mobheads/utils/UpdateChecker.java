package de.dark.mobheads.utils;

import de.dark.mobheads.MobHeads;
import org.bukkit.Bukkit;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.function.Consumer;

public class UpdateChecker {

    private final MobHeads plugin;
    private final int resourceId;

    public UpdateChecker (MobHeads plugin, int resourceId) {
        this.plugin = plugin;
        this.resourceId = resourceId;
    }

    public void getLatestVersion(Consumer<String> consumer) {
        Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
            try {
                InputStream is = new URL("https://api.spigotmc.org/legacy/update.php?resource=" + this.resourceId).openStream();
                Scanner scanner = new Scanner(is);
                if (scanner.hasNext()) {
                    consumer.accept(scanner.next());
                }
            }catch (IOException e) {
                this.plugin.getLogger().info("UpdateChecker failed: " + e.getMessage());
            }
        });
    }

}
