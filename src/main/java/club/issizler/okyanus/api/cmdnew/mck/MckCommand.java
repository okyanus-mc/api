package club.issizler.okyanus.api.cmdnew.mck;

import club.issizler.okyanus.api.cmd.ArgumentType;
import club.issizler.okyanus.api.cmdnew.Command;
import club.issizler.okyanus.api.cmdnew.CommandRunnable;
import club.issizler.okyanus.api.cmdnew.req.Requirement;
import org.cactoos.list.ListOf;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MckCommand  implements Command {

    @NotNull
    @Override
    public String getId() {
        return "";
    }

    @NotNull
    @Override
    public String getLabel() {
        return "";
    }

    @NotNull
    @Override
    public List<String> getAliases() {
        return new ListOf<>();
    }

    @NotNull
    @Override
    public ArgumentType getType() {
        return ArgumentType.NONE;
    }

    @NotNull
    @Override
    public CommandRunnable getRunnable() {
        return source -> 0;
    }

    @NotNull
    @Override
    public List<Command> getSubCommands() {
        return new ListOf<>();
    }

    @NotNull
    @Override
    public List<Requirement> getRequirements() {
        return new ListOf<>();
    }

    @Override
    public void setActive(boolean active) {
    }

    @Override
    public boolean isActive() {
        return false;
    }

}
