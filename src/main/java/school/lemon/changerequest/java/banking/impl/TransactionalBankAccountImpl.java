package school.lemon.changerequest.java.banking.impl;

import school.lemon.changerequest.java.banking.BankAccount;
import school.lemon.changerequest.java.banking.TransactionalBankAccount;

public class TransactionalBankAccountImpl implements TransactionalBankAccount {

    private BankAccount bankAccount;
    private boolean autoCommit;

    private AccountState accountState;

    public TransactionalBankAccountImpl(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.autoCommit = true;
    }

    @Override
    public int getAccountNumber() {
        return bankAccount.getAccountNumber();
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public double getRate() {
        return bankAccount.getRate();
    }

    @Override
    public void setRate(double rate) {
        bankAccount.setRate(rate);
    }

    @Override
    public void withdraw(double sum) throws IllegalArgumentException {
        bankAccount.withdraw(sum);
    }

    @Override
    public void deposit(double sum) throws IllegalArgumentException {
        bankAccount.deposit(sum);
    }

    @Override
    public void addInterest() {
        bankAccount.addInterest();
    }

    @Override
    public void setAutoCommit(boolean value) {
        autoCommit = value;
        if (!autoCommit && accountState == null) {
            accountState = new AccountState(bankAccount.getBalance(), bankAccount.getRate());
        }
    }

    @Override
    public boolean isAutoCommitEnabled() {
        return autoCommit;
    }

    @Override
    public void commit() {
        accountState = null;
    }

    @Override
    public void revert() {
        bankAccount.setRate(accountState.getRate());
        double currentBalance = bankAccount.getBalance();
        double savedBalance = accountState.getBalance();
        if (currentBalance < savedBalance) {
            bankAccount.deposit(savedBalance - currentBalance);
        } else if (currentBalance > savedBalance) {
            bankAccount.withdraw(currentBalance - savedBalance);
        }
    }

    @Override
    public String toString() {
        return bankAccount.toString();
    }

    private class AccountState {

        private double balance;
        private double rate;

        private AccountState(double balance, double rate) {
            this.balance = balance;
            this.rate = rate;
        }

        private double getBalance() {
            return balance;
        }

        private double getRate() {
            return rate;
        }
    }

}
