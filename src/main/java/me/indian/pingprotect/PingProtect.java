package me.indian.pingprotect;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import me.indian.pingprotect.listeners.DamageListener;
import me.indian.pingprotect.others.Metrics;

public class PingProtect extends PluginBase {

    private static PingProtect instance;

    public static PingProtect getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();

        Metrics metrics = new Metrics(this, 18060);

        final PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new DamageListener(), this);

    }
}