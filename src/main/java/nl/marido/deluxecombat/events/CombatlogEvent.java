package nl.marido.deluxecombat.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CombatlogEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private boolean isCancelled;

    private Player combatlogger;
    private Player last_attacker;
    private Location location;

    public CombatlogEvent(Player combatlogger, Player last_attacker, Location location) {
        this.combatlogger = combatlogger;
        this.location = location;
        this.last_attacker = last_attacker;
    }

    public boolean isCancelled() { return this.isCancelled; }
    public Player getCombatlogger() { return combatlogger; }
    public Player getLastAttacker() { return last_attacker; }
    public Location getLocation() { return location; }

    public void setCancelled(boolean isCancelled) { this.isCancelled = isCancelled; }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}