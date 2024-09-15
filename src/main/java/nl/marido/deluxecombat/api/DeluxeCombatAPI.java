package nl.marido.deluxecombat.api;

import org.bukkit.entity.Player;

public class DeluxeCombatAPI {

    /**
     * Initiates a bounty for a player.
     * @param target The player that should get a bounty.
     * @param initiator The player that initiated the bounty.
     * @param anonymous Should the name of the initiator be printed in the chat?
     * @param bounty The value of the bounty.
     * @param removeTax Should tax be removed from the value? (Tax are configured in the /dc menu)
     * @return True (bounty has been created) or False (bounty could not be created)
     */
    public boolean createBounty(Player target, Player initiator, boolean anonymous, double bounty, boolean removeTax) {
        return true;
    }

    /**
     * Removes the current bounty of a player
     * @param p The player
     */
    public void removeBounty(Player p) {}

    /**
     * Returns if the player has an active bounty or not
     * @param p The player
     * @return True (has bounty) or False (has no bounty)
     */
    public boolean hasBounty(Player p) {
        return false;
    }

    /**
     * Returns the points of a player
     * @param p The player
     * @return Amount of points
     */
    public int getPoints(Player p) {
        return 0;
    }

    /**
     * Returns the kills of a player
     * @param p The player
     * @return Amount of kills
     */
    public int getKills(Player p) {
        return 0;
    }

    /**
     * Returns the deaths of a player
     * @param p The player
     * @return Amount of deaths
     */
    public int getDeaths(Player p) {
        return 0;
    }

    /**
     * Returns the kd of a player.
     * @param p
     * @return KD as double
     */
    public double getKD(Player p) {
        return 0.0;
    }

    /**
     * Returns the amount of combat logs of a player
     * @param p The player.
     * @return Amount of combatlogs
     */
    public int getCombatlogs(Player p) {
        return 0;
    }

    /**
     * Returns the current streak of a player
     * @param p The player.
     * @return Current kill streak
     */
    public int getStreak(Player p) {
        return 0;
    }

    /**
     * Returns the highest kill streak of a player.
     * @param p The player.
     * @return Highest kill streak
     */
    public int getHighestStreak(Player p) {
        return 0;
    }

    /**
     * Returns the current opponent of the player.
     * @param p The player.
     * @return Returns a player object (the current opponent)
     */
    public Player getCurrentOpponent(Player p) {
        return null;
    }

    /**
     * Returns if the player is in combat.
     * @param p The player.
     * @return True (in combat) or False (not in combat)
     */
    public boolean isInCombat(Player p) {
        return false;
    }

    /**
     * Returns if the player has an active protection (Newbie or Respawn protection)
     * @param p The player.
     * @return True (active protection) or False (no active protection)
     */
    public boolean hasProtection(Player p) {
        return false;
    }

    /**
     * The pvp status of a player
     * @param p The player.
     * @return True (pvp on) or False (pvp off)
     */
    public boolean hasPvPEnabled(Player p) {
        return false;
    }

    /**
     * Toggles the pvp of a given player.
     * @param p The player that the pvp will be toggled.
     * @param status True (pvp on) or False (pvp off)
     */
    public void togglePvP(Player p, boolean status) {}

    /**
     * The time that the player will remain in combat.
     * @param p The player.
     * @return Time in seconds.
     */
    public int getRemainingCombatTime(Player p) {
        return 0;
    }

    /**
     * Retrieves the remaining combat time in milliseconds for a given player.
     *
     * @param  p  the player for whom to retrieve the remaining combat time
     * @return    the remaining combat time in milliseconds, or 0L if no combat time is remaining
     */
    public long getRemainingCombatTimeMillis(Player p) { return 0L; }

    /**
     * Marks a player as in combat for a given amount of time.
     * @param target The player that should be tagged.
     * @param attacker The object that hit the player. Can be a player or an entity. Can be null.
     * @param seconds The time in seconds the player should be tagged.
     * @throws NullPointerException An exception that will be thrown if the player is not online.
     */
    public void tag(Player target, Object attacker, int seconds) throws NullPointerException {}

    /**
     * Untags a player.
     * @param p The player that should be untagged.
     * @throws NullPointerException An exception that will be thrown if the player is not online.
     */
    public void untag(Player p) throws NullPointerException {}

    /**
     * Adds a given amount of points to a player.
     * @param p The player that should get the amount of points.
     * @param points The amount of points that should be added.
     * @throws NullPointerException An exception that will be thrown if the player is not online.
     */
    public void addPoints(Player p, int points) throws NullPointerException {}

    /**
     * Removes a given amount of points from a player.
     * @param p The player that should lose the amount of points.
     * @param points The amount of points that should be removed.
     * @throws NullPointerException An exception that will be thrown if the player is not online.
     */
    public void removePoints(Player p, int points) throws NullPointerException {}

    /**
     * Prints an message from the DeluxeCombat plugin lang.yml file.
     * @param p The player the message should be sent to.
     * @param API_SOURCE The addon / plugin that is trying to access the message.
     * @param MESSAGES_ENUM_PATH The lang.yml path to the message that should be printed.
     */
    public void printDeluxeCombatMessage(Player p, String API_SOURCE, String MESSAGES_ENUM_PATH) {}

}
