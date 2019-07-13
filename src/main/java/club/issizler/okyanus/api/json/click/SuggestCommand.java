package club.issizler.okyanus.api.json.click;

import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public class SuggestCommand implements JsonEvent {

    private final String value;

    public SuggestCommand(@NotNull final String value) {
        this.value = value;
    }

    @NotNull
    @Override
    public String action() {
        return "suggest_command";
    }

    @NotNull
    @Override
    public String value() {
        return '\"' + this.value + '\"';
    }
}
