package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.Server;
import club.issizler.okyanus.api.entity.Player;

public enum CommandSourceType {

    PLAYER {
        @Override
        public boolean isTypeOf(CommandSource o) {
            return o instanceof Player;
        }
    }, CONSOLE {
        @Override
        public boolean isTypeOf(CommandSource o) {
            return o instanceof Server;
        }
    }, ALL {
        @Override
        public boolean isTypeOf(CommandSource o) {
            return true;
        }
    };

    /**
     * Checks to see whether the given source is a type of
     * the command source.
     *
     * @param o the source to check
     * @return {@code true} if it is a type of the command
     * source
     */
    public abstract boolean isTypeOf(CommandSource o);

}