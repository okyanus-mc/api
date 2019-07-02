package club.issizler.okyanus.api.cmd;

import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.perms.Permissible;

import java.util.Optional;

/**
 * This is the source of a command
 */
public interface CommandSource extends Permissible {

    /**
     * Is this source the server console?
     *
     * @return Is this source the server console?
     */
    boolean isConsole();

    /**
     * Send a message to this source.
     * <p>
     * This is either a chat message, in case of a player, or a console log
     * message.
     *
     * @param string Message to send
     */
    void send(String string);

    /**
     * Gets the player that ran this command
     *
     * @return the player
     */
    Optional<Player> getPlayer();

    /**
     * Gets a text argument
     *
     * @param arg Argument name
     * @return Argument value
     */
    Optional<String> getArgText(String arg);

    /**
     * Gets a player argument
     *
     * @param arg Argument name
     * @return Argument value
     */
    Optional<Player> getArgPlayer(String arg);

    @Override
    default String getIdentifier() {
        if (isConsole())
            return "CONSOLE";

        if (getPlayer().isPresent())
            return getPlayer().get().getIdentifier();

        return "UNKNOWN";
    }

}