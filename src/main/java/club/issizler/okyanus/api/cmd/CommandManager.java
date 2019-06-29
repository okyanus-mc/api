package club.issizler.okyanus.api.cmd;

import java.util.ServiceLoader;

/**
 * This class is used in registering commands
 *
 * Use {@link CommandManager#getInstance()} to get an instance.
 */
public interface CommandManager {
    /**
     * Registers a command
     * @param cmd Your command builder
     */
    void register(CommandBuilder cmd);

    /**
     * Gets the implementation of CommandManager
     *
     * @return The implementation
     */
    static CommandManager getInstance() {
        return ServiceLoader.load(CommandManager.class).iterator().next();
    }

}
