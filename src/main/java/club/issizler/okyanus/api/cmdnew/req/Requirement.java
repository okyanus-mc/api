package club.issizler.okyanus.api.cmdnew.req;

import club.issizler.okyanus.api.cmdnew.CommandSender;
import org.jetbrains.annotations.NotNull;

/**
 * Requirements for command
 */
public interface Requirement {

    /**
     * Controls the requirement
     *
     * @param commandSender is sender of the command
     * @param arguments is arguments of the command
     * @param location is argument order/location
     * @return If the method passes it returns true.
     */
    boolean control(@NotNull final CommandSender commandSender, @NotNull final String[] arguments, final int location);

}