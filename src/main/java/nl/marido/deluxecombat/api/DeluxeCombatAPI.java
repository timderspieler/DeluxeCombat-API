package nl.marido.deluxecombat.api;

import org.bukkit.entity.Player;

public class DeluxeCombatAPI {

    public boolean createBounty(Player target, Player initiator, boolean anonymous, double bounty, boolean removeTax) {
        return true;
    }

    public void removeBounty(Player p) {}

    public boolean hasBounty(Player p) {
        return false;
    }

    public int getPoints(Player p) {
        return 0;
    }

    public int getKills(Player p) {
        return 0;
    }

    public int getDeaths(Player p) {
        return 0;
    }

    public double getKD(Player p) {
        return 0.0;
    }

    public int getCombatlogs(Player p) {
        return 0;
    }

    public int getStreak(Player p) {
        return 0;
    }

    public int getHighestStreak(Player p) {
        return 0;
    }

    public Player getCurrentOpponent(Player p) {
        return null;
    }

    public boolean isInCombat(Player p) {
        return false;
    }

    public boolean hasProtection(Player p) {
        return false;
    }

    public boolean hasPvPEnabled(Player p) {
        return false;
    }

    public void togglePvP(Player p, boolean status) {}

    public int getRemainingCombatTime(Player p) {
        return 0;
    }

    public void tag(Player target, Object attacker, int seconds) throws NullPointerException {}

    public void untag(Player p) throws NullPointerException {}

    public void addPoints(Player p, int points) throws NullPointerException {}

    public void removePoints(Player p, int points) throws NullPointerException {}

}
