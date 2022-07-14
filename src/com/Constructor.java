package com;

public class Constructor {
    public static void main(String[] args) {
        // Constructors are generally used to initialize data
        Car myCar = new Car("Black", "BMW");
        Car newCar = new Car("Silver", "DeLoren DMC-12");
        System.out.println("Previously, I used to drive a " + myCar.color + " " + myCar.type + ".");
        System.out.println("But, now a days i am driving a " + newCar.color + " " + newCar.type + ".");
    }
}
class Car {
    String color;
    String type;
    int serialNumber;

    // static initialization block
    // static initialization block just like static methods can only access static variables & methods.
    // It will be executed only once (when the class will be loaded)
    static {
        // color = "Green";    // Illegal
        setCarCount(3);        // legal as it's a static method
    }

    // 'static' is a modifier that states that variable is tied to the class itself.
    // 'carCount' is created an initialized not when the object is instantiated but when the class is first
    // loaded in JVM by the class loader! (because it's associated with the class, not object)
    static int carCount = 1;

    public static void setCarCount(int c) {
        carCount = c;
    }

    static void resetCarCount() {
        carCount = 0;
    }

    // Constructors are invoked only by using the new keyword, not the notation like methods
    Car() {
        carCount++;
        serialNumber = carCount;
    }

    Car(String c, String t) {
        color = c;
        type = t;
        carCount++;
        serialNumber = carCount;
    }
}
