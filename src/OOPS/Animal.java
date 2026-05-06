package OOPS;

public class Animal {
    public void sound(){
        System.out.println("animal sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("dog barking sound!!");
    }
}
