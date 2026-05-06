package com.yash.packages;

public class lambdaDemo {
    public static void main(String[] args) {

        Square obj = (a) -> a*a; //lamba implementation

        int result = obj.SquareArea(5); // using it

        System.out.println(result);
    }
}
