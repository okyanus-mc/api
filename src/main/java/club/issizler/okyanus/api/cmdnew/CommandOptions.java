package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.cmd.ArgumentType;

import java.util.Map;
import java.util.function.BiFunction;

import static club.issizler.okyanus.api.cmdnew.OptionType.*;

public class CommandOptions {

    private CommandOptions() {
    }

    public static CommandOption label(String label) {
        return cmd(LABEL, label);
    }
    
    /**
     * Doesn't work for now.
     */
    public static CommandOption aliases(String... aliases) {
        return cmd(ALIASES, aliases);
    }

    public static CommandOption requirements(Requirement... requirements) {
        return cmd(REQUIREMENTS, requirements);
    }

    /**
     *
     * @param function String[] is arguments and
     *                 Integer is location of the argument
     *                 in second param of function
     * @return {@link CommandOption}
     */
    public static CommandOption requirements(BiFunction<CommandSource, Map.Entry<String[], Integer>, Boolean> function) {
        return cmd(REQUIREMENTS, function);
    }

    public static CommandOption run(CommandRunnable run) {
        return cmd(RUN, run);
    }

    public static CommandOption subCommands(Command... subCommands) {
        return cmd(SUB_COMMANDS, subCommands);
    }

    public static CommandOption type(ArgumentType type) {
        return cmd(TYPE, type);
    }

    private static CommandOption cmd(OptionType option, Object obj) {
        return new CommandOption() {
            @Override
            public OptionType type() {
                return option;
            }

            @Override
            public Object value() {
                return obj;
            }
        };
    }

}
