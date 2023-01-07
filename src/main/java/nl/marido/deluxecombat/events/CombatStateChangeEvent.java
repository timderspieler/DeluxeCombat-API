package nl.marido.deluxecombat.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CombatStateChangeEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private Player player;
    private CombatState status;

    public CombatStateChangeEvent(Player player, CombatState status) {
        this.player = player;
        this.status = status;
    }

    public Player getPlayer() { return player; }
    public CombatState getState() { return  status; }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public enum CombatState {
        TAGGED, UNTAGGED;
    }

}