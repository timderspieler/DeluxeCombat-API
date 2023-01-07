package nl.marido.deluxecombat.hooks.template;

public abstract class HookTemplate {
	
	private String pluginname;
	private String version;
	
	private boolean enabled = true;
	
	public HookTemplate(String pluginname, String version) {
		this.pluginname = pluginname;
		this.version = version;
	}

	public String getPluginname() {
		return pluginname;
	}

	public String getVersion() {
		return version;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	public void setPluginName(String name) {
		this.pluginname = name;
	}
	
	public void disable() {
		enabled = false;
	}
	
	public void register() {}
	
}
