package nl.marido.deluxecombat.hooks.template;

import org.bukkit.entity.Player;

public abstract class CombatHook extends HookTemplate {
	
	public CombatHook(String pluginname, String version) {
		super(pluginname, version);
	}
	
	public abstract boolean canCombat(Player victim, Player attacker);
	public abstract boolean canBeTagged(Player victim, Player attacker);
	
	@Override
	public void register() {}
	
}
