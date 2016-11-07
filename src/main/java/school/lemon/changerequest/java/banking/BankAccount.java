package school.lemon.changerequest.java.banking;

public interface BankAccount {

    /**
     * Get account number
     * @return account number
     */
    int getAccountNumber();

    /**
     * Get current balance
     * @return account balance
     */
    double getBalance();

    /**
     * Get current rate
     * @return account rate
     */
    double getRate();

    /**
     * Set current account rate in percents
     * @param rate value
     */
    void setRate(double rate);

    /**
     * Withdraw specified sum from account
     * @param sum to withdraw
     * @throws IllegalArgumentException for {@code sum < 0 || sum > balance}
     */
    void withdraw(double sum) throws IllegalArgumentException;

    /**
     * Deposit specified sum for account
     * @param sum to deposit
     * @throws IllegalArgumentException for {@code sum < 0}
     */
    void deposit(double sum) throws IllegalArgumentException;

    /**
     * Add interest for 1 year to balance.
     * E.g.: rate = 10% and balance = 200$ -> interest = 20$. So, new balance is 120$.
     */
    void addInterest();

    /**
     * @return account information in the following format: Account #123, ($10.32).
     */
    String toString();

}
