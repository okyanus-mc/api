package club.issizler.okyanus.api;

import club.issizler.okyanus.api.chat.MessageType;
import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.World;

import java.util.UUID;

/**
 * This is the representation of a player
 */
public interface Player {

    /**
     * Get player name
     *
     * @return Player name
     */
    String getName();

    /**
     * Get player's custom name
     *
     * @return Custom name
     */
    String getCustomName();

    /**
     * Set player's custom name
     *
     * @param name New custom name
     */
    void setCustomName(String name);

    /**
     * Get player's UUID
     *
     * @return Player's UUID
     */
    UUID getUUID();

    /**
     * Get the players position
     *
     * @return Player's position
     */
    Vec3d getPos();

    /**
     * Get the world the player is in
     *
     * @return the world the player is in
     */
    World getWorld();

    /**
     * Teleport the player
     *
     * @param pos Position to teleport the player to
     */
    void teleport(Vec3d pos);

    /**
     * Send a chat message to this player
     *
     * @param message Message to send
     */
    void send(String message);

    /**
     * Send a message to this player
     *
     * @param message Message to send
     * @param type    Type of the sent message
     */
    void send(String message, MessageType type);

    /**
     * Kick a player from the server
     *
     * @param message The kick message
     */
    void kick(String message);
}
