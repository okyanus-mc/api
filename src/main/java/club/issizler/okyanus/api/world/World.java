package club.issizler.okyanus.api.world;

import club.issizler.okyanus.api.math.Vec3d;

/**
 * Represents a game world
 */
public interface World {

    /**
     * Sets the block at pos to be a block
     *
     * @param pos   The position
     * @param block The new block
     */
    void setBlockAt(Vec3d pos, Blocks block);

}
