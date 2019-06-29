package club.issizler.okyanus.api.cmd;

import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;

import java.util.ArrayList;
import java.util.List;

public class CommandBuilder {

    private String name;
    private boolean isOpOnly = false;

    private CommandRunnable runnable;

    private List<Triple<String, ArgumentType, Boolean>> args = new ArrayList<>();
    private List<CommandBuilder> subCommands = new ArrayList<>();

    public CommandBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CommandBuilder opOnly() {
        this.isOpOnly = true;
        return this;
    }

    public CommandBuilder run(CommandRunnable runnable) {
        this.runnable = runnable;
        return this;
    }

    public CommandBuilder arg(String name, ArgumentType type) {
        return arg(name, type, false);
    }

    public CommandBuilder arg(String name, ArgumentType type, boolean isOptional) {
        this.args.add(new ImmutableTriple<>(name, type, isOptional));
        return this;
    }

    public CommandBuilder subcommand(CommandBuilder subcommand) {
        this.subCommands.add(subcommand);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsOpOnly() {
        return this.isOpOnly;
    }

    public CommandRunnable getRunnable() {
        return this.runnable;
    }

    public List<Triple<String, ArgumentType, Boolean>> getArgs() {
        return this.args;
    }

    public List<CommandBuilder> getSubCommands() {
        return this.subCommands;
    }

}
