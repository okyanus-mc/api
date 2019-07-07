package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSource;
import club.issizler.okyanus.api.cmdnew.RequirementEnvelope;
import club.issizler.okyanus.api.entity.Player;
import org.cactoos.BiProc;

public class InGameReq extends RequirementEnvelope {

    private InGameReq(BiProc<CommandSource, String[]> proc) {
        super((commandSource, entry) -> commandSource instanceof Player, proc);
    }

    public InGameReq(String errorMessage) {
        this((commandSource, strings) -> commandSource.sendMessage(errorMessage));
    }

    public InGameReq() {
        this((commandSource, strings) -> {});
    }


}
