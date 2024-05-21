package nl.marido.deluxecombat.hooks.template;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public abstract class BarrierProvider implements Listener {
    public abstract boolean isBorderEnabled();
    public abstract String getBorderMode();
    public abstract String getBorderMaterial();
    public abstract double getKnockBackStrength();

    public abstract boolean allowPvP(Player p, Location location);
}
