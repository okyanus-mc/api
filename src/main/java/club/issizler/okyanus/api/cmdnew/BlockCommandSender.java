package club.issizler.okyanus.api.cmdnew;

import club.issizler.okyanus.api.world.Block;
import org.jetbrains.annotations.NotNull;

public interface BlockCommandSender extends CommandSender {

    /**
     * Returns the block this command sender belongs to
     *
     * @return Block for the command sender
     */
    @NotNull
    Block getBlock();
}