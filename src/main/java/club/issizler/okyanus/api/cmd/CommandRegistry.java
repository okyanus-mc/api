package club.issizler.okyanus.api.cmd;

/**
 * This is the global command registry class.
 * <p>
 * You shouldn't use it directly, but use the {@link club.issizler.okyanus.api.Mod#registerCommand(CommandBuilder)}
 * or {@link club.issizler.okyanus.api.Server#registerCommand(CommandBuilder)} methods instead.
 */
public interface CommandRegistry {

    /**
     * Registers a command
     *
     * @param cmd Your command builder
     */
    void register(CommandBuilder cmd);

}
