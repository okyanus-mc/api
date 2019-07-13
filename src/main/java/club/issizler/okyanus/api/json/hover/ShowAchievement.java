package club.issizler.okyanus.api.json.hover;

import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class ShowAchievement implements JsonEvent {

    private final String value;

    public ShowAchievement(@NotNull final String value) {
        this.value = value;
    }

    @NotNull
    @Override
    public String action() {
        return "show_achievement";
    }

    @NotNull
    @Override
    public String value() {
        return "\"" + value + "\"";
    }

}
