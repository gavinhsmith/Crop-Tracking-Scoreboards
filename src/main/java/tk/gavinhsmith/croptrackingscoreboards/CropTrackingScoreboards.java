package tk.gavinhsmith.croptrackingscoreboards;

import org.bukkit.plugin.java.JavaPlugin;

public final class CropTrackingScoreboards extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hola, amigo!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Adios, amigo!");
    }
}
