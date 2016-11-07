package school.lemon.changerequest.java.banking;

/**
 * Extended banking account, with transaction support.
 * In case autoCommit is enabled, account operates exactly in the same way as ordinary one.
 * In case autoCommit is disabled, you should commit changes manually and have chance to revert all uncommitted changes.
 * Be default autoCommit is enabled.
 *
 * So, if {@code autoCommit == false} and you execute any 5 operations and then call {@code revert()} account should
 * be in the same state as it was before all of these operation. In case you've committed changes - there is no way
 * to revert them.
 *
 * By the way, all uncommitted changes should be applied to the account but with chance to revert them.
 */
public interface TransactionalBankAccount extends BankAccount {

    /**
     * Specified whether future operations should be in transaction.
     * @param value, true - each operation executes independently.
     * false - all operations before {@code commit()} can be reverted via {@code revert()}.
     */
    void setAutoCommit(boolean value);

    /**
     * @return true - if auto commit enabled, false - otherwise.
     */
    boolean isAutoCommitEnabled();

    /**
     * Commits all uncommitted operations
     */
    void commit();

    /**
     * Revert all uncommitted operations
     */
    void revert();

}
