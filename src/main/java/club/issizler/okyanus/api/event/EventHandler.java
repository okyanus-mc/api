package club.issizler.okyanus.api.event;

import org.jetbrains.annotations.NotNull;

/**
 * This is the event handler class all your event handlers should implement.
 * See {@link EventRegistry} for information on how to use event handlers
 *
 * @param <T> The event you want to handle
 */
public interface EventHandler<T> {

    void handle(@NotNull final T event);

}
