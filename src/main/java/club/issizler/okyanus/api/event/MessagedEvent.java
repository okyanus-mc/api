package club.issizler.okyanus.api.event;

/**
 * This interface marks an event as having a message attached to it.
 */
public interface MessagedEvent {

    /**
     * Gets the message that has been sent
     *
     * @return The chat message
     */
    String getMessage();

    /**
     * Sets the message
     *
     * @param message The new message
     */
    void setMessage(String message);

}
