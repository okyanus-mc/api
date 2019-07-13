package club.issizler.okyanus.api.json;

import club.issizler.okyanus.api.Okyanus;
import club.issizler.okyanus.api.entity.Player;
import org.cactoos.Proc;
import org.cactoos.scalar.And;
import org.jetbrains.annotations.NotNull;

public final class JsonMessageOf implements JsonMessage {

    private final JsonCompound[] compounds;

    public JsonMessageOf(@NotNull final JsonCompound... compounds) {
        this.compounds = compounds;
    }

    @Override
    public void sendAll() {
        try {
            new And(
                (Proc<Player>) this::send,
                Okyanus.getServer().getPlayerList()
            ).value();
        } catch (Exception e) {
            // Ignore...
        }
    }

    @Override
    public void send(@NotNull Player... players) {
        try {
            new And(
                player -> {
                    new And(
                        player::sendRawJson,
                        compounds
                    ).value();
                },
                players
            ).value();
        } catch (Exception e) {
            // Ignore...
        }
    }

    @NotNull
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        for (JsonCompound compound : compounds)
            builder.append(compound.convert()).append(",");

        return builder.append("]").toString();
    }

}