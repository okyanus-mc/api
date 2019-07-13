package club.issizler.okyanus.api.event;

import org.jetbrains.annotations.NotNull;

/**
 * This event fires whenever a player sends a chat message.
 */
public interface ChatEvent extends PlayerEvent, Cancellable, MessagedEvent {

    /**
     * Returns the formatted message
     *
     * @return the formatted message
     */
    @NotNull
    String getFormattedMessage();

    /**
     * Sets the message format
     *
     * @param format the new message format
     */
    void setFormat(@NotNull final String format);

}
