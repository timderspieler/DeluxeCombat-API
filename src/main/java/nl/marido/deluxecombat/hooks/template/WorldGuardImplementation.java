package nl.marido.deluxecombat.hooks.template;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public abstract class WorldGuardImplementation extends HookTemplate {

    public WorldGuardImplementation(String pluginname, String version) {
        super(pluginname, version);
    }

    public abstract boolean allowFight(Location location, Player p);
    public abstract String getRegionName(Location location);
    public abstract boolean isTagAllowed(Location location);
    public abstract boolean isKeepInventory(Location location);
    public abstract boolean isForcePvP(Location location);
    public abstract boolean hasPvPFlag(Location loc);

}
