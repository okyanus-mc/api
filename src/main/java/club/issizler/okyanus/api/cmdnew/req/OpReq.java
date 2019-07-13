package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSender;
import org.cactoos.BiProc;
import org.jetbrains.annotations.NotNull;

public class OpReq extends RequirementEnvelope {

    private OpReq(@NotNull final BiProc<CommandSender, String[]> proc) {
        super(((commandSender, entry) -> commandSender.isOp()), proc);
    }

    public OpReq(@NotNull final String errorMessage) {
        this((commandSender, strings) -> commandSender.sendMessage(errorMessage));
    }

    public OpReq() {
        this((commandSender, strings) -> {});
    }

}