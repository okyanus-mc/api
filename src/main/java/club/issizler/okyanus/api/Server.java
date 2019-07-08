package club.issizler.okyanus.api;

import club.issizler.okyanus.api.cmd.CommandBuilder;
import club.issizler.okyanus.api.cmdnew.Command;
import club.issizler.okyanus.api.cmdnew.CommandRegistry;
import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.event.Event;
import club.issizler.okyanus.api.event.EventHandler;
import club.issizler.okyanus.api.event.EventRegistry;
import club.issizler.okyanus.api.world.World;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.List;

/**
 * Represents a Minecraft Server
 */
public interface Server {

    /**
     * Gets the server name
     *
     * @return the name of the server
     */
    String getName();

    /**
     * Gets the version of the server
     *
     * @return the version of the server
     */
    String getVersion();

    /**
     * Gets the logger of the server
     *
     * @return the logger of the server
     */
    Logger getLogger();

    /**
     * Gets all the online players in the server
     *
     * @return online players in the server
     */
    Collection<Player> getPlayerList();

    /**
     * Gets all worlds in this server
     *
     * @return all worlds in this server
     */
    List<World> getWorlds();

    /**
     * Checks if we are running inside the server's main thread
     *
     * @return are we running inside the main thread
     */
    boolean isMainThread();

    /**
     * Gets a player by name
     * If there is not player it returns {@link club.issizler.okyanus.api.entity.mck.MckPlayer}
     *
     * @param playerName Name of the player to get
     * @return the player instance
     */
    Player getPlayerByName(String playerName);

    /**
     * Runs the given command and sends it to the command
     * dispatcher from the implementing dispatcher.
     *
     * @param command the command to handle, without the "/"
     */
    void runCommand(String command);

    /**
     * Gets command registry for
     * register commands.
     *
     * @return {@link CommandRegistry}
     */
    CommandRegistry getCommandRegistry();

    /**
     * Gets event registry for
     * register and trigger events
     *
     * @return {@link CommandRegistry}
     */
    EventRegistry getEventRegistry();

    /**
     * Sends a message to all online players
     * @param message Message to send
     */
    void broadcast(String message);

    /**
     * Execute a console command
     * dispatcher from the implementing dispatcher.
     *
     * @deprecated Use {@link #runCommand(String)}
     * @param command Command to execute
     */
    @Deprecated
    void exec(String command);

    /**
     * Registers a command
     *
     * @deprecated use {@link #getCommandRegistry().register( Command )}
     * @param cmd command to register
     */
    @Deprecated
    void registerCommand(CommandBuilder cmd);

    /**
     * Registers an event
     *
     * @deprecated Use {@link #getEventRegistry().trigger(#EventHandler)}
     * @param e event to register
     */
    @Deprecated
    void registerEvent(EventHandler e);

    /**
     * Triggers an event
     *
     * @deprecated Use {@link #getEventRegistry().register(#EventHandler)}
     * @param <E> The event type to trigger
     * @param e   Event to trigger.
     * @return The event instance, with any modifications applied by event handlers
     */
    @Deprecated
    <E extends Event> E triggerEvent(E e);

    /**
     * Gets old command registry class
     *
     * @deprecated Use {@link #getCommandRegistry()}
     * @return {@link club.issizler.okyanus.api.cmd.CommandRegistry}
     */

    @Deprecated
    club.issizler.okyanus.api.cmd.CommandRegistry getOldCommandRegistry();

}
