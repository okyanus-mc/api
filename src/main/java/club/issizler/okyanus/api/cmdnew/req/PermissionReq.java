package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSender;
import org.cactoos.BiProc;
import org.jetbrains.annotations.NotNull;

public class PermissionReq extends RequirementEnvelope {

    private PermissionReq(@NotNull final BiProc<CommandSender, String[]> proc, @NotNull final String permission) {
        super(((commandSender, entry) -> commandSender.hasPermission(permission)), proc);
    }

    public PermissionReq(@NotNull final String errorMessage, @NotNull final String permission) {
        this((commandSender, strings) -> commandSender.sendMessage(errorMessage), permission);
    }

    public PermissionReq(@NotNull final String permission) {
        this((commandSender, strings) -> {}, permission);
    }

}