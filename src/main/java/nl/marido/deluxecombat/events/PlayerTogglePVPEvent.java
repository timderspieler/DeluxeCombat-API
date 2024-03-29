package nl.marido.deluxecombat.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerTogglePVPEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private Player player;
    private boolean pvp_status_before;
    private boolean pvp_status_after;
    private boolean isCancelled;
    private String reason;

    public PlayerTogglePVPEvent(Player player, boolean pvp_status_before, boolean pvp_status_after) {
        this.player = player;
        this.pvp_status_before = pvp_status_before;
        this.pvp_status_after = pvp_status_after;
    }

    public Player getPlayer() { return player; }
    public boolean getNewPVPStatus() { return pvp_status_after; }
    public boolean getOldPVPStatus() { return pvp_status_before; }
    public String getReason() { return reason; }

    public HandlerList getHandlers() {
        return HANDLERS;
    }
    public boolean isCancelled() { return this.isCancelled; }
    public void setCancelled(boolean isCancelled) { this.isCancelled = isCancelled; }
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
    public void cancel(String reason) {
        this.isCancelled = true;
        this.reason = reason;
    }
}