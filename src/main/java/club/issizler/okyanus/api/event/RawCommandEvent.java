package club.issizler.okyanus.api.event;

import org.jetbrains.annotations.NotNull;

/**
 * This event fires on any command execution.
 */
public interface RawCommandEvent extends Cancellable, PotentialPlayerEvent {

    /**
     * Gets the executed command
     * @return the executed command
     */
    @NotNull
    String getCommand();

    /**
     * Modifies the executed command
     * @param command the new command
     */
    void setCommand(@NotNull final String command);
}
