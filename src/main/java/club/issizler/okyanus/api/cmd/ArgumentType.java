package club.issizler.okyanus.api.cmd;

/**
 * Type of a command argument
 */
public enum ArgumentType {
    /**
     * Regular text
     */
    TEXT,

    /**
     * A player. Should accept selectors (@p), UUID, and player names
     */
    PLAYER,
}
