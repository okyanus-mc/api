package club.issizler.okyanus.api.entity.mck;

import club.issizler.okyanus.api.chat.MessageType;
import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.json.JsonCompound;
import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.Block;
import club.issizler.okyanus.api.world.World;
import club.issizler.okyanus.api.world.mck.MckBlock;
import club.issizler.okyanus.api.world.mck.MckWorld;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.UUID;

public class MckPlayer implements Player {

    @Override
    public Optional<Block> getTargetBlock(double distance, boolean returnFluids) {
        return Optional.of(new MckBlock());
    }

    @Override
    public void send(String message) {
    }

    @Override
    public void send(String message, MessageType type) {
    }

    @Override
    public void sendRawJson(@NotNull JsonCompound jsonCompound) {
    }

    @Override
    public void sendTitle(@NotNull String title, @NotNull String subtitle, int fadeIn, int stay, int fadeOut) {
    }

    @Override
    public void kick(@NotNull String message) {
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean isOp) {
    }

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

    @NotNull
    @Override
    public String getIdentifier() {
        return "";
    }

    @Override
    public void sendMessage(@NotNull final String... messages) {
    }

}
