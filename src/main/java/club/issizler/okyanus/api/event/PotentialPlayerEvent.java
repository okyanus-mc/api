package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.entity.Player;

import java.util.Optional;

/**
 * Marks an {@link Event} as a potential player event, meaning that event may or may not be associated with a player
 */
public interface PotentialPlayerEvent extends Event {

    /**
     * Returns the player that fired this event if there is one.
     * Returns an empty optional if there isn't.
     *
     * @return the player, or empty
     */
    Optional<Player> getPlayer();

}
