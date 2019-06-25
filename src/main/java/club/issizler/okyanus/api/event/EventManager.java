package club.issizler.okyanus.api.event;

/**
 * This is the global event manager that registers and triggers events.
 * Use {@link EventManager#INSTANCE} to get an instance.
 */
public enum EventManager {
    INSTANCE;

    /**
     * This method registers your events to this event manager
     *
     * @param eventClass Your event handler class
     */
    public void register(EventHandler eventClass) {

    }

    /**
     * Trigger an event.
     * While this is mostly used internally, you can use it to trigger your custom events.
     *
     * @param e Event class
     */
    public void trigger(Event e) {
        
    }

}
