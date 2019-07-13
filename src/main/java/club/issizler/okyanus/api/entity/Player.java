package club.issizler.okyanus.api.entity;

import club.issizler.okyanus.api.chat.MessageType;
import club.issizler.okyanus.api.json.JsonCompound;
import club.issizler.okyanus.api.world.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

/**
 * This is the representation of a player
 */
public interface Player extends Entity {

    /**
     * Gets the block the player is looking at
     *
     * @param distance     How far should we check before giving up
     * @param returnFluids Should we return fluids?
     * @return Block, or empty if we couldn't find anything or we found an entity
     */
    Optional<Block> getTargetBlock(double distance, boolean returnFluids);

    /**
     * Send a json message to this player
     *
     * @param jsonCompound Json message to send
     */
    void sendRawJson(@NotNull final JsonCompound jsonCompound);

    /**
     * Sends a title and a subtitle message to the player. If they are empty strings,
     * the display will clear.
     *
     * @param title Title text
     * @param subtitle Subtitle text
     * @param fadeIn time in ticks for titles to fade in. Defaults to 10.
     * @param stay time in ticks for titles to stay. Defaults to 70.
     * @param fadeOut time in ticks for titles to fade out. Defaults to 20.
     */
    void sendTitle(@NotNull final String title, @NotNull final String subtitle, int fadeIn, int stay, int fadeOut);

    /**
     * Kick a player from the server
     *
     * @param message The kick message
     */
    void kick(@NotNull final String message);

    /**
     * Send a chat message to this player
     *
     * @param message Message to send
     * @deprecated Use {@link #sendMessage(String...)}
     */
    @Deprecated
    void send(String message);

    /**
     * Send a message to this player
     *
     * @param message Message to send
     * @param type    Type of the sent message
     * @deprecated Use {@link #sendMessage(String...)}
     */
    @Deprecated
    void send(String message, MessageType type);

}
