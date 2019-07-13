package club.issizler.okyanus.api;

import club.issizler.okyanus.api.cmd.CommandBuilder;
import club.issizler.okyanus.api.cmdnew.Command;
import club.issizler.okyanus.api.event.EventHandler;
import org.jetbrains.annotations.NotNull;

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
    public void registerEvent(@NotNull final EventHandler e) {
        getServer().getEventRegistry().register(e);
    }

    /**
     * Registers a {@link Command}
     *
     * @param command The command to register
     */
    public void registerCommand(@NotNull final Command command) {
        getServer().getCommandRegistry().register(command);
    }

    /**
     * Registers a {@link CommandBuilder}
     *
     * @deprecated Use {@link #registerCommand(Command)}}
     * @param command The command to register
     */
    @Deprecated
    public void registerCommand(CommandBuilder command) {
        getServer().getOldCommandRegistry().register(command);
    }

}
