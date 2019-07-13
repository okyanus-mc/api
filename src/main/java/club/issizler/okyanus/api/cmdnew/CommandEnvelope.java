package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.cmd.ArgumentType;
import club.issizler.okyanus.api.cmdnew.mck.MckCommandRunnable;
import club.issizler.okyanus.api.cmdnew.req.Requirement;
import club.issizler.okyanus.api.cmdnew.req.RequirementEnvelope;
import org.cactoos.list.ListOf;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

abstract class CommandEnvelope implements Command {

    private final String id;
    private final List<CommandOption> commandOptions;
    private final List<Requirement> requirements = new ArrayList<>();

    private boolean active = true;

    CommandEnvelope(@NotNull final String id, @NotNull final List<CommandOption> commandOptions) {
        this.id = id;
        this.commandOptions = commandOptions;
    }

    @NotNull
    @Override
    public String getId() {
        return id;
    }

    @NotNull
    @Override
    public String getLabel() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.LABEL) continue;

            return (String) option.value();
        }

        return "";
    }

    @NotNull
    @Override
    public List<String> getAliases() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.ALIASES) continue;

            return new ListOf<>((String[]) option.value());
        }

        return new ListOf<>();
    }

    @NotNull
    @Override
    public ArgumentType getType() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.TYPE) continue;

            return (ArgumentType) option.value();
        }

        return ArgumentType.NONE;
    }

    @NotNull
    @Override
    public CommandRunnable getRunnable() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.RUN) continue;

            return source -> {
                if (isActive())
                    ((CommandRunnable)option.value()).run(source);

                return 1;
            };
        }

        return new MckCommandRunnable();
    }

    @NotNull
    @Override
    public List<Command> getSubCommands() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.SUB_COMMANDS) continue;

            return new ListOf<>((Command[]) option.value());
        }

        return new ListOf<>();
    }

    @NotNull
    @Override
    public List<Requirement> getRequirements() {
        for (CommandOption option : commandOptions) {
            if (option.type() != OptionType.REQUIREMENTS) continue;

            if (option.value() instanceof Requirement[]) {
                requirements.addAll(new ListOf<>((Requirement[]) option.value()));
            } else {
                requirements.add(
                    new RequirementEnvelope((BiFunction<CommandSender, Map.Entry<String[], Integer>, Boolean>) option.value()) {
                        @Override
                        public boolean control(@NotNull CommandSender commandSender, @NotNull String[] arguments, @NotNull int location) {
                            return super.control(commandSender, arguments, location);
                        }
                    }
                );
            }
        }

        return requirements;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean isActive() {
        return active;
    }

}
