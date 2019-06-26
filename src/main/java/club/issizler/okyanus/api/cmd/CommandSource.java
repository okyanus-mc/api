package club.issizler.okyanus.api.cmd;

import club.issizler.okyanus.api.Player;

public class CommandSource {

    /**
     * Is this source the server console?
     * @return Is this source the server console?
     */
    public boolean isConsole() {
        return false;
    }

    /**
     * Send a message to this source.
     *
     * This is either a chat message, in case of a player, or a console log
     * message.
     *
     * @param string Message to send
     */
    public void send(String string) {
    }

    /**
     * Gets the player that ran this command
     * @return the player
     */
    public Player getPlayer() {
        return null;
    }

    /**
     * Gets a text argument
     *
     * @param arg Argument name
     * @return Argument value
     */
    public String getArgText(String arg) {
        return null;
    }

    /**
     * Gets a player argument
     *
     * @param arg Argument name
     * @return Argument value
     */
    public Player getArgPlayer(String arg) {
        return null;
    }

}