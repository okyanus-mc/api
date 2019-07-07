package club.issizler.okyanus.api.cmdnew;

/**
 * Command Option converts to Command Dispatcher
 *
 * @param <X> is value type of the option
 */
public interface CommandOption<X> {

    /**
     * Gets option of value
     *
     * @return {@link OptionType}
     */
    OptionType type();

    /**
     * Gets value of option
     *
     * @return {@link X}
     */
    X value();

}