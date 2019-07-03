package club.issizler.okyanus.api.event;

/**
 * This event fires on any command execution.
 */
public interface RawCommandEvent extends Cancellable, PotentialPlayerEvent {

    /**
     * Gets the executed command
     * @return the executed command
     */
    String getCommand();

    /**
     * Modifies the executed command
     * @param command the new command
     */
    void setCommand(String command);
}
