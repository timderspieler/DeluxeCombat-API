package nl.marido.deluxecombat.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BountyInitiateEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private boolean isCancelled;

    private Player initiator, target;
    private double bounty;
    private boolean anonymous;

    public BountyInitiateEvent(Player initiator, Player target, double bounty, boolean anonymous) {
        this.initiator = initiator;
        this.target = target;
        this.bounty = bounty;
        this.anonymous = anonymous;
    }

    public boolean isCancelled() { return this.isCancelled; }
    public Player getInitiator() { return initiator; }
    public Player getTarget() { return target; }
    public double getBounty() { return bounty; }
    public boolean isAnonymous() { return anonymous; }

    public void setCancelled(boolean isCancelled) { this.isCancelled = isCancelled; }
    public void setBounty(double bounty) { this.bounty = bounty; }
    public void setAnonymous(boolean anonymous) { this.anonymous = anonymous; }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}