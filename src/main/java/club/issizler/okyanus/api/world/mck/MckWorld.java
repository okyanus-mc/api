package club.issizler.okyanus.api.world.mck;

import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.Block;
import club.issizler.okyanus.api.world.Blocks;
import club.issizler.okyanus.api.world.World;
import org.jetbrains.annotations.NotNull;

public class MckWorld implements World {

    @Override
    public void setBlockAt(@NotNull Vec3d pos, @NotNull Blocks block) {
    }

    @NotNull
    @Override
    public Block getBlockAt(@NotNull Vec3d pos) {
        return new MckBlock();
    }

    @NotNull
    @Override
    public String getName() {
        return "";
    }

}
