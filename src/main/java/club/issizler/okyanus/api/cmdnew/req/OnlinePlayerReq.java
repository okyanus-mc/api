package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.Okyanus;
import club.issizler.okyanus.api.cmdnew.CommandSender;
import club.issizler.okyanus.api.entity.mck.MckPlayer;
import org.cactoos.BiProc;
import org.jetbrains.annotations.NotNull;

public class OnlinePlayerReq extends RequirementEnvelope {

    private OnlinePlayerReq(@NotNull final BiProc<CommandSender, String[]> proc) {
        super((commandSender, entry) ->
            !(Okyanus.getServer().getPlayerByName(entry.getKey()[entry.getValue()]) instanceof MckPlayer),
            proc
        );
    }

    public OnlinePlayerReq(@NotNull final String errorMessage) {
        this((commandSender, strings) -> commandSender.sendMessage(errorMessage));
    }

    public OnlinePlayerReq() {
        this((commandSender, strings) -> {});
    }

}
