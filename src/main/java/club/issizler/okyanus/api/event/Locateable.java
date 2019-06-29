package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.math.Vec3d;

public interface Locateable {

    /**
     * Gets the location of this event
     * @return A Vec3d of the location
     */
    public Vec3d getLocation();

}
