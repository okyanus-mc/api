package club.issizler.okyanus.api;

import club.issizler.okyanus.api.disappointing._ServerStatic_pleaseDoNotUseThisHorribleHack;
import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.world.World;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.List;

/**
 * Represents a Minecraft Server
 */
public interface Server {

    /**
     * Gets the running server
     *
     * @return The server
     */
    static Server getInstance() {
        if (_ServerStatic_pleaseDoNotUseThisHorribleHack.server == null)
            throw new RuntimeException("Server has not been initialized yet!");

        return _ServerStatic_pleaseDoNotUseThisHorribleHack.server;
    }

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
}
