package school.lemon.changerequest.java.banking.impl;

import school.lemon.changerequest.java.banking.TransactionalBankAccount;

public class AccountTransactionManager {

    private TransactionalBankAccount bankAccount;

    /**
     * @param bankAccount banking account
     * @throws NullPointerException if {@code bankAccount == null}
     */
    public AccountTransactionManager(TransactionalBankAccount bankAccount) throws NullPointerException {
        //TODO: implement me
    }

    /**
     * Execute bunch of operations.
     * @param operations array of account operations
     */
    public void execute(BankOperation[] operations) {
        //TODO: implement me
    }

    /**
     * Execute bunch of operations in one transaction.
     * In case of any exception all previous operations should be reverted and original exception should be thrown.
     * {@code autoCommit} should be enabled in any case.
     * @param operations array of account operations
     */
    public void executeInTransaction(BankOperation[] operations) throws IllegalArgumentException {
        //TODO: implement me
    }

}
