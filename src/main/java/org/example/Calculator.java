package org.example;

public class Calculator {
    

    public int add(int a, int b) {
        return a + b;
    }
    

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    

    public double add(double a, double b) {
        return a + b;
    }
    

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
        System.out.println("Concatenated string: " + calc.add("Hello ", "World"));
    }
}
