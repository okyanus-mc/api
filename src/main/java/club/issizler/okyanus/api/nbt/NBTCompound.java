package club.issizler.okyanus.api.nbt;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public interface NBTCompound extends NBTBase {

    void set(@NotNull final String paramString, @NotNull final NBTBase paramINBTBase);

    void setByte(@NotNull final String paramString, byte paramByte);

    void setShort(@NotNull final String paramString, short paramShort);

    void setInt(@NotNull final String paramString, int paramInt);

    void setLong(@NotNull final String paramString, long paramLong);

    void setFloat(@NotNull final String paramString, float paramFloat);

    void setDouble(@NotNull final String paramString, double paramDouble);

    void setString(@NotNull final String paramString1, @NotNull final String paramString2);

    void setByteArray(@NotNull final String paramString, @NotNull final byte[] paramArrayOfByte);

    void setIntArray(@NotNull final String paramString, @NotNull final int[] paramArrayOfInt);

    void setIntList(@NotNull final String paramString, @NotNull final List<Integer> paramList);

    void setLongArray(@NotNull final String paramString, @NotNull final long[] paramArrayOfLong);

    void setLongList(@NotNull final String paramString, @NotNull final List<Long> paramList);

    void setBoolean(@NotNull final String paramString, boolean paramBoolean);

    @NotNull
    NBTBase get(@NotNull final String paramString);

    byte getByte(@NotNull final String paramString);

    short getShort(@NotNull final String paramString);

    int getInt(@NotNull final String paramString);

    long getLong(@NotNull final String paramString);

    float getFloat(@NotNull final String paramString);

    double getDouble(@NotNull final String paramString);

    @NotNull
    String getString(@NotNull final String paramString);

    @NotNull
    byte[] getByteArray(@NotNull final String paramString);

    @NotNull
    int[] getIntArray(@NotNull final String paramString);

    @NotNull
    long[] getLongArray(@NotNull final String paramString);

    @NotNull
    NBTCompound getNBTCompound(@NotNull final String paramString);

    @NotNull
    NBTList getList(@NotNull final String paramString, @NotNull final NBTType paramNBTType);

    boolean getBoolean(@NotNull final String paramString);

    @NotNull
    Set<String> keys();

    boolean has(@NotNull final String paramString);

    void remove(@NotNull final String paramString);

}