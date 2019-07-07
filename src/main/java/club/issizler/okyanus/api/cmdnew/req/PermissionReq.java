package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSource;
import club.issizler.okyanus.api.cmdnew.RequirementEnvelope;
import org.cactoos.BiProc;

public class PermissionReq extends RequirementEnvelope {

    private PermissionReq(BiProc<CommandSource, String[]> proc, String permission) {
        super(((commandSource, entry) -> commandSource.hasPermission(permission)), proc);
    }

    public PermissionReq(String errorMessage, String permission) {
        this((commandSource, strings) -> commandSource.sendMessage(errorMessage), permission);
    }

    public PermissionReq(String permission) {
        this((commandSource, strings) -> {}, permission);
    }

}