package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSender;
import org.cactoos.BiProc;
import org.cactoos.map.MapEntry;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.BiFunction;

public abstract class RequirementEnvelope implements Requirement {

    private final BiFunction<CommandSender, Map.Entry<String[], Integer>, Boolean> function;
    private final BiProc<CommandSender, String[]> proc;

    RequirementEnvelope(@NotNull final BiFunction<CommandSender, Map.Entry<String[], Integer>, Boolean> function,
                        @NotNull final BiProc<CommandSender, String[]> proc) {
        this.function = function;
        this.proc = proc;
    }

    protected RequirementEnvelope(@NotNull final BiFunction<CommandSender, Map.Entry<String[], Integer>, Boolean> function) {
        this(function, (commandSource, strings) -> {});
    }

    @Override
    public boolean control(@NotNull final CommandSender commandSender, @NotNull String[] arguments, final int location) {
        final boolean control = function.apply(commandSender, new MapEntry<>(arguments, location));
        if (!control)
            try {
                proc.exec(commandSender, arguments);
            } catch (Exception e) {
                e.printStackTrace();
            }
        return control;
    }

}