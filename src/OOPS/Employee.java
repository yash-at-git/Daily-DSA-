package OOPS;

public class Employee {
    private String name;
    private double salary;
    public Employee() {
        this("unknown",0);
    }
    public Employee(String name) {
        this(name,0);
    }
    public Employee(double salary) {
        this("unknown",salary);
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("name : "+ this.name + " salary : " + this.salary);
    }
}
