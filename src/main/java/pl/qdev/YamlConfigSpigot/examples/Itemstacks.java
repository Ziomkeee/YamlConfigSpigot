package pl.qdev.YamlConfigSpigot.examples;

import org.bukkit.inventory.ItemStack;
import pl.qdev.YamlConfigSpigot.Config;

import java.util.ArrayList;
import java.util.List;

public class Itemstacks {

    private static ItemStack item = null;
    private static List<ItemStack> items = new ArrayList<>();


    public static void loadItems() {
        item = Config.getConfig("config").getItemStack("item");
        items = (List<ItemStack>) Config.getConfig("config").getList("items");
    }

    public static void saveItems() {
        Config.getConfig("config").set("item", item);
        Config.getConfig("config").set("items", items);
        Config.saveConfig("config");
    }
}
