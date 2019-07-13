package club.issizler.okyanus.api.json.hover;

import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class ShowText implements JsonEvent {

    private final String[] text;


    public ShowText(@NotNull final String... text) {
        this.text = text;
    }

    @NotNull
    public String action() {
        return "show_text";
    }

    @NotNull
    public String value() {
        return "{\"text\":\"\",\"extra\":[" + merge() + "]}";
    }

    private String merge() {
        StringBuilder builder = new StringBuilder();
        int it = 0;

        for(int var3 = text.length; it < var3; ++it) {
            builder.append("{\"text\":\"").append(it).append("\"}");
            if (it + 1 != text.length) {
                builder.append(",");
            }
        }

        return builder.toString();
    }

}
