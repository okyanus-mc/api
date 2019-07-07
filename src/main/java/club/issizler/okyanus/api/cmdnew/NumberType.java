package club.issizler.okyanus.api.cmdnew;

import org.cactoos.Scalar;
import org.cactoos.scalar.Or;

public enum NumberType {

    INT {
        @Override
        public boolean isTypeOf(String o) {
            try {
                Integer.parseInt(o);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    },
    ANY {
        @Override
        public boolean isTypeOf(String o) {
            final Scalar<Boolean> or = new Or(
                input -> input != ANY && input.isTypeOf(o),
                values()
            );
            try {
                return or.value();
            } catch (Exception e) {
                return false;
            }
        }
    };

    /**
     * Checks to see whether the given string is a type of
     * the number type.
     *
     * @param o the string to check
     * @return {@code true} if it is a type of the number
     */
    public abstract boolean isTypeOf(String o);

}