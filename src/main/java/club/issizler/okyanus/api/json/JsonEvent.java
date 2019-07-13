package club.issizler.okyanus.api.json;

import org.jetbrains.annotations.NotNull;

public interface JsonEvent {

    /**
     * @return action type string of the json
     */
    @NotNull
    String action();

    /**
     * @return value string of the json
     */
    @NotNull
    String value();

}
