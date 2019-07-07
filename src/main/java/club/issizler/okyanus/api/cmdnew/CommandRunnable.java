package club.issizler.okyanus.api.cmdnew;

/**
 * Runs your command
 */
public interface CommandRunnable {

    /**
     * Runs your command with the source
     * @param source
     * @return
     */
    int run(CommandSource source);

}
