package club.issizler.okyanus.api.event;

/**
 * This is the event handler class all your event handlers should implement.
 * See {@link EventManager} for information on how to use event handlers
 *
 * @param <T> The event you want to handle
 */
public interface EventHandler<T extends Event> {

    public void handle(T event);

}
