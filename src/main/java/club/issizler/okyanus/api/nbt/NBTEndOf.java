package club.issizler.okyanus.api.nbt;

import org.jetbrains.annotations.NotNull;

public class NBTEndOf implements NBTBase {

    @NotNull
    public Object convert() {
        return "";
    }

    @NotNull
    public NBTType type() {
        return NBTType.TagEnd;
    }

    @NotNull
    public String toString() {
        return "";
    }

}