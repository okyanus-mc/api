package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.entity.mck.MckEntity;

/**
 * This is the source of a command
 */
public interface CommandSource extends CommandSender {

    /**
     * Gets a text argument
     *
     * @return Argument value
     */
    String getArgText();

    /**
     * Gets a player argument
     *
     * If it's null returns {@link club.issizler.okyanus.api.entity.mck.MckPlayer}
     * @return Player
     */
    Player getArgPlayer();

    @Override
    default String getIdentifier() {
        if (isConsole())
            return "CONSOLE";

        if (!(getEntity() instanceof MckEntity))
            return getEntity().getUUID().toString();

        return "UNKNOWN";
    }

}