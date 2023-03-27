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

    public abstract String getName();
    public abstract String getInternalName();
    public abstract String getAuthor();
    public abstract List<String> getRequiredPlugins();
    public abstract String getVersion();
    public abstract String getMaterial();
    public abstract String getDescription();
    public abstract void unregister();

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