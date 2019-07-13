package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSender;
import org.cactoos.BiProc;
import org.cactoos.scalar.And;
import org.jetbrains.annotations.NotNull;

public class CommandSenderReq extends RequirementEnvelope {

    private CommandSenderReq(@NotNull final BiProc<CommandSender, String[]> proc,
                             @NotNull final CommandSenderType... types) {
        super((commandSender, entry) -> {
                try {
                    return new And(
                        input -> {
                            return input.isTypeOf(commandSender);
                        },
                        types
                    ).value();
                } catch (Exception e) {
                    return false;
                }
            },
            proc
        );
    }

    public CommandSenderReq(@NotNull final String errorMessage, @NotNull final CommandSenderType... types) {
        this((commandSender, strings) -> commandSender.sendMessage(errorMessage), types);
    }

    public CommandSenderReq(@NotNull final CommandSenderType... types) {
        this((commandSender, strings) -> {}, types);
    }

}