package club.issizler.okyanus.api.world.mck;

import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.Block;
import club.issizler.okyanus.api.world.World;
import org.jetbrains.annotations.NotNull;

public class MckBlock implements Block {

    @NotNull
    @Override
    public Vec3d getLocation() {
        return Vec3d.ZERO;
    }

    @NotNull
    @Override
    public World getWorld() {
        return new MckWorld();
    }
}
