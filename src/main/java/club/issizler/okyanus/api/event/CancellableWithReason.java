package club.issizler.okyanus.api.event;

/**
 * Marks an event as cancellable, and attaches a reason for the cancellation.
 */
public interface CancellableWithReason extends Cancellable {

    /**
     * Gets the cancellation reason
     *
     * @return the cancellation reason
     */
    String getCancelReason();

    /**
     * Sets the cancellation reason
     * <p>
     * This will be the text shown to user when
     * this event gets cancelled.
     *
     * @param reason The cancellation reason
     */
    void setCancelReason(String reason);

}
