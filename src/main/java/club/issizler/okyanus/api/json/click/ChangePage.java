package club.issizler.okyanus.api.json.click;

import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public class ChangePage implements JsonEvent {

    private final String value;

    public ChangePage(@NotNull final String value) {
        this.value = value;
    }
    
    @NotNull
    @Override
    public String action() {
        return "change_page";
    }

    @NotNull
    @Override
    public String value() {
        return '\"' + this.value + '\"';
    }

}