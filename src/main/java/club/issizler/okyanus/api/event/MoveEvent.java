package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.Player;

/**
 * This event fires whenever a player has moved
 */
public class MoveEvent implements Event, Cancellable {

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
    }

    /**
     * Returns the player that moved
     * @return the player that moved
     */
    public Player getPlayer() {
        return null;
    }
}
