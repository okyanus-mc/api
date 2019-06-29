package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.Player;
import club.issizler.okyanus.api.math.Vec3d;

/**
 * This event fires whenever a block has been broken by a player
 */
public class BreakEvent implements PlayerEvent, Cancellable, Locateable {

    private boolean isCancelled;

    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @Override
    public Vec3d getLocation() {
        return null;
    }

}
