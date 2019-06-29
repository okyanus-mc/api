package club.issizler.okyanus.api.math;

// The MC MathHelper does some magic with a lookup table, maybe do the same?

/**
 * Some helper math objects, mostly for use in {@link Vec3d}
 */
public class MathHelper {

    public static float sin(float float_1) {
        return (float) Math.sin(float_1);
    }

    public static float cos(float float_1) {
        return (float) Math.cos(float_1);
    }

    public static float sqrt(double float_1) {
        return (float) Math.sqrt(float_1);
    }

}
