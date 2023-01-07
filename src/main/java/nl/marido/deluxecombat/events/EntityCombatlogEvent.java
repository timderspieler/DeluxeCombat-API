package nl.marido.deluxecombat.events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EntityCombatlogEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private boolean isCancelled;

    private Player victim;
    private String name;
    private EntityType type;

    public EntityCombatlogEvent(Player victim, String name, EntityType type) {
        this.victim = victim;
        this.name = name;
        this.type = type;
    }

    public boolean isCancelled() { return this.isCancelled; }
    public Player getVictim() { return victim; }
    public String getEntityName() { return name; }
    public EntityType getEntityType() { return type; }

    public void setCancelled(boolean isCancelled) { this.isCancelled = isCancelled; }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}