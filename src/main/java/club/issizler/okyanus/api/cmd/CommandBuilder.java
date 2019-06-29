package club.issizler.okyanus.api.cmd;

/**
 * This is a builder for chat commands
 */
public interface CommandBuilder {

    /**
     * Sets the command name
     *
     * @param name Command name
     * @return The builder
     */
    CommandBuilder name(String name);

    /**
     * Marks the command as OP only
     *
     * @return The builder
     */
    CommandBuilder opOnly();

    /**
     * Adds an (possibly optional) argument to this command
     *
     * @param name       Argument name
     * @param type       Argument type
     * @param isOptional Is this argument optional
     * @return The builder
     * @see CommandBuilder#arg(String, ArgumentType)
     */
    CommandBuilder arg(String name, ArgumentType type, boolean isOptional);

    /**
     * Adds an argument to this command
     *
     * @param name Argument name
     * @param type Argument type
     * @return The builder
     */
    CommandBuilder arg(String name, ArgumentType type);

    /**
     * Adds an sub command to this command
     * A subcommand is created exactly like a normal command.
     *
     * @param subcommand The sub command
     * @return The builder
     */
    CommandBuilder subcommand(CommandBuilder subcommand);

    /**
     * Links the {@link club.issizler.okyanus.api.cmd.CommandRunnable} of your command
     *
     * @param runnable The runnable of your command
     * @return The builder
     */
    CommandBuilder run(CommandRunnable runnable);

}
