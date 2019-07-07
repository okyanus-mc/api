package club.issizler.okyanus.api.world.mck;

import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.Block;
import club.issizler.okyanus.api.world.Blocks;
import club.issizler.okyanus.api.world.World;

public class MckWorld implements World {

    @Override
    public void setBlockAt(Vec3d pos, Blocks block) {
    }

    @Override
    public Block getBlockAt(Vec3d pos) {
        return new MckBlock();
    }

    @Override
    public String getName() {
        return "";
    }

}
