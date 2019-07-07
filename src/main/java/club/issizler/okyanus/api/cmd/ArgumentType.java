package club.issizler.okyanus.api.cmd;

public enum ArgumentType {

    /**
     * Examples
     * "\"quoted phrase\"", "word", "\"\""
     */
    TEXT,

    /**
     * Examples
     * "word", "words with spaces", "\"and symbols\""
     */
    GREEDY_TEXT,

    /**
     * A player. Should accept selectors (@p), UUID, and player names
     */
    PLAYER,

    /**
     * None type for mock objects
     */
    NONE;

}
