package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.Player;

public interface PlayerEvent extends Event {

    /**
     * Returns the player that fired this event
     * @return the player that fired this event
     */
    public Player getPlayer();

}
