package club.issizler.okyanus.api.cmd;

import java.util.List;

@Deprecated
public interface CommandRegistry {

    void register(CommandBuilder cmd);

    List<CommandBuilder> getCommands();

}