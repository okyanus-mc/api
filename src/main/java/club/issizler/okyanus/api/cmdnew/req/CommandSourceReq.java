package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSource;
import club.issizler.okyanus.api.cmdnew.CommandSourceType;
import club.issizler.okyanus.api.cmdnew.RequirementEnvelope;
import org.cactoos.BiProc;
import org.cactoos.Scalar;
import org.cactoos.scalar.And;

public class CommandSourceReq extends RequirementEnvelope {

    private CommandSourceReq(BiProc<CommandSource, String[]> proc, CommandSourceType... types) {
        super((commandSource, entry) -> {
                final Scalar<Boolean> and = new And(
                    input -> {
                        return input.isTypeOf(commandSource);
                    },
                    types
                );
                try {
                    return and.value();
                } catch (Exception e) {
                    return false;
                }
            },
            proc
        );
    }

    public CommandSourceReq(String errorMessage, CommandSourceType... types) {
        this((commandSource, strings) -> commandSource.sendMessage(errorMessage), types);
    }

    public CommandSourceReq(CommandSourceType... types) {
        this((commandSource, strings) -> {}, types);
    }

}