package webapi.api;

import org.bukkit.Bukkit;
import webapi.models.Server;
import webapi.models.ServerRuntime;

import java.lang.management.ManagementFactory;

public class ServerAPI {

    public Server getServerInfos() {
        Server server = new Server();

        org.bukkit.Server bukkitServer = Bukkit.getServer();
        server.setName(bukkitServer.getName());
        server.setMotd(bukkitServer.getMotd());
        server.setVersion(bukkitServer.getVersion());
        server.setBukkitVersion(bukkitServer.getBukkitVersion());

        ServerRuntime runtime = new ServerRuntime();

        runtime.setCpus(Runtime.getRuntime().availableProcessors());
        runtime.setFreeMemory(Runtime.getRuntime().freeMemory());
        runtime.setMaxMemory(Runtime.getRuntime().maxMemory());
        runtime.setTotalMemory(Runtime.getRuntime().totalMemory());

        long uptime = ManagementFactory.getRuntimeMXBean().getUptime() / 1000L;
        runtime.setUptime(uptime);

        server.setRuntime(runtime);

        return server;
    }
}
