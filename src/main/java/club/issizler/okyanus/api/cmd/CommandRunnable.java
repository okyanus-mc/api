package club.issizler.okyanus.api.cmd;

/**
 * Runs your command
 *
 * @deprecated use {@link club.issizler.okyanus.api.cmdnew.CommandRunnable}
 */
@Deprecated
public interface CommandRunnable {

    /**
     * Runs your command with the source
     *
     * @param source is source of the command
     * @return if it was successful 1, else 0
     */
    int run(CommandSource source);

}
