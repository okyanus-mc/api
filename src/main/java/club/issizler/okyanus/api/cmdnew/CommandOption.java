package club.issizler.okyanus.api.cmdnew;

import org.jetbrains.annotations.NotNull;

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
    @NotNull
    OptionType type();

    /**
     * Gets value of option
     *
     * @return {@link X}
     */
    @NotNull
    X value();

}