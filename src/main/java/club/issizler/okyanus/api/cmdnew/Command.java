package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.cmd.ArgumentType;
import club.issizler.okyanus.api.cmdnew.req.Requirement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Command {

    /**
     * Gets id of the command or sub-command
     *
     * @return id of the command or sub-command
     */
    @NotNull
    String getId();

    /**
     * Gets name of the command or sub-command
     *
     * @return label of the command or sub-command
     */
    @NotNull
    String getLabel();

    /**
     * Gets aliases the the command or sub-command
     *
     * @return aliases of the command or sub-command
     */
    @NotNull
    List<String> getAliases();

    /**
     * Gets type of the command or sub-command
     *
     * @return {@link ArgumentType}
     */
    @NotNull
    ArgumentType getType();

    /**
     * Gets execute method of the command
     *
     * @return {@link CommandRunnable}
     */
    @NotNull
    CommandRunnable getRunnable();

    /**
     * Gets sub-command of the command
     *
     * @return {@link Command}
     */
    @NotNull
    List<Command> getSubCommands();

    /**
     * Gets requirements of command or sub-command
     *
     * @return {@link List< Requirement >}
     */
    @NotNull
    List<Requirement> getRequirements();

    /**
     * Sets active to command
     *
     * @param active boolean to set
     */
    void setActive(boolean active);

    /**
     * Gets active situtaion of the command
     *
     * @return if the command is active
     */
    boolean isActive();

}
