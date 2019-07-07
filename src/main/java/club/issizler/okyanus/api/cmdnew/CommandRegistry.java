package club.issizler.okyanus.api.cmdnew;

import java.util.List;

/**
 * Registers the commands
 */
public interface CommandRegistry {

    /**
     * Register command
     *
     * @param cmd {@link Command}
     */
    void register(Command cmd);

    /**
     * Gets the command
     *
     * @param commandLabel is command label of the commad
     * @return {@link Command}
     */
    Command getCommand(String commandLabel);

    /**
     * Gets all commands in the server
     *
     * @return {@link List<Command>}
     */
    List<Command> getCommands();

}
