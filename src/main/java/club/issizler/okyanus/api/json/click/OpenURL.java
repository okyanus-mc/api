package club.issizler.okyanus.api.json.click;

import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class OpenURL implements JsonEvent {

    private final String value;

    public OpenURL(@NotNull final String value) {
        this.value = value;
    }

    @NotNull
    @Override
    public String action() {
        return "open_url";
    }

    @NotNull
    @Override
    public String value() {
        return '\"' + this.value + '\"';
    }

}
