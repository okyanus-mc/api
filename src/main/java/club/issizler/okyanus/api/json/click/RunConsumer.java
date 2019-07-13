package club.issizler.okyanus.api.json.click;

import club.issizler.okyanus.api.Okyanus;
import club.issizler.okyanus.api.cmdnew.Command;
import club.issizler.okyanus.api.cmdnew.CommandOf;
import club.issizler.okyanus.api.cmdnew.req.CommandSenderReq;
import club.issizler.okyanus.api.cmdnew.req.CommandSenderType;
import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.json.JsonEvent;
import org.cactoos.Proc;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

import static club.issizler.okyanus.api.cmdnew.CommandOptions.*;

public final class RunConsumer implements JsonEvent {

    private final UUID uuid = UUID.randomUUID();
    private final Command command;

    public RunConsumer(boolean removeAfter, @NotNull final Proc<Player> proc) {
        command = new CommandOf(
            "uuid",
            label(uuid.toString()),
            requirements(
                new CommandSenderReq(CommandSenderType.PLAYER)
            ),
            run(source -> {
                try {
                    proc.exec((Player) source);
                    if (removeAfter)
                        unregister();
                    return 1;
                } catch (Exception e) {
                    return 0;
                }
            })
        );
        Okyanus.getServer().getCommandRegistry().register(command);
    }

    public RunConsumer(@NotNull final Proc<Player> proc) {
        this(false, proc);
    }

    @NotNull
    @Override
    public String action() {
        return "run_command";
    }

    @NotNull
    @Override
    public String value() {
        return "\"/" + uuid + "\"";
    }

    private void unregister() {
        Okyanus.getServer().getCommandRegistry().unregister(command);
    }

}
