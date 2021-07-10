package pl.qdev.YamlConfigSpigot;

import org.bukkit.plugin.java.JavaPlugin;
import pl.qdev.YamlConfigSpigot.examples.Itemstacks;
import pl.qdev.YamlConfigSpigot.examples.LoadAndSave;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Config.setupConfigs("config", "test", "data");

        LoadAndSave.loadData();
        Itemstacks.loadItems();
    }

    @Override
    public void onDisable() {
        LoadAndSave.saveData();
        Itemstacks.saveItems();
    }
}
