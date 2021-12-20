package nl.lucasridder.lcore.Listeners;

import nl.lucasridder.lcore.Managers.Teams;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractEvent implements Listener {

    @EventHandler
    public void respawn(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if((!Teams.blue.contains(player) || !Teams.red.contains(player)) && !player.isOp()) {
            e.setCancelled(true);
        } else {
            //TODO check arena bounds
        }
    }

}
