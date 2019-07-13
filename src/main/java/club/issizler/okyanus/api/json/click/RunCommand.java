package club.issizler.okyanus.api.json.click;

import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class RunCommand implements JsonEvent {

    private final String value;

    public RunCommand(@NotNull final String value) {
        this.value = value;
    }

    @NotNull
    @Override
    public String action() {
        return "run_command";
    }

    @NotNull
    @Override
    public String value() {
        return "\"/" + value + "\"";
    }

}
