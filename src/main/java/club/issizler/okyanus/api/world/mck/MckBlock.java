package club.issizler.okyanus.api.world.mck;

import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.Block;
import club.issizler.okyanus.api.world.World;

public class MckBlock implements Block {

    @Override
    public Vec3d getLocation() {
        return new Vec3d(0,0,0);
    }

    @Override
    public World getWorld() {
        return new MckWorld();
    }
}
