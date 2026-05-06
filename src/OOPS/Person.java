package OOPS;

public class Person {
     String name;
    public Person(String name) {
        this.name = name;
    }
}
class Emploi extends Person{
     double salary;

    public Emploi(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}
class Manager extends Emploi{
     String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public void managerDetails(){
        System.out.println("Name : "+name+", Salary : "+salary+", Department : "+department);
    }
}

