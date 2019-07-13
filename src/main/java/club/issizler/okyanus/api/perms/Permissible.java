package club.issizler.okyanus.api.perms;

import club.issizler.okyanus.api.Okyanus;
import org.jetbrains.annotations.NotNull;

/**
 * An object with permissions
 */
public interface Permissible extends Operator {

    /**
     * Checks if this permissible has this permission
     *
     * @param perm Permission to check
     * @return Does the player have this permission?
     */
    default boolean hasPermission(@NotNull final String perm) {
        return Okyanus.getPermissionService().hasPermission(this, perm);
    }

    /**
     * Adds a permission to this permissible
     *
     * @param perm The permission to add
     */
    default void addPermission(@NotNull final String perm) {
        Okyanus.getPermissionService().addPermission(this, perm);
    }

    /**
     * Removes a permission from this permissible
     *
     * @param perm Permission to remove
     */
    default void removePermission(@NotNull final String perm) {
        Okyanus.getPermissionService().removePermission(this, perm);
    }

    /**
     * Gets this permissible's identifier
     * <p>
     * It can be:
     * * CONSOLE for the server console
     * * Player UUID for players
     * * UNKNOWN if something's bugged
     *
     * @return This permissible's identifier
     */
    @NotNull
    String getIdentifier();

}
