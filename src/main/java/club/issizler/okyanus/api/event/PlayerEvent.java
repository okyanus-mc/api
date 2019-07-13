package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * Marks an {@link Event} as a player event.
 */
public interface PlayerEvent extends Event {

    /**
     * Returns the player that fired this event
     *
     * @return the player that fired this event
     */
    @NotNull
    Player getPlayer();

}
