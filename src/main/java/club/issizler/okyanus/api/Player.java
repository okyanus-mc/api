package club.issizler.okyanus.api;

import club.issizler.okyanus.api.chat.MessageType;
import club.issizler.okyanus.api.math.Vec3d;
import club.issizler.okyanus.api.world.World;

import java.util.UUID;

/**
 * This is the representation of a player
 */
public class Player {

    /**
     * Get player name
     * @return Player name
     */
    public String getName() {
        return null;
    }

    /**
     * Get player's custom name
     * @return Custom name
     */
    public String getCustomName() {
        return null;
    }

    /**
     * Set player's custom name
     * @param name New custom name
     */
    public void setCustomName(String name) {
    }

    /**
     * Get player's UUID
     * @return Player's UUID
     */
    public UUID getUUID() {
        return null;
    }

    /**
     * Get the players position
     * @return Player's position
     */
    public Vec3d getPos() {
        return null;
    }

    /**
     * Get the world the player is in
     * @return the world the player is in
     */
    public World getWorld() {
        return null;
    }

    /**
     * Teleport the player
     * @param pos Position to teleport the player to
     */
    public void teleport(Vec3d pos) {
    }

    /**
     * Send a chat message to this player
     * @param message Message to send
     */
    public void send(String message) {
    }

    /**
     * Send a message to this player
     * @param message Message to send
     * @param type Type of the sent message
     */
    public void send(String message, MessageType type) {
    }

    /**
     * Kick a player from the server
     * @param message The kick message
     */
    public void kick(String message) {
    }
}
