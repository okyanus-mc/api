package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSource;
import club.issizler.okyanus.api.cmdnew.NumberType;
import club.issizler.okyanus.api.cmdnew.RequirementEnvelope;
import org.cactoos.BiProc;
import org.cactoos.Scalar;
import org.cactoos.scalar.And;

/**
 * TODO remove after the argument type improvement
 */
public class NumberReq extends RequirementEnvelope {

    private NumberReq(BiProc<CommandSource, String[]> proc, NumberType... types) {
        super((commandSource, entry) -> {
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

    public NumberReq(String errorMessage, NumberType... types) {
        this((commandSource, strings) -> commandSource.sendMessage(errorMessage), types);
    }

    public NumberReq(NumberType... types) {
        this((commandSource, strings) -> {}, types);
    }

}