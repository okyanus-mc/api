package club.issizler.okyanus.api.cmdnew;

import org.cactoos.list.ListOf;
import org.jetbrains.annotations.NotNull;

public class CommandOf extends CommandEnvelope {

    public CommandOf(@NotNull final String id, @NotNull final CommandOption... commandOption) {
        super(id, new ListOf<>(commandOption));
    }

}