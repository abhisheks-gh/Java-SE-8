package com;

public class StaticMethods extends Car {
    public static void main(String[] args) {
        Car c = new Car();
        // legal but confusing (being called like an instance method)
        // car.resetCarCount();
        Car.resetCarCount();
    }
}