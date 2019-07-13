package club.issizler.okyanus.api.json;

import org.jetbrains.annotations.NotNull;

public class HoverFeature implements JsonFeature {

    private final JsonEvent jsonEvent;

    public HoverFeature(@NotNull final JsonEvent jsonEvent) {
        this.jsonEvent = jsonEvent;
    }

    @NotNull
    @Override
    public String handle() {
        return ",\"hoverEvent\":{\"action\":\"" + jsonEvent.action() + "\",\"value\":" + jsonEvent.value() + '}';
    }

}
