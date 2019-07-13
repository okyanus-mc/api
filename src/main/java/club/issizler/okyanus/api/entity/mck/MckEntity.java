package club.issizler.okyanus.api.entity.mck;

import club.issizler.okyanus.api.entity.Entity;
import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.World;
import club.issizler.okyanus.api.world.mck.MckWorld;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class MckEntity implements Entity {

    @NotNull
    @Override
    public String getName() {
        return "";
    }

    @NotNull
    @Override
    public String getCustomName() {
        return "";
    }

    @Override
    public void setCustomName(@NotNull String name) {
    }

    @NotNull
    @Override
    public Vec3d getPos() {
        return new Vec3d(0,0,0);
    }

    @NotNull
    @Override
    public UUID getUUID() {
        return UUID.randomUUID();
    }

    @NotNull
    @Override
    public World getWorld() {
        return new MckWorld();
    }

    @Override
    public void teleport(@NotNull Vec3d pos) {
    }

    @Override
    public void sendMessage(@NotNull final String... messages) {
    }

}
