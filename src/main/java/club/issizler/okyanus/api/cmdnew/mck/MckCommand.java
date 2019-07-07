package club.issizler.okyanus.api.cmdnew.mck;

import club.issizler.okyanus.api.cmd.ArgumentType;
import club.issizler.okyanus.api.cmdnew.Command;
import club.issizler.okyanus.api.cmdnew.CommandRunnable;
import club.issizler.okyanus.api.cmdnew.Requirement;
import org.cactoos.list.ListOf;

import java.util.List;

public class MckCommand  implements Command {

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getLabel() {
        return "";
    }

    @Override
    public List<String> getAliases() {
        return new ListOf<>();
    }

    @Override
    public ArgumentType getType() {
        return ArgumentType.NONE;
    }

    @Override
    public CommandRunnable getRunnable() {
        return source -> 0;
    }

    @Override
    public List<Command> getSubCommands() {
        return new ListOf<>();
    }

    @Override
    public List<Requirement> getRequirements() {
        return new ListOf<>();
    }

}
