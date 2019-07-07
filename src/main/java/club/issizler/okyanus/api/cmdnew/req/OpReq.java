package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSource;
import club.issizler.okyanus.api.cmdnew.RequirementEnvelope;
import org.cactoos.BiProc;

public class OpReq extends RequirementEnvelope {

    private OpReq(BiProc<CommandSource, String[]> proc) {
        super(((commandSource, entry) -> commandSource.isOp()), proc);
    }

    public OpReq(String errorMessage) {
        this((commandSource, strings) -> commandSource.sendMessage(errorMessage));
    }

    public OpReq() {
        this((commandSource, strings) -> {});
    }

}