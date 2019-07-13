package club.issizler.okyanus.api.nbt;

import org.jetbrains.annotations.NotNull;

public interface NBTList extends NBTBase {

    void add(@NotNull final NBTBase paramINBTBase);

    void add(int paramInt, @NotNull final NBTBase paramINBTBase);

    boolean safeAdd(int paramInt, @NotNull final NBTBase paramINBTBase);

    void set(int paramInt, @NotNull final NBTBase paramINBTBase);

    boolean safeSet(int paramInt, @NotNull final NBTBase paramINBTBase);

    void remove(int paramInt);

    @NotNull
    NBTBase get(int paramInt);

    @NotNull
    NBTCompound getCompound(int paramInt);

    @NotNull
    NBTList getList(int paramInt);

    short getShort(int paramInt);

    int getInt(int paramInt);

    @NotNull
    int[] getIntArray(int paramInt);

    double getDouble(int paramInt);

    float getFloat(int paramInt);

    @NotNull
    String getString(int paramInt);

    int size();

}
