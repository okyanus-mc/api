package club.issizler.okyanus.api.json;

import org.jetbrains.annotations.NotNull;

public final class EmptyFeature implements JsonFeature {

    @NotNull
    @Override
    public String handle() {
        return "";
    }

}
