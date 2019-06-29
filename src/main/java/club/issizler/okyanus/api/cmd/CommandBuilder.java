package club.issizler.okyanus.api.cmd;

import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a builder for chat commands
 */
public class CommandBuilder {

    private String name;
    private boolean isOpOnly = false;

    private CommandRunnable runnable;

    private List<Triple<String, ArgumentType, Boolean>> args = new ArrayList<>();
    private List<CommandBuilder> subCommands = new ArrayList<>();

    /**
     * Sets the command name
     *
     * @param name Command name
     * @return The builder
     */
    public CommandBuilder name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Marks the command as OP only
     *
     * @return The builder
     */
    public CommandBuilder opOnly() {
        this.isOpOnly = true;
        return this;
    }

    /**
     * Adds an (possibly optional) argument to this command
     *
     * @see CommandBuilder#arg(String, ArgumentType)
     */
    public CommandBuilder arg(String name, ArgumentType type) {
        return arg(name, type, false);
    }

    /**
     * Adds an argument to this command
     *
     * @param name Argument name
     * @param type Argument type
     * @return The builder
     */
    public CommandBuilder arg(String name, ArgumentType type, boolean isOptional) {
        this.args.add(new ImmutableTriple<>(name, type, isOptional));
        return this;
    }

    /**
     * Adds an sub command to this command
     * A subcommand is created exactly like a normal command.
     *
     * @param subcommand The sub command
     * @return The builder
     */
    public CommandBuilder subcommand(CommandBuilder subcommand) {
        this.subCommands.add(subcommand);
        return this;
    }

    /**
     * Links the {@link club.issizler.okyanus.api.cmd.CommandRunnable} of your command
     *
     * @param runnable The runnable of your command
     * @return The builder
     */
    public CommandBuilder run(CommandRunnable runnable) {
        this.runnable = runnable;
        return this;
    }

    /**
     * Gets the name of this command
     *
     * @return The name of this command
     */
    public String getName() {
        return this.name;
    }

    /**
     * Is this command OP only
     *
     * @return Is this command OP only
     */
    public boolean isOpOnly() {
        return this.isOpOnly;
    }

    /**
     * Gets the runnable of this command
     *
     * @return The runanble of this command
     */
    public CommandRunnable getRunnable() {
        return this.runnable;
    }

    /**
     * Gets the arguments of this command
     *
     * @return The arguments of this command
     */
    public List<Triple<String, ArgumentType, Boolean>> getArgs() {
        return this.args;
    }

    /**
     * Gets the subcommands of this command
     *
     * @return The subcommands of this command
     */
    public List<CommandBuilder> getSubCommands() {
        return this.subCommands;
    }

}
