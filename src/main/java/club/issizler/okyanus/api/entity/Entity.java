package club.issizler.okyanus.api.entity;

import club.issizler.okyanus.api.cmdnew.CommandSender;
import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * This is the representation of an entity
 */
public interface Entity extends CommandSender {

    /**
     * Get entity's custom name
     *
     * @return Custom name
     */
    @NotNull
    String getCustomName();

    /**
     * Set entity's custom name
     *
     * @param name New custom name
     */
    void setCustomName(@NotNull final String name);

    /**
     * Get entity's position
     *
     * @return Entity's position
     */
    @NotNull
    Vec3d getPos();

    /**
     * Get entity's UUID
     *
     * @return Entity's UUID
     */
    @NotNull
    UUID getUUID();

    /**
     * Get the world the entity is in
     *
     * @return the world the entity is in
     */
    @NotNull
    World getWorld();

    /**
     * Teleport the entity
     *
     * @param pos Position to teleport the entity to
     */
    void teleport(@NotNull final Vec3d pos);

}
