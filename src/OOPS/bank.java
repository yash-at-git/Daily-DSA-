package OOPS;

class BankAccount{
    private double balance;
    private final int AccId;
    private final String name;

    BankAccount(int AccId, String name) {
        this.AccId = AccId;
        this.name = name;
    }

    public void deposit(double amount){
        if (isValid(amount)){
            balance += amount;
            System.out.println(amount + " added successfully to " +this.name +" account");
        }else{
            System.out.println(amount + " is a invalid amount, please enter amount greater than zero");
        }
    }

    public void withdraw(double amount){
        if(!isValid(amount)){
            System.out.println("invalid amount");
            return;
        } else if (amount > balance){
            System.out.println("insufficient balance");
            return;
        }
        balance-=amount;
        System.out.println(amount + " withdraw successful");
    }
    private boolean isValid(double amount){
        return amount > 0;
    }

    public void showBalance(){
        System.out.println(this.name + " account balancce is : " + balance);;
    }

    public void transfer(BankAccount target, double amount){
        if(!isValid(amount)) {
            System.out.println("invalid amount");
            return;
        }
        if (amount > balance){
            System.out.println("insufficient balance");
            return;
        }
        this.balance -= amount;
        target.balance += amount;
        System.out.println(amount + " transfered to :"+ target.name);
    }
}

