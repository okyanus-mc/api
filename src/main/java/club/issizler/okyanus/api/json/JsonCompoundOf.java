package club.issizler.okyanus.api.json;

import org.jetbrains.annotations.NotNull;

public class JsonCompoundOf implements JsonCompound {

    private final String text;
    private final JsonFeature jsonFeature1;
    private final JsonFeature jsonFeature2;

    public JsonCompoundOf(@NotNull final String text,
                          @NotNull final JsonFeature jsonFeature1,
                          @NotNull final JsonFeature jsonFeature2) {
        this.text = text;
        this.jsonFeature1 = jsonFeature1;
        this.jsonFeature2 = jsonFeature2;
    }

    public JsonCompoundOf(@NotNull final String text, @NotNull final JsonFeature jsonFeature) {
        this(text, jsonFeature, new EmptyFeature());
    }

    public JsonCompoundOf(@NotNull final String text) {
        this(text, new EmptyFeature(), new EmptyFeature());
    }

    @NotNull
    @Override
    public String convert() {
        return "{\"text\":\"" + text + '\"' + jsonFeature1.handle() + jsonFeature2.handle() + '}';
    }

}
