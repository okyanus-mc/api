package club.issizler.okyanus.api.cmdnew;

import org.jetbrains.annotations.NotNull;

/**
 * Runs your command
 */
public interface CommandRunnable {

    /**
     * Runs your command with the source
     *
     * @param source is source of the command
     * @return if it was successful 1, else 0
     */
    int run(@NotNull final CommandSource source);

}
