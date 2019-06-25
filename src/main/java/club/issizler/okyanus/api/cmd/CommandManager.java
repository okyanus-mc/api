package club.issizler.okyanus.api.cmd;

/**
 * This class is used in registering commands
 *
 * Use {@link CommandManager#INSTANCE} to get an instance.
 */
public enum CommandManager {
    INSTANCE;

    /**
     * Registers a command
     * @param cmd Your command builder
     */
    public void register(CommandBuilder cmd) {
    }

}
