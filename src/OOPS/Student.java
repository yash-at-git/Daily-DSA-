package OOPS;

public class Student {
    private String name;
    private int age;
    private static int count;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    void display(){
        System.out.println(name +" "+ age);
    }
    static void printCount(){
        System.out.println(count);
    }
}
