package club.issizler.okyanus.api.cmd;

import club.issizler.okyanus.api.disappointing._CManagerStatic_pleaseDoNotUseThisHorribleHack;

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
        if (_CManagerStatic_pleaseDoNotUseThisHorribleHack.manager == null)
            _CManagerStatic_pleaseDoNotUseThisHorribleHack.manager = ServiceLoader.load(CommandManager.class).iterator().next();

        return _CManagerStatic_pleaseDoNotUseThisHorribleHack.manager;
    }

    /**
     * Registers a command
     *
     * @param cmd Your command builder
     */
    void register(CommandBuilder cmd);

}
