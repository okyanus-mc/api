package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.cmd.ArgumentType;

import java.util.List;

public interface Command {

    /**
     * Gets id of the command or sub-command
     *
     * @return id of the command or sub-command
     */
    String getId();

    /**
     * Gets name of the command or sub-command
     *
     * @return label of the command or sub-command
     */
    String getLabel();

    /**
     * Gets aliases the the command or sub-command
     *
     * @return aliases of the command or sub-command
     */
    List<String> getAliases();

    /**
     * Gets type of the command or sub-command
     *
     * @return {@link ArgumentType}
     */
    ArgumentType getType();

    /**
     * Gets execute method of the command
     *
     * @return {@link CommandRunnable}
     */
    CommandRunnable getRunnable();

    /**
     * Gets sub-command of the command
     *
     * @return {@link Command}
     */
    List<Command> getSubCommands();

    /**
     * Gets requirements of command or sub-command
     *
     * @return {@link List<Requirement>}
     */
    List<Requirement> getRequirements();

}
