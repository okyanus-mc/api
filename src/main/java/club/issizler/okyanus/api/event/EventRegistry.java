package club.issizler.okyanus.api.event;

import org.jetbrains.annotations.NotNull;

/**
 * This is the global event registry class.
 *
 * You shouldn't use it directly, but use the {@link club.issizler.okyanus.api.Mod#registerEvent(EventHandler)}
 * or {@link club.issizler.okyanus.api.Server#registerEvent(EventHandler)} methods instead.
 */
public interface EventRegistry {

    /**
     * This method registers your events to this event manager
     *
     * @param eventHandler Your event handler class
     */
    void register(@NotNull final EventHandler eventHandler);

    /**
     * This method unregisters your event
     *
     * @param eventHandler YOur event handler class
     */
    void unregister(@NotNull final EventHandler eventHandler);

    /**
     * Trigger an event.
     * While this is mostly used internally, you can use it to trigger your custom events.
     *
     * @param e   Event class
     * @param <E> Event type
     * @return The modified event
     */
    @NotNull
    <E extends Event> E trigger(@NotNull final E e);

}
