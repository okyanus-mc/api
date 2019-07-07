package club.issizler.okyanus.api.perms;

import club.issizler.okyanus.api.Okyanus;

/**
 * This service should be implemented by permission plugins to provide player permissions.
 * Do not run multiple permission services in the same server, otherwise undefined behaviour might happen!
 * <p>
 * To use this service to check permissions, get an instance by calling {@link Okyanus#getPermissionService()}
 * Most methods are aliased in {@link Permissible}, so you shouldn't need to get this service manually
 * <p>
 * To register a permission service, use Java SPI (https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html)
 */
public interface PermissionService extends OperatorService {

    /**
     * Checks if the permissible has this permission
     *
     * @param permissible Permissible to check
     * @param perm        Permission to check
     * @return Does the player have this permission?
     */
    boolean hasPermission(Permissible permissible, String perm);

    /**
     * Adds a permission to this permissible
     *
     * @param permissible Permissible to add the permission to
     * @param perm        The permission to add
     */
    void addPermission(Permissible permissible, String perm);

    /**
     * Removes a permission from this permissible
     *
     * @param permissible Permissible to remove this permission from
     * @param perm        Permission to remove
     */
    void removePermission(Permissible permissible, String perm);

}
