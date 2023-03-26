package me.indian.pingprotect.util;

import cn.nukkit.utils.Config;
import me.indian.pingprotect.PingProtect;

public class MessagesUtil {

    private static final PingProtect plugin = PingProtect.getInstance();

    private static final Config config = plugin.getConfig();

    public static String playerGetDamage = ColorUtil.replaceColorCode(config.getString("player-get-damage"));

    public static String playerDealsDamage = ColorUtil.replaceColorCode(config.getString("player-deals-damage"));

    public static String playersBadPing = ColorUtil.replaceColorCode(config.getString("players-ping-bad"));

    public static String needOpPermissions = ColorUtil.replaceColorCode(config.getString("need-op-permissions"));

    public static String commandUsage = ColorUtil.replaceColorCode(config.getString("command-usage"));

    public static String setedPing = ColorUtil.replaceColorCode(config.getString("ping-seted"));

    public static Integer protectedPing = config.getInt("protected-ping");


}