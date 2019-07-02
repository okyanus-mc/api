package club.issizler.okyanus.api;

import club.issizler.okyanus.api.perms.PermissionService;

import java.util.ServiceLoader;

/**
 * The global state class.
 */
public class Okyanus {

    private static Server server;
    private static ServiceLoader<PermissionService> permissionServiceLoader = ServiceLoader.load(PermissionService.class);

    /**
     * Get the global server instance
     *
     * @return The server instance
     */
    public static Server getServer() {
        if (server == null)
            throw new RuntimeException("Server isn't set!");

        return server;
    }

    /**
     * Sets the global server instance
     * <b>Should not be used by mods!</b>
     *
     * @param server Server instance
     */
    public static void setServer(Server server) {
        if (Okyanus.server != null)
            throw new RuntimeException("Server is already set!");

        Okyanus.server = server;
    }

    /**
     * Get the current permission service
     *
     * @return The current permission service
     */
    public static PermissionService getPermissionService() {
        PermissionService service = permissionServiceLoader.iterator().next();

        if (service == null)
            throw new RuntimeException("No permissions service found! Get a permission mod supporting Okyanus!");

        return service;
    }

}
