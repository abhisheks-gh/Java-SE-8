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

    // When this will be called, a frame will be added to stack that's going to have a variable 'desc'

    String getDescription() {
        String desc = "This is a " + color + " " + type;
        // Using 'this' keyword, we can bypass searching for 'color' in the frame & go directly to the
        // object in the heap

        // For example, this.color will bypass the step of looking for the 'color' object in the frame & directly
        return desc;
    }

    // Customize Frame: newColor="blue"  newType="convertible"
    //  void customize(String newColor, String newType) {
    //      color = newColor;
    //      type = newType + " " + type;
    //      System.out.println(getDescription());
    //  }

    void customize(String color, String type) {
        // Both 'color' on LHS & RHS are local variables on frame according to below expression
        // color = color;      // Illegal

        // 'this' means bypass the local variable (color) and go right to the 'color' object of Car class
        this.color = color;

        // Both 'type' on LHS & RHS are local variables on frame according to below expression
        // type = type + " " + type;
        // 'this' means bypass the local variable (type) and go right to the 'type' object of Car class
        this.type = type + " " + this.type;

        System.out.println(getDescription());
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

        // Constructor chaining
        // this("green", "convertible");
    }

    Car(String color, String type) {
        // Car(); Illegal syntax for Constructor chaining
        this();     // Constructor chaining

        // 'this.color' is referring to the instance variable
        // 'color' is referring to the local variable
        this.color = color;
        // this();      // Illegal constructor chaining (Need to be done in the first line)
        this.type = type;

    }
}
