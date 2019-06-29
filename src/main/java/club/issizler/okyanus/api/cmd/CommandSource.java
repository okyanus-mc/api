package club.issizler.okyanus.api.cmd;

import club.issizler.okyanus.api.Player;

public interface CommandSource {

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
    Player getPlayer();

    /**
     * Gets a text argument
     *
     * @param arg Argument name
     * @return Argument value
     */
    String getArgText(String arg);

    /**
     * Gets a player argument
     *
     * @param arg Argument name
     * @return Argument value
     */
    Player getArgPlayer(String arg);

}