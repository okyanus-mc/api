package club.issizler.okyanus.api.perms;

public interface OperatorService {

    /**
     * Sets whether or not the permissible is an operator,
     * or otherwise holds all permissions.
     *
     * @param op {@code true} to set to an operator,
     * {@code false} to set to a non-operator.
     */
    void setOp(Operator operator, boolean op);

    /**
     * Checks to see whether or not this permissible object
     * is set to an operator of the server.
     *
     * @return {@code true} if this permissible object is an
     * operator, {@code false} if it is not
     */
    boolean isOp(Operator operator);

}
