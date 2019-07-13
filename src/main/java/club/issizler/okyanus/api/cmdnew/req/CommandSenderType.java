package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.Server;
import club.issizler.okyanus.api.cmdnew.CommandSender;
import club.issizler.okyanus.api.entity.Player;
import club.issizler.okyanus.api.entity.mck.MckPlayer;
import org.jetbrains.annotations.NotNull;

public enum CommandSenderType {

    PLAYER {
        @Override
        public boolean isTypeOf(@NotNull CommandSender o) {
            return o instanceof Player && !(o instanceof MckPlayer);
        }
    }, CONSOLE {
        @Override
        public boolean isTypeOf(@NotNull CommandSender o) {
            return o instanceof Server;
        }
    }, ALL {
        @Override
        public boolean isTypeOf(@NotNull CommandSender o) {
            return true;
        }
    };

    /**
     * Checks to see whether the given sender is a type of
     * the command sender.
     *
     * @param o the sender to check
     * @return {@code true} if it is a type of the command
     * sender
     */
    public abstract boolean isTypeOf(@NotNull final CommandSender o);

}