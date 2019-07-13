package club.issizler.okyanus.api.nbt;

import org.jetbrains.annotations.NotNull;

public interface NBTBase {

    @NotNull
    Object convert();

    @NotNull
    NBTType type();

    @NotNull
    @Override
    String toString();

}
