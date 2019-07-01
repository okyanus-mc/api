package club.issizler.okyanus.api;

/**
 * The global state class. Only used in getting the server instance.
 */
public class Okyanus {

    private static Server server;

    /**
     * Get the global server instance
     *
     * @return server instance
     */
    public static Server getServer() {
        if (server == null)
            throw new RuntimeException("Server isn't set!");

        return server;
    }

    public static void setServer(Server server) {
        if (Okyanus.server != null)
            throw new RuntimeException("Server is already set!");

        Okyanus.server = server;
    }

}
