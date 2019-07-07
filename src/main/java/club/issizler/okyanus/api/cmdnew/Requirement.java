package club.issizler.okyanus.api.cmdnew;

/**
 * Requirements for command
 */
public interface Requirement {

    /**
     * Controls the requirement
     *
     * @param commandSource is source of the command
     * @param arguments is arguments of the command
     * @param location is argument order/location
     * @return If the method passes it returns true.
     */
    boolean control(CommandSource commandSource, String[] arguments, int location);

}