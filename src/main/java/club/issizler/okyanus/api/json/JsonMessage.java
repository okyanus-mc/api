package club.issizler.okyanus.api.json;

import club.issizler.okyanus.api.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface JsonMessage {

    /**
     * Sends the message to online players
     */
    void sendAll();

    /**
     * Sends the message to the players
     *
     * @param players message to send
     */
    void send(@NotNull final Player... players);

    @NotNull
    @Override
    String toString();

}
