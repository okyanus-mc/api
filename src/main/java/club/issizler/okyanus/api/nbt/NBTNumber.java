package club.issizler.okyanus.api.nbt;

public interface NBTNumber extends NBTBase {

    long longValue();

    int intValue();

    short shortValue();

    byte byteValue();

    double doubleValue();

    float floatValue();

}
