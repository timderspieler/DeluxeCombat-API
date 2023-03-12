package nl.marido.deluxecombat.hooks.template;

import org.bukkit.entity.Player;

public abstract class ClanHook extends CombatHook {
	
	public ClanHook(String pluginname, String version) {
		super(pluginname, version);
	}
	
	public abstract boolean inSameClan(Player one, Player two);
	
	public abstract boolean areAllied(Player one, Player two);

}
