package club.issizler.okyanus.api.item;

import club.issizler.okyanus.api.nbt.NBTBase;
import org.jetbrains.annotations.NotNull;

public interface ItemStack {

    @NotNull
    NBTBase getTag();

}
