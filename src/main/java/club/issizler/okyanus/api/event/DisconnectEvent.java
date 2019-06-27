package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.Player;

/**
 * This event fires whenever a player disconnects from server
 */
public class DisconnectEvent implements PlayerEvent {

    public Player getPlayer() {
        return null;
    }

}
