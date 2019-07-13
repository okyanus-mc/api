package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.world.Block;
import org.jetbrains.annotations.NotNull;

/**
 * This event fires whenever a block has been broken by a player
 */
public interface BreakEvent extends PlayerEvent, Cancellable, Locatable {

    /**
     * Gets the block that has been broken
     * @return the block that has been broken
     */
    @NotNull
    Block getBlock();

}
