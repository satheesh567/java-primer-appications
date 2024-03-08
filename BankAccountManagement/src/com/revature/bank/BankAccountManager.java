package com.revature.bank;

public class BankAccountManager {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(101,"satheesh","1223456345",20000);
        CurrentAccount currentAccount=new CurrentAccount(102,"praveen","1223456456",30000);
        DematAccount dematAccount=new DematAccount(103,"suresh","1223456789",40000);
        savingsAccount.deposit(30000);
        savingsAccount.withdraw(10000);
        savingsAccount.calculateInterest(10);
        System.out.println("availble balance is : "+savingsAccount.getBalance());

    }
}
