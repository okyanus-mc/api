package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.world.Block;
import org.jetbrains.annotations.NotNull;

/**
 * This event fires whenever a block has been placed by a player
 */
public interface PlaceEvent extends PlayerEvent, Cancellable, Locatable {

    /**
     * Gets the block that has been placed
     * @return the block that has been placed
     */
    @NotNull
    Block getBlock();

}
