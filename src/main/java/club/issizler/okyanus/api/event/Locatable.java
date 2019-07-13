package club.issizler.okyanus.api.event;

import club.issizler.okyanus.api.math.Vec3d;
import org.jetbrains.annotations.NotNull;

/**
 * Marks an {@link Event} as locatable.
 */
public interface Locatable extends Event {

    /**
     * Gets the location of this event
     *
     * @return A Vec3d of the location
     */
    @NotNull
    Vec3d getLocation();

}
