package club.issizler.okyanus.api.chat;

/**
 * Chat message types.
 * Use {@link club.issizler.okyanus.api.entity.Player#sendMessage(String)}
 * to send message.
 */
@Deprecated
public enum MessageType {

    /**
     * Chat message
     */
    CHAT,

    /**
     * Info message, appears on top of the hotbar
     */
    INFO,

    /**
     * System message, appears on chat.
     */
    SYSTEM,

}
