package school.lemon.changerequest.java.banking.impl;

import school.lemon.changerequest.java.banking.BankAccount;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BankAccountImpl implements BankAccount {

    private static int accountsCounter = 0;
    private final int accountNumber = ++accountsCounter;

    private double balance;
    private double rate;

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void withdraw(double sum) throws IllegalArgumentException {
        if (sum < 0 || sum > balance) {
            throw new IllegalArgumentException();
        }
        balance -= sum;
    }

    @Override
    public void deposit(double sum) throws IllegalArgumentException {
        if (sum < 0) {
            throw new IllegalArgumentException();
        }
        balance += sum;
    }

    @Override
    public void addInterest() {
        balance += balance * rate / 100;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat(".##");
        df.setRoundingMode(RoundingMode.DOWN);
        return String.format("Account #%d, ($%s)", accountNumber, df.format(balance));
    }

}
