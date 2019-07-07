package club.issizler.okyanus.api.cmdnew;

import org.cactoos.BiProc;
import org.cactoos.map.MapEntry;

import java.util.Map;
import java.util.function.BiFunction;

public abstract class RequirementEnvelope implements Requirement {

    private final BiFunction<CommandSource, Map.Entry<String[], Integer>, Boolean> function;
    private final BiProc<CommandSource, String[]> proc;

    public RequirementEnvelope(BiFunction<CommandSource, Map.Entry<String[], Integer>, Boolean> function,
                               BiProc<CommandSource, String[]> proc) {
        this.function = function;
        this.proc = proc;
    }

    public RequirementEnvelope(BiFunction<CommandSource, Map.Entry<String[], Integer>, Boolean> function) {
        this(function, (commandSource, strings) -> {});
    }

    @Override
    public boolean control(CommandSource commandSource, String[] arguments, int location) {
        final boolean control = function.apply(commandSource, new MapEntry<>(arguments, location));
        if (!control)
            try {
                proc.exec(commandSource, arguments);
            } catch (Exception e) {
                e.printStackTrace();
            }
        return control;
    }

}