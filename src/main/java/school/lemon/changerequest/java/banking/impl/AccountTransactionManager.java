package school.lemon.changerequest.java.banking.impl;

import school.lemon.changerequest.java.banking.TransactionalBankAccount;

public class AccountTransactionManager {

    private TransactionalBankAccount bankAccount;

    /**
     * @param bankAccount banking account
     * @throws NullPointerException if {@code bankAccount == null}
     */
    public AccountTransactionManager(TransactionalBankAccount bankAccount) throws NullPointerException {
        if (bankAccount == null) {
            throw new NullPointerException();
        }
        this.bankAccount = bankAccount;
    }

    /**
     * Execute bunch of operations.
     * @param operations array of account operations
     */
    public void execute(BankOperation[] operations) {
        bankAccount.setAutoCommit(true);
        for (BankOperation operation : operations) {
            executeOperation(operation);
        }
    }

    /**
     * Execute bunch of operations in one transaction.
     * In case of any exception all previous operations should be reverted and original exception should be thrown.
     * {@code autoCommit} should be enabled in any case.
     * @param operations array of account operations
     */
    public void executeInTransaction(BankOperation[] operations) throws IllegalArgumentException {
        try {
            bankAccount.setAutoCommit(false);
            for (BankOperation operation : operations) {
                executeOperation(operation);
            }
            bankAccount.commit();
        } catch (IllegalArgumentException ex) {
            bankAccount.revert();
            throw ex;
        } finally {
            bankAccount.setAutoCommit(true);
        }
    }

    private void executeOperation(BankOperation operation) {
        switch (operation.getType()) {
            case WITHDRAW:
                bankAccount.withdraw(operation.getValue());
                break;
            case DEPOSIT:
                bankAccount.deposit(operation.getValue());
                break;
            case ADD_INTEREST:
                bankAccount.addInterest();
                break;
            case SET_RATE:
                bankAccount.setRate(operation.getValue());
                break;
        }
    }

}
