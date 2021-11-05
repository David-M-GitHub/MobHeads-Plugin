package de.dark.mobheads.utils;

import de.dark.mobheads.apis.ItemAPI;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public enum Heads {

    PIG(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "pig.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTU5ODQ5MDM0MzIxMSwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yNTA0YmM3YzdkNmE4OGNhYzQxY2VmZjQ1N2JmNTUzYTVjOGJhZDdhMjIxYjYyZjkyYTRiYjZkYjg0NmRmMGYwIgogICAgfQogIH0KfQ==").build(), Config.getConfig().getInt("pig.chance"), EntityType.PIG),
    COW(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "cow.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTU5ODQ5MDM5NjAzMywKICAicHJvZmlsZUlkIiA6ICI5YzQ5YjU0YjFjZjU0NjZjYjRhNzA4M2JmZGQ4MDIxNSIsCiAgInByb2ZpbGVOYW1lIiA6ICI5U0kiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzg3ODEwZmNmNWYzYTI3ZGRhNDU4MGJkYzc2MTg2N2QxNDQ4N2ZkZWNmMGUxMzhjNTgzMGQ5MmJlMzNiNDhhMiIKICAgIH0KICB9Cn0=").build(), Config.getConfig().getInt("cow.chance"), EntityType.COW),
    SHEEP(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "sheep.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTYzMDM4NzM4Mjc5NSwKICAicHJvZmlsZUlkIiA6ICJkZGVkNTZlMWVmOGI0MGZlOGFkMTYyOTIwZjdhZWNkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaXNjb3JkQXBwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZjNmY0ZmIyMWM3NDJlMDE1MWQxNTg2MTZlZjMxMTI4ZmY3MTBhMmYzM2UyMmZmZTY0ZDc4NmJkYzQ1OWJiYTYiCiAgICB9CiAgfQp9").build(), Config.getConfig().getInt("sheep.chance"), EntityType.SHEEP),
    ZOMBIE(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "zombie.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTYxOTYwNzI2MjM4MCwKICAicHJvZmlsZUlkIiA6ICI3MmNiMDYyMWU1MTA0MDdjOWRlMDA1OTRmNjAxNTIyZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNb3M5OTAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODVkMzRlN2Y1YWU5NTBjZTFhYTJlODZmODRlZGU5YzJkMjVlYmRhMjEzZTc1OWM2ODU5MmMwNjRkZTE3NTlhZSIKICAgIH0KICB9Cn0=").build(), Config.getConfig().getInt("zombie.chance"), EntityType.ZOMBIE),
    SKELETON(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "skeleton.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTYwOTUyNTE3NjAxOCwKICAicHJvZmlsZUlkIiA6ICI5ZDIyZGRhOTVmZGI0MjFmOGZhNjAzNTI1YThkZmE4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYWZlRHJpZnQ0OCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lM2E1N2NjZDhkNjQyMzZhOWNmNjlkN2RkNzU4YjMzMGQyYzJkNTM1MTVmMTVmNDA3OTNlMzg0OWVmOGE4MGRlIgogICAgfQogIH0KfQ==").build(), Config.getConfig().getInt("skeleton.chance"), EntityType.SKELETON),
    CREEPER(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "creeper.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTYyMDIzNzcyMDY4NSwKICAicHJvZmlsZUlkIiA6ICI2OTY1ODFkZjQyNTY0MDI4YjU1ZTk0NTJiNGRlNDBiNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmVlcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNlOGUwYzQwYjBlOTMxYzc3YzI2NGViMGEwNTBkN2U2ZWJiZTVhYmYzZWE5MmFlMTQ3NTQ4ZTVkM2VjN2JkODIiCiAgICB9CiAgfQp9").build(), Config.getConfig().getInt("creeper.chance"), EntityType.CREEPER),
    ENDERMAN(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "enderman.headname"))).setHeadTexture("eyJ0aW1lc3RhbXAiOjE0ODIzNjY4MjA3NTIsInByb2ZpbGVJZCI6ImRhNzQ2NWVkMjljYjRkZTA5MzRkOTIwMTc0NDkxMzU1IiwicHJvZmlsZU5hbWUiOiJJc2F5bGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI1M2YwNjM4YzkzODE2MjZhZDE2NjVmY2RjYTU3MWE4OTMyYTIwY2U0MzZlOGUzNTcwZmJiYTE4M2ZjOGU0In19fQ==").build(), Config.getConfig().getInt("enderman.chance"), EntityType.ENDERMAN),
    CHICKEN(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "chicken.headname"))).setHeadTexture("eyJ0aW1lc3RhbXAiOjE1ODU3MzgzNTQzMzEsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbl9vcmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JiN2NiNDJhMzM0N2RmMDEzZmI2MGRiMGI1NTNmNDViNmNiZjIwYjE1ZDhkMDBkZmQ0YjAyYmVkZjkwZjhkNjIifX19").build(), Config.getConfig().getInt("chicken.chance"), EntityType.CHICKEN),
    DROWNED(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "drowned.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTU5NTQ4MTcyMzM3NywKICAicHJvZmlsZUlkIiA6ICI3ZGEyYWIzYTkzY2E0OGVlODMwNDhhZmMzYjgwZTY4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHb2xkYXBmZWwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmExMzY4MmY5ZTgxNzUyNTkxNjYwOWNlOWJmNmE4OGZlYzE5YmZjNDg1MDRkZDM5NTY5ODg1NjRjMzUxNThlIgogICAgfQogIH0KfQ==").build(), Config.getConfig().getInt("drowned.chance"), EntityType.DROWNED),
    BEE(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "bee.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTU5OTAxMDc4NTAzMiwKICAicHJvZmlsZUlkIiA6ICJlZmM3NTVhZjNkNzE0YjVhODhkNjU0ZDgyY2RiMDY3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSEZfQmVlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0MjBjOWM0M2UwOTU4ODBkY2QyZTI4MWM4MWY0N2IxNjNiNDc4ZjU4YTU4NGJiNjFmOTNlNmUxMGExNTVmMzEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==").build(), Config.getConfig().getInt("bee.chance"), EntityType.BEE),
    BLAZE(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "blaze.headname"))).setHeadTexture("eyJ0aW1lc3RhbXAiOjE0ODExMDgzMTk4NjEsInByb2ZpbGVJZCI6IjNjOWE4MjkyMGZhNzRlN2M4NDEzMmJjYjE1OTY4MjA0IiwicHJvZmlsZU5hbWUiOiJSb2NvbG9nbyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzU2NTg2ODlkMmQ2MWE3YTc1YjRmNWM0MTkyZTg5OWVjYWMxNmEwOGZmNDE2ZDk5NWY1YzEwYzc3YWEifX19").build(), Config.getConfig().getInt("blaze.chance"), EntityType.BLAZE),
    PANDA(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "panda.headname"))).setHeadTexture("eyJ0aW1lc3RhbXAiOjE1NjQxNzUwNTA5ODEsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMzZmNmZmM2ZGEwNzVlOGU1ZDAwM2I0ODNjMDU4ODY2OTQ1MTBlM2FlNTQ1OTNkZDA2NzAxNzUyMDVhNTUxOWIifX19").build(), Config.getConfig().getInt("panda.chance"), EntityType.PANDA),
    DOLPHIN(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "dolphin.headname"))).setHeadTexture("eyJ0aW1lc3RhbXAiOjE1Nzg2NjIyMjQyMTIsInByb2ZpbGVJZCI6Ijc3MjdkMzU2NjlmOTQxNTE4MDIzZDYyYzY4MTc1OTE4IiwicHJvZmlsZU5hbWUiOiJsaWJyYXJ5ZnJlYWsiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RjMDBjNGMxZDg3NmExYTcyMWQyMDMzMTIxOWI4NTc3NzJlYjg1N2Q2YWZkY2QzNGNlOTllMGEzYTI3OGRlZDgifX19").build(), Config.getConfig().getInt("dolphin.chance"), EntityType.DOLPHIN),
    TURTLE(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "turtle.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTYxOTQ3NTY1MzYwMywKICAicHJvZmlsZUlkIiA6ICJmNDY0NTcxNDNkMTU0ZmEwOTkxNjBlNGJmNzI3ZGNiOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWxhcGFnbzA1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MwMjljZmUwMGQ1NTEwNWE3ZTllMWI2YzEzZjY4NDA4M2Q2MGU0NWY1MTMxYTFhNDlmM2YwZjE3NWFmY2NjYzYiCiAgICB9CiAgfQp9").build(), Config.getConfig().getInt("turtle.chance"), EntityType.TURTLE),
    WITCH(new ItemAPI(Material.PLAYER_HEAD).setDisplayName(ChatColor.translateAlternateColorCodes('&', Config.getConfig().getString( "witch.headname"))).setHeadTexture("ewogICJ0aW1lc3RhbXAiIDogMTYyMTIxODM3NjgwNiwKICAicHJvZmlsZUlkIiA6ICI5MThhMDI5NTU5ZGQ0Y2U2YjE2ZjdhNWQ1M2VmYjQxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWV2ZWxvcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VjOWQxMzRmNmZjNjYyNjhiNDQ1OGE5YmFmYTJkZTJjODIyYzM3YWIzNjUzMDBlNGQxMDhkY2UzNmVlMjY1MjgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==").build(), Config.getConfig().getInt("witch.chance"), EntityType.WITCH);


    private ItemStack head;
    private int chance;
    private EntityType entityType;

    Heads(ItemStack head, int chance, EntityType entityType) {
        this.head = head;
        this.chance = chance;
        this.entityType = entityType;
    }

    public int getChance() {
        return chance;
    }

    public ItemStack getHead() {
        return head;
    }

    public EntityType getEntityType() {
        return entityType;
    }
}