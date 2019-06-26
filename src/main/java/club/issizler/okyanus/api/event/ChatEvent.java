package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.Player;

/**
 * This event fires whenever a player sends a chat message.
 */
public class ChatEvent implements Event, Cancellable {

    /**
     * Gets the chat message that has been sent
     * @return The chat message
     */
    public String getMessage() {
        return "";
    }

    /**
     * Sets the chat message that has been sent
     * @param message The new message
     */
    public void setMessage(String message) {
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
    }

    /**
     * Returns the player that sent this message
     * @return the player that sent this message
     */
    public Player getPlayer() {
        return null;
    }

    /**
     * Returns the formatted message
     * @return the formatted message
     */
    public String getFormattedMessage() {
        return null;
    }

    /**
     * Sets the message format
     * @param format the new message format
     */
    public void setFormat(String format) {
    }
}
