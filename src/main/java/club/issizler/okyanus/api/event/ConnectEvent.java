package club.issizler.okyanus.api.event;

import java.net.InetAddress;

/**
 * This event fires whenever a player connects the server
 */
public interface ConnectEvent extends PlayerEvent, CancellableWithReason {

    /**
     * Gets the address of this connection
     * @return the address of this connection
     */
    InetAddress getAddress();

}
