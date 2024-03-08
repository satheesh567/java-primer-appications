package com.revature.bank;

public abstract class BankAccount {
    private int id;
    private String name;
    private String accountNumber;
    private int balance;

    public BankAccount(int id, String name,String accountNumber, int balance) {
        this.id = id;
        this.name = name;
        this.accountNumber=accountNumber;
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
    public void deposit(int ammout){
      balance =balance+ammout;
        System.out.println("deposite successful. New balance: " + balance);
    }
    public void withdraw(int amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
