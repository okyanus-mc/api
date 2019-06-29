package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.disappointing._EManagerStatic_pleaseDoNotUseThisHorribleHack;

import java.util.ServiceLoader;

/**
 * This is the global event manager that registers and triggers events.
 * Use {@link EventManager#getInstance} to get an instance.
 */
public interface EventManager {

    /**
     * Gets the implementation of EventManager
     *
     * @return The implementation
     */
    static EventManager getInstance() {
        if (_EManagerStatic_pleaseDoNotUseThisHorribleHack.manager == null)
            _EManagerStatic_pleaseDoNotUseThisHorribleHack.manager = ServiceLoader.load(EventManager.class).iterator().next();

        return _EManagerStatic_pleaseDoNotUseThisHorribleHack.manager;
    }

    /**
     * This method registers your events to this event manager
     *
     * @param eventClass Your event handler class
     */
    void register(EventHandler eventClass);

    /**
     * Trigger an event.
     * While this is mostly used internally, you can use it to trigger your custom events.
     *
     * @param e   Event class
     * @param <E> Event type
     * @return The modified event
     */
    <E> E trigger(E e);

}
