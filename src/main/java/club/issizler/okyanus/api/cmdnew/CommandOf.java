package club.issizler.okyanus.api.cmdnew;

import org.cactoos.list.ListOf;

public class CommandOf extends CommandEnvelope {

    public CommandOf(String id, CommandOption... commandOption) {
        super(id, new ListOf<>(commandOption));
    }

}