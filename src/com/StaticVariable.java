package com;

public class StaticVariable extends Car {
    public static void main(String[] args) {
        // To access the variable carCount, we use the class name followed by a dot(.) operator
        // and name of the class variable (static variable)
        // Objects/instances can't be used to access the class variable
        Car.carCount = 1;   // File: Constructor.java

        // Also, we can use reference variable, for example
        // Car newCar = new Car("Black", "Ranger");
        // Reference variable will also work (but it's NOT RECOMMENDED)
        // newCar.carCount = 1;

    }
}
