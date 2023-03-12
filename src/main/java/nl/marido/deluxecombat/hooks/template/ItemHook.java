package nl.marido.deluxecombat.hooks.template;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemHook extends HookTemplate {

	public ItemHook(String pluginname, String version) {
		super(pluginname, version);
	}
	
	// If the itemstack returned is null, the item cant be dropped
	// If the itemstack returned is not null, the item can be dropped but could
	// have been modified by the method
	//public abstract ItemStack canDrop(ItemStack stack, OfflinePlayer p);

	/**
	 *
	 * @param stack Item that is about to be dropped
	 * @param p Player that is about to drop an item
	 * @return true / false if an item can be dropped
	 */
	public abstract boolean canDrop(ItemStack stack, OfflinePlayer p);

	/**
	 *
	 * @param drops List of items that should be dropped
	 * @param save List of items that should be saved instead of being dropped
	 * @param p Player that has the list of items in his inventory
	 * @param checkForSave Should items that can be saved added to the save list?
	 * @return List of items that finally get dropped
	 */
	public List<ItemStack> checkDrops(List<ItemStack> drops, List<ItemStack> save, OfflinePlayer p, boolean checkForSave) {
		return null;
	}
	
}
