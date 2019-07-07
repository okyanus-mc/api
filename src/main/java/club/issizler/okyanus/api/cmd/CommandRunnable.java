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
     * @param source
     * @return
     */
    int run(CommandSource source);

}
