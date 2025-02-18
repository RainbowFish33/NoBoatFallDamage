package me.honeyberries.noBoatFallDamage;

import org.bukkit.entity.Boat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageListener implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        // Check if the damaged entity is a player
        if (event.getEntity() instanceof Player player) {

            // Check if the damage cause is fall
            if (event.getCause() == EntityDamageEvent.DamageCause.FALL) {

                // Check if the player is inside a boat
                if (player.getVehicle() instanceof Boat) {
                    // Cancel the fall damage
                    NoBoatFallDamage.getInstance().getServer().getLogger().info(player.getName() +
                            " has been prevented from boat fall damage");

                    event.setCancelled(true);

                }
            }
        }
    }

}
