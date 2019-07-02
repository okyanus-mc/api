package club.issizler.okyanus.api;

import club.issizler.okyanus.api.cmd.CommandBuilder;
import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.event.Event;
import club.issizler.okyanus.api.event.EventHandler;
import club.issizler.okyanus.api.world.World;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

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
     * Registers a command
     *
     * @param cmd command to register
     */
    void registerCommand(CommandBuilder cmd);

    /**
     * Registers an event
     *
     * @param e event to register
     */
    void registerEvent(EventHandler e);

    /**
     * Triggers an event
     *
     * @param <E> The event type to trigger
     * @param e Event to trigger.
     *
     * @return The event instance, with any modifications applied by event handlers
     */
    <E extends Event> E triggerEvent(E e);

    /**
     * Gets a player by name
     *
     * @param playerName Name of the player to get
     * @return the player instance
     */
    Optional<Player> getPlayerByName(String playerName);

    /**
     * Execute a console command
     *
     * @param command Command to execute
     */
     void exec(String command);

}
