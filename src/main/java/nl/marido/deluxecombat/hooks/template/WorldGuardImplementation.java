package nl.marido.deluxecombat.hooks.template;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Set;

public abstract class WorldGuardImplementation extends HookTemplate {
    public WorldGuardImplementation(String pluginName, String version) {
        super(pluginName, version);
    }

    public abstract boolean allowFight(Location location, Player p);
    public abstract String getRegionName(Location location);
    public abstract boolean isTagAllowed(Location location);
    public abstract boolean isKeepInventory(Location location);
    public abstract boolean isForcePvP(Location location);
    public abstract boolean hasPvPFlag(Location loc);
    public abstract Set<String> getOwners(Location loc);
    public abstract Set<String> getOwnerGroups(Location loc);
    public abstract Set<String> getMembers(Location loc);
    public abstract Set<String> getMemberGroups(Location loc);
}
