package nl.marido.deluxecombat.hooks.template;

import org.bukkit.OfflinePlayer;

public abstract class EconomyHook extends HookTemplate {
	
	public EconomyHook(String pluginname, String version) {
		super(pluginname, version);
	}
	
	public abstract double getBalance(OfflinePlayer p);
	public abstract boolean hasEnoughMoney(OfflinePlayer p, double amount);
	public abstract void withdraw(OfflinePlayer p, double amount);
	public abstract void deposit(OfflinePlayer p, double amount);
	public abstract void depositAdminAccount(String account, double amount);
	public abstract String currencyName(boolean plural);
	
}
