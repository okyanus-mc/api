package club.issizler.okyanus.api.cmd;

public interface CommandRegistry {

    /**
     * Registers a command
     *
     * @param cmd Your command builder
     */
    void register(CommandBuilder cmd);

}
