package com.yash.packages;

public class Bankapp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        System.out.println(acc.getBalance());
        acc.deposit(500);
        acc.withdraw(400);
        acc.deposit(-20);
        acc.withdraw(540021);
        System.out.println(acc.getBalance());
    }
}
