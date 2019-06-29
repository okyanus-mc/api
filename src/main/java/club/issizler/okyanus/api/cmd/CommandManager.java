package club.issizler.okyanus.api.cmd;

import java.util.ServiceLoader;

/**
 * This class is used in registering commands
 * <p>
 * Use {@link CommandManager#getInstance()} to get an instance.
 */
public interface CommandManager {

    /**
     * Gets the implementation of CommandManager
     *
     * @return The implementation
     */
    static CommandManager getInstance() {
        if (_ManagerStatic_pleaseDoNotUseThisHorribleHack.manager == null)
            _ManagerStatic_pleaseDoNotUseThisHorribleHack.manager = ServiceLoader.load(CommandManager.class).iterator().next();

        return _ManagerStatic_pleaseDoNotUseThisHorribleHack.manager;
    }

    /**
     * Registers a command
     *
     * @param cmd Your command builder
     */
    void register(CommandBuilder cmd);

}
