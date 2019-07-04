package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.world.Block;

/**
 * This event fires whenever a block has been placed by a player
 */
public interface PlaceEvent extends PlayerEvent, Cancellable, Locatable {

    /**
     * Gets the block that has been placed
     * @return the block that has been placed
     */
    Block getBlock();

}
