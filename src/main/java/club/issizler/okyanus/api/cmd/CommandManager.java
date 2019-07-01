package club.issizler.okyanus.api.cmd;

public interface CommandManager {

    /**
     * Registers a command
     *
     * @param cmd Your command builder
     */
    void register(CommandBuilder cmd);

}
