package webapi.models;

import com.google.gson.annotations.Expose;

public class Server {

    @Expose
    private String name = null;

    @Expose
    private String motd = null;

    @Expose
    private String version = null;

    @Expose
    private String bukkitVersion = null;

    @Expose
    private String tps = null;

    @Expose
    private ServerRuntime runtime = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBukkitVersion() {
        return bukkitVersion;
    }

    public void setBukkitVersion(String bukkitVersion) {
        this.bukkitVersion = bukkitVersion;
    }

    public String getTps() {
        return tps;
    }

    public void setTps(String tps) {
        this.tps = tps;
    }

    public ServerRuntime getRuntime() {
        return runtime;
    }

    public void setRuntime(ServerRuntime runtime) {
        this.runtime = runtime;
    }
}
