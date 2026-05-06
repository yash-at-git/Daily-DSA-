package OOPS;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        CurrentAccount ca = new CurrentAccount(0, -500);

        sa.deposit(500);
        ca.deposit(500);
    }
}

