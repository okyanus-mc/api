package club.issizler.okyanus.api.event;

/**
 * This event fires whenever a player sends a chat message.
 */
public interface ChatEvent extends PlayerEvent, Cancellable {

    /**
     * Gets the chat message that has been sent
     *
     * @return The chat message
     */
    String getMessage();

    /**
     * Sets the chat message that has been sent
     *
     * @param message The new message
     */
    void setMessage(String message);

    /**
     * Returns the formatted message
     *
     * @return the formatted message
     */
    String getFormattedMessage();

    /**
     * Sets the message format
     *
     * @param format the new message format
     */
    void setFormat(String format);

}
