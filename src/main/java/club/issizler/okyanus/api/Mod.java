package club.issizler.okyanus.api;

import club.issizler.okyanus.api.cmd.CommandBuilder;
import club.issizler.okyanus.api.event.EventHandler;

/**
 * Extend this class on the base classes of your mods.
 * <p>
 * Please don't forget to register the initialization method in your <code>fabric.mod.json</code>'s
 * <code>entrypoints.server</code> as <code>com.example.YourMod::init</code>
 */
public abstract class Mod {

    /**
     * This is your initialization method. Override it to add your custom initialization logic.
     *
     * @see club.issizler.okyanus.api.event.ReadyEvent
     */
    public abstract void init();

    /**
     * Gets the current server instance
     *
     * @return the server instance
     */
    public Server getServer() {
        return Okyanus.getServer();
    }

    /**
     * Registers an {@link EventHandler}
     *
     * @param e The event handler to register
     */
    public void registerEvent(EventHandler e) {
        getServer().registerEvent(e);
    }

    /**
     * Registers a {@link CommandBuilder}
     *
     * @param builder The command to register
     */
    public void registerCommand(CommandBuilder builder) {
        getServer().registerCommand(builder);
    }

}
