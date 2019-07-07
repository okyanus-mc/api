package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.cmd.ArgumentType;
import club.issizler.okyanus.api.cmdnew.mck.MckCommandRunnable;
import org.cactoos.list.ListOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

abstract class CommandEnvelope implements Command {

    private final String id;
    private final List<CommandOption> commandOptions;
    private final List<Requirement> requirements = new ArrayList<>();

    CommandEnvelope(String id, List<CommandOption> commandOptions) {
        this.id = id;
        this.commandOptions = commandOptions;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.LABEL) continue;

            return (String) option.value();
        }

        return "";
    }

    @Override
    public List<String> getAliases() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.ALIASES) continue;

            return new ListOf<>((String[]) option.value());
        }

        return new ListOf<>();
    }

    @Override
    public ArgumentType getType() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.TYPE) continue;

            return (ArgumentType) option.value();
        }

        return ArgumentType.NONE;
    }

    @Override
    public CommandRunnable getRunnable() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.RUN) continue;

            return (CommandRunnable) option.value();
        }

        return new MckCommandRunnable();
    }

    @Override
    public List<Command> getSubCommands() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.SUB_COMMANDS) continue;

            return new ListOf<>((Command[]) option.value());
        }

        return new ListOf<>();
    }

    @Override
    public List<Requirement> getRequirements() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.REQUIREMENTS) continue;

            if (option.value() instanceof Requirement[]) {
                requirements.addAll(new ListOf<>((Requirement[]) option.value()));
            } else {
                requirements.add(
                    new RequirementEnvelope((BiFunction<CommandSource, Map.Entry<String[], Integer>, Boolean>) option.value()) {
                        @Override
                        public boolean control(CommandSource commandSource, String[] arguments, int location) {
                            return super.control(commandSource, arguments, location);
                        }
                    }
                );
            }
        }

        return requirements;
    }

}
