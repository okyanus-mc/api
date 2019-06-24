package club.issizler.okyanus.api.cmd;

public class CommandBuilder {

    /** Sets the command name */
    public CommandBuilder name(String name) {
        return this;
    }

    /** Marks the command as OP only */
    public CommandBuilder opOnly() {
        return this;
    }

    /** Links the {@link club.issizler.okyanus.api.cmd.CommandRunnable} of your command */
    public CommandBuilder run(CommandRunnable runnable) {
        return this;
    }

}
