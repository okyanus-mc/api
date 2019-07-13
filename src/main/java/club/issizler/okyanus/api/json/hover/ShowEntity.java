package club.issizler.okyanus.api.json.hover;

import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public final class ShowEntity implements JsonEvent {

    private final int id;
    private final String name;
    private final String entityType;

    public ShowEntity(final int id, @NotNull final String name, @NotNull final String entityType) {
        this.id = id;
        this.name = name;
        this.entityType = entityType;
    }

    @NotNull
    @Override
    public String action() {
        return "show_entity";
    }

    @NotNull
    @Override
    public String value() {
        return "\"{id:" + id + ",name:" + name + ",type:" + entityType + "}\"";
    }

}
