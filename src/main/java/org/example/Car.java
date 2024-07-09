package org.example;

public class Car {

    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {

        Car car1 = new Car("Toyota Camry", 2023, 25000.0);
        Car car2 = new Car("Honda Accord", 2022, 28000.0);
        Car car3 = new Car("Ford Mustang", 2021, 35000.0);

        car1.displayDetails();
        System.out.println();
        car2.displayDetails();
        System.out.println();
        car3.displayDetails();
        System.out.println();

        System.out.println("After Updation : ");
        car1.setPrice(26000.0);
        car1.displayDetails();
        System.out.println();
        car2.setModel("BMW");
        car2.displayDetails();
    }
}
