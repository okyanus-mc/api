package club.issizler.okyanus.api.cmd;

/**
 * This is a builder for chat commands
 */
public class CommandBuilder {

    /**
     * Sets the command name
     * @param name Command name
     * @return The builder
     */
    public CommandBuilder name(String name) {
        return this;
    }

    /**
     * Marks the command as OP only
     * @return The builder
     */
    public CommandBuilder opOnly() {
        return this;
    }

    /**
     * Links the {@link club.issizler.okyanus.api.cmd.CommandRunnable} of your command
     *
     * @param runnable The runnable of your command
     * @return The builder
     */
    public CommandBuilder run(CommandRunnable runnable) {
        return this;
    }

}
