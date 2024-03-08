package com.revature.bank;

public class SavingsAccount extends BankAccount implements Interest{

    public SavingsAccount(int id, String name, String accountNumber, int balance) {
        super(id, name, accountNumber, balance);
    }
    public void calculateInterest(int interestRate) {
        double interest = getBalance() * interestRate / 100;
        deposit((int)interest); // Add interest to the balance
        System.out.println("Interest calculated and added to the account. New balance: " + getBalance());
    }

}
