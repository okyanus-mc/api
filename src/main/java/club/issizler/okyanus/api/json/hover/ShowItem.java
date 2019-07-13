package club.issizler.okyanus.api.json.hover;

import club.issizler.okyanus.api.item.ItemStack;
import club.issizler.okyanus.api.json.JsonEvent;
import org.jetbrains.annotations.NotNull;

public class ShowItem implements JsonEvent {

   private final ItemStack itemStack;

    public ShowItem(@NotNull final ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    @NotNull
    @Override
    public String action() {
        return "show_item";
    }

    @NotNull
    @Override
    public String value() {
        return "\"" + itemStack.getTag().convert().toString() + "\"";
    }

}