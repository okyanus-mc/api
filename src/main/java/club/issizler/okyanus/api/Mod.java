package club.issizler.okyanus.api;

import club.issizler.okyanus.api.cmd.CommandBuilder;
import club.issizler.okyanus.api.cmd.CommandManager;
import club.issizler.okyanus.api.event.EventHandler;
import club.issizler.okyanus.api.event.EventManager;

/**
 * Extend this class on the base classes of your mods.
 * <p>
 * Please don't forget to register the initialization method in your <code>fabric.mod.json</code>'s
 * <code>entrypoints.server</code> as <code>com.example.YourMod::init</code>
 */
public abstract class Mod {

    private EventManager eventManager;
    private CommandManager commandManager;

    /**
     * This is your initialization method. Override it to add your custom initialization logic.
     *
     * @see club.issizler.okyanus.api.event.ReadyEvent
     */
    public void init() {
        // These might need refactoring

        eventManager = EventManager.getInstance();
        commandManager = CommandManager.getInstance();
    }

    /**
     * Gets the current server instance
     *
     * @return the server instance
     */
    public Server getServer() {
        // Server is initialized after init(), so we'd need to make sure
        return Server.getInstance();
    }

    /**
     * Registers an {@link EventHandler} into the {@link EventManager}
     *
     * @param e The event handler to register
     */
    public void registerEvent(EventHandler e) {
        eventManager.register(e);
    }

    /**
     * Registers an {@link CommandBuilder} into the {@link CommandManager}
     *
     * @param builder The command to register
     */
    public void registerCommand(CommandBuilder builder) {
        commandManager.register(builder);
    }

}
