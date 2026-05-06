package com.yash.packages;
import java.util.*;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (!validate(initialBalance)) {
            throw new IllegalArgumentException("Initial balance must be positive");
        }
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (!validate(amount)) {
            System.out.println("Amount must be greater than 0");
            return;
        }

        balance += amount;
        System.out.println("Amount of " + amount + " deposited successfully. New balance: " + getBalance());
    }
    public void withdraw(double amount) {
        if (!validate(amount)) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println(amount + " withdrawal successful. Updated balance: " + getBalance());
    }
    public double getBalance() {
        return balance;
    }
    private boolean validate(double amount) {
        return amount > 0;
    }
}
