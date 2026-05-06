public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Manoj");
        Employee e3 = new Employee("Harendar", 788.27f);
        Employee e4 = new Employee("Mahendar", 899.27f,"Sales");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
   }
    static class Employee {
        String name;
        float salary;
        String department;

        Employee(){
            this("unknown",0,null);
        }
        Employee(String name){
            this(name,0,null);
        }
        Employee(String name,float salary){
            this(name,salary,null);
        }
        Employee(String name, float salary, String department){
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
        void display() {
            System.out.println("name : " + name);
            System.out.printf("salary($) : %.2f ", salary);
            System.out.println();
            System.out.println("Department : " + (department != null ? department : "Not provided"));
        }
    }
}
