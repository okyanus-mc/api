package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This is the source of a command
 */
public interface CommandSource {

    /**
     * Gets a text argument
     *
     * @return Argument value
     */
    @NotNull
    String getArgText();

    /**
     * Gets a player argument
     *
     * If it's null returns {@link club.issizler.okyanus.api.entity.mck.MckPlayer}
     * @return Player
     */
    @NotNull
    Player getArgPlayer();

    /**
     * Gets a text argument
     *
     * @param commandId is command/sub-command id
     * @return Argument value
     */
    @NotNull
    String getArgText(@NotNull final String commandId);

    /**
     * Gets a player argument
     *
     * If it's null returns {@link club.issizler.okyanus.api.entity.mck.MckPlayer}
     *
     * @param commandId is command/sub-command id
     * @return Player
     */
    @NotNull
    Player getArgPlayer(@NotNull final String commandId);

    /**
     * Gets sender of the command
     *
     * @return {@link CommandSender}
     */
    @NotNull
    CommandSender getCommandSender();

}