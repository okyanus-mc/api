package club.issizler.okyanus.api.entity.mck;

import club.issizler.okyanus.api.entity.Entity;
import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.World;
import club.issizler.okyanus.api.world.mck.MckWorld;

import java.util.UUID;

public class MckEntity implements Entity {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getCustomName() {
        return "";
    }

    @Override
    public void setCustomName(String name) {
    }

    @Override
    public Vec3d getPos() {
        return new Vec3d(0,0,0);
    }

    @Override
    public UUID getUUID() {
        return UUID.randomUUID();
    }

    @Override
    public World getWorld() {
        return new MckWorld();
    }

    @Override
    public void teleport(Vec3d pos) {
    }

}
