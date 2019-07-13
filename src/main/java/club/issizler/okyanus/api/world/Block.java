package club.issizler.okyanus.api.world;

import club.issizler.okyanus.api.math.Vec3d;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a block in the world
 */
public interface Block {

    /**
     * Gets the block's coordinates
     *
     * @return the block's coordinates
     */
    @NotNull
    Vec3d getLocation();

    /**
     * Gets the block's world
     *
     * @return the block's world
     */
    @NotNull
    World getWorld();

}
