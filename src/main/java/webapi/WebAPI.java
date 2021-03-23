package webapi;

import net.md_5.bungee.api.plugin.Plugin;

import static spark.Spark.*;


public class WebAPI extends Plugin {

    @Override
    public void onEnable() {
        super.onEnable();

        port(6050);


        Router router = new Router(this);
    }

    @Override
    public void onDisable() {
        super.onDisable();

        stop();
    }
}
