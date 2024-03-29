package nl.marido.deluxecombat.objects.addons;

import nl.marido.deluxecombat.utils.tuple.Pair;
import org.bukkit.event.Listener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Addon implements Listener {

    private Map<String, Pair<SettingDescription, Boolean>> booleanMap;
    private Map<String, Pair<SettingDescription, Integer>> integerMap;
    private Map<String, Pair<SettingDescription, List<String>>> listMap;
    private Map<String, Pair<SettingDescription, Double>> doubleMap;
    private Map<String, Pair<SettingDescription, String>> stringMap;

    /**
     * Are all the plugins on the required plugins list required, or
     * has just one of the listed plugins be installed?
     */
    private boolean orRequirement = false;

    public Addon() {
        this.booleanMap = new HashMap<>();
        this.integerMap = new HashMap<>();
        this.listMap = new HashMap<>();
        this.doubleMap = new HashMap<>();
        this.stringMap = new HashMap<>();
    }

    public Map<String, Pair<SettingDescription, Boolean>> getBooleanMap() { return booleanMap; }
    public Map<String, Pair<SettingDescription, Integer>> getIntegerMap() { return integerMap; }
    public Map<String, Pair<SettingDescription, List<String>>> getListMap() { return listMap; }
    public Map<String, Pair<SettingDescription, Double>> getDoubleMap() { return doubleMap; }
    public Map<String, Pair<SettingDescription, String>> getStringMap() { return stringMap; }

    public boolean isOrRequirement() { return orRequirement; }

    public abstract String getName();
    public abstract String getInternalName();
    public abstract String getAuthor();
    public abstract List<String> getRequiredPlugins();
    public abstract String getVersion();
    public abstract String getMaterial();
    public abstract String getDescription();
    public abstract void unregister();
    public abstract void register();

    /**
     * Changes the requirement list type.
     * @param hasJustOnePluginBeInstalled True, if just one of the required plugins has to be installed, false
     *                                    if all the plugins that are listed as required to be installed.
     */
    public void setOrRequirement(boolean hasJustOnePluginBeInstalled) {
        this.orRequirement = hasJustOnePluginBeInstalled;
    }

    public class SettingDescription {
        private String name;
        private int slot;
        private String description;
        private String allowedValues;
        public SettingDescription(String name, int slot, String description, String allowedValues) {
            this.name = name;
            this.slot = slot;
            this.description = description;
            this.allowedValues = allowedValues;
        }
        public String getName() { return name; }
        public int getSlot() { return slot; }
        public String getDescription() { return description; }
        public String getAllowedValues() { return allowedValues; }
    }

}