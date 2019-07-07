package club.issizler.okyanus.api.entity.mck;

import club.issizler.okyanus.api.chat.MessageType;
import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.Block;
import club.issizler.okyanus.api.world.World;
import club.issizler.okyanus.api.world.mck.MckBlock;
import club.issizler.okyanus.api.world.mck.MckWorld;

import java.util.Optional;
import java.util.UUID;

public class MckPlayer implements Player {

    @Override
    public Block getTargetBlock(double distance, boolean returnFluids) {
        return new MckBlock();
    }

    @Override
    public void send(String message) {
    }

    @Override
    public void send(String message, MessageType type) {
    }

    @Override
    public void kick(String message) {
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean isOp) {
    }

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

    @Override
    public String getIdentifier() {
        return "";
    }
}
