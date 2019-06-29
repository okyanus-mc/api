package club.issizler.okyanus.api.event;

/**
 * This event fires whenever a player connects the server
 */
public interface ConnectEvent extends PlayerEvent, Cancellable {

    /**
     * Sets the cancellation reason
     *
     * This will be the text shown to user when
     * this event gets cancelled.
     */
    void setCancelReason(String reason);

}
