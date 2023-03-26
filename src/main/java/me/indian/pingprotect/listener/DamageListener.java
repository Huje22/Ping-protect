package me.indian.pingprotect.listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import me.indian.pingprotect.util.MessagesUtil;

public class DamageListener implements Listener {

    private final Integer protectedPing = MessagesUtil.protectedPing;

    @SuppressWarnings("unused")
    @EventHandler
    public void onDamage(final EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player && event.getDamager() instanceof Player) {
            final Player damager = (Player) event.getDamager();
            final Player entity = (Player) event.getEntity();

            final int pingDamager = damager.getPing();
            final int pingEntity = entity.getPing();

            if (pingDamager > protectedPing && pingEntity > protectedPing) {
                event.setCancelled(true);
                damager.sendMessage(MessagesUtil.playersBadPing);
                return;
            }

            if (pingEntity > protectedPing) {
                event.setCancelled(true);
                damager.sendMessage(MessagesUtil.playerGetDamage);
            }

            if (pingDamager > protectedPing) {
                event.setCancelled(true);
                damager.sendMessage(MessagesUtil.playerDealsDamage);
            }
        }
    }
}
