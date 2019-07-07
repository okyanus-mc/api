package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.entity.Entity;
import club.issizler.okyanus.api.perms.Permissible;

/**
 * Command sender of the command
 */
public interface CommandSender extends Permissible {

    /**
     * Gets name of the sender
     * @return name of the sender
     */
    String getName();

    /**
     * Gets entity of the sender
     *
     * @return {@link Entity} if it's a Entity else returns {@link club.issizler.okyanus.api.entity.mck.MckEntity}
     */
    Entity getEntity();

    /**
     * Sends the command sender a message.
     *
     * @param text the message to send
     */
    void sendMessage(String text);

    /**
     * Gets boolean of if the sender is console
     * @return if the sender is console boolean
     */
    boolean isConsole();

}
