package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.cmd.ArgumentType;
import club.issizler.okyanus.api.cmdnew.req.Requirement;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.BiFunction;

import static club.issizler.okyanus.api.cmdnew.OptionType.*;

public class CommandOptions {

    private CommandOptions() {
    }

    public static CommandOption label(@NotNull final String label) {
        return cmd(LABEL, label);
    }
    
    /**
     * Doesn't work for now.
     */
    public static CommandOption aliases(@NotNull final String... aliases) {
        return cmd(ALIASES, aliases);
    }

    public static CommandOption requirements(@NotNull final Requirement... requirements) {
        return cmd(REQUIREMENTS, requirements);
    }

    /**
     *
     * @param function String[] is arguments and
     *                 Integer is location of the argument
     *                 in second param of function
     * @return {@link CommandOption}
     */
    public static CommandOption requirements(@NotNull final BiFunction<CommandSource, Map.Entry<String[], Integer>, Boolean> function) {
        return cmd(REQUIREMENTS, function);
    }

    public static CommandOption run(@NotNull final CommandRunnable run) {
        return cmd(RUN, run);
    }

    public static CommandOption subCommands(@NotNull final Command... subCommands) {
        return cmd(SUB_COMMANDS, subCommands);
    }

    public static CommandOption type(@NotNull final ArgumentType type) {
        return cmd(TYPE, type);
    }

    private static CommandOption cmd(@NotNull final OptionType option, @NotNull final Object obj) {
        return new CommandOption() {
            @NotNull
            @Override
            public OptionType type() {
                return option;
            }

            @NotNull
            @Override
            public Object value() {
                return obj;
            }
        };
    }

}
