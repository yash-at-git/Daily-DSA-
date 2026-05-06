package OOPS;

public class Account {
    protected double balance;
    final double interest = 2.5;
    public Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){
        if(!isValid(amount)){ //checking if amout is valid or not
            System.out.println("invalid amount");
            return;
        }else{
            balance += amount;
            System.out.println("amount of rupees "+amount+" added to your account successfully");
        }
    }
    public void getBalance(){
        System.out.println("Balance : "+balance);
    }
    private boolean isValid(double amount) {
        return amount > 0;
    }
}

class SavingsAccount extends Account{

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void addInterest(double interest){
            double interestAmount = (balance * interest)/100;
            balance += interestAmount;
    }
}
class CurrentAccount extends Account{
    protected double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }
}
