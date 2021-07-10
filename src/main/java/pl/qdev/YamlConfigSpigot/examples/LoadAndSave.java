package pl.qdev.YamlConfigSpigot.examples;

import pl.qdev.YamlConfigSpigot.Config;

import java.util.ArrayList;
import java.util.List;

public class LoadAndSave {

    private static List<String> users = new ArrayList<>();

    public static void loadData() {
        users = Config.getConfig("data").getStringList("list");
    }

    public static void saveData() {
        Config.getConfig("data").set("users", users.size());
        Config.getConfig("data").set("list", users);
        Config.saveConfig("data");
    }
}
