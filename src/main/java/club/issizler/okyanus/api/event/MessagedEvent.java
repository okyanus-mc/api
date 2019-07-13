package club.issizler.okyanus.api.event;

import org.jetbrains.annotations.NotNull;

/**
 * This interface marks an event as having a message attached to it.
 */
public interface MessagedEvent {

    /**
     * Gets the message that has been sent
     *
     * @return The chat message
     */
    @NotNull
    String getMessage();

    /**
     * Sets the message
     *
     * @param message The new message
     */
    void setMessage(@NotNull final String message);

}
