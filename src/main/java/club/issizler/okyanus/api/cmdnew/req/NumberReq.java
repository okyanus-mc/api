package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSender;
import org.cactoos.BiProc;
import org.cactoos.Scalar;
import org.cactoos.scalar.And;
import org.jetbrains.annotations.NotNull;

/**
 * TODO remove after the argument type improvement
 */
public class NumberReq extends RequirementEnvelope {

    private NumberReq(@NotNull final BiProc<CommandSender, String[]> proc, @NotNull final NumberType... types) {
        super((commandSender, entry) -> {
                final String strings = entry.getKey()[entry.getValue()];
                final Scalar<Boolean> and = new And(
                    input -> {
                        return input.isTypeOf(strings);
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

    public NumberReq(@NotNull final String errorMessage, @NotNull final NumberType... types) {
        this((commandSender, strings) -> commandSender.sendMessage(errorMessage), types);
    }

    public NumberReq(@NotNull final NumberType... types) {
        this((commandSender, strings) -> {}, types);
    }

}