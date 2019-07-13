package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.entity.Entity;
import club.issizler.okyanus.api.perms.Permissible;
import org.jetbrains.annotations.NotNull;

/**
 * Command sender of the command
 */
public interface CommandSender extends Permissible {

    /**
     * Sends this sender multiple messages
     *
     * @param messages An array of messages to be displayed
     */
    void sendMessage(@NotNull final String... messages);

    /**
     * Gets the name of this command sender
     *
     * @return Name of the sender
     */
    @NotNull
    String getName();

    @NotNull
    @Override
    default String getIdentifier() {
        if (this instanceof ConsoleCommandSender)
            return "CONSOLE";

        if (!(this instanceof Entity))
            return "UNKNOWN";

        return ((Entity) this).getUUID().toString();
    }

}
