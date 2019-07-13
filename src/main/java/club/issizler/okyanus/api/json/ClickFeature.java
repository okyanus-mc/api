package club.issizler.okyanus.api.json;

import org.jetbrains.annotations.NotNull;

public class ClickFeature implements JsonFeature {

    private final JsonEvent jsonEvent;

    public ClickFeature(@NotNull final JsonEvent jsonEvent) {
        this.jsonEvent = jsonEvent;
    }

    @NotNull
    @Override
    public String handle() {
        return ",\"clickEvent\":{\"action\":\"" + jsonEvent.action() + "\",\"value\":" + jsonEvent.value() + '}';
    }

}
