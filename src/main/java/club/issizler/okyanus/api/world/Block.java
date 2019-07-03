package club.issizler.okyanus.api.world;

import club.issizler.okyanus.api.math.Vec3d;

/**
 * Represents a block in the world
 */
public interface Block {

    /**
     * Gets the block's coordinates
     *
     * @return the block's coordinates
     */
    Vec3d getLocation();

}
