package club.issizler.okyanus.api.json;

import org.jetbrains.annotations.NotNull;

public interface JsonFeature {

    /**
     * @return the event action and its value to handle
     */
    @NotNull
    String handle();

}
