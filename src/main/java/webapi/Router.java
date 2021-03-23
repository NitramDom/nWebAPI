package webapi;

import webapi.api.ServerAPI;

import static spark.Spark.*;
import com.google.gson.Gson;

public class Router<WebApi>   {

    private WebApi api;

    public Router(WebApi api) {
        this.api = api;

        Gson gson = new Gson();
        ServerAPI serverAPI = new ServerAPI();

        path("/api", () -> {
            get("/ping", (request, response) -> {
                return "pong";
            });
            path("/server", () -> {
                get("/infos", (request, response) -> {
                    return gson.toJson(serverAPI.getServerInfos());
                });
            });
        });

        notFound((req, res) -> {
            res.type("application/json");
            return "{\"message\":\"Custom 404\"}";
        });
    }
}
