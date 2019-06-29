package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.entity.Player;

/**
 * Marks an {@link Event} as a player event.
 */
public interface PlayerEvent {

    /**
     * Returns the player that fired this event
     *
     * @return the player that fired this event
     */
    Player getPlayer();

}
