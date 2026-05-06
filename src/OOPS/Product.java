package OOPS;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double percent){
        if (percent <= 0 || percent > 90) {
            System.out.println("Invalid discount");
            return;
        }
        double discountAmount = (price * percent) / 100;
        price = price - discountAmount;

        System.out.println("Discount applied: " + percent + "%");
    }

    void prodDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}
