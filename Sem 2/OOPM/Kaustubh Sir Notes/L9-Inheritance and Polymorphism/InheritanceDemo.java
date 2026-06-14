// Parent class demonstrating constructor invocation
class Vehicle {
    String type;

    // Constructor of the Vehicle class
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called. Type: " + type);
    }

    void startEngine() {
        System.out.println("Engine started for " + type);
    }
}

// Single Inheritance: Car is a child class of Vehicle
class Car extends Vehicle {
    // Constructor of the Car class invoking the parent class constructor using super
    Car() {
        super("Car"); // Invoking the parameterized constructor of the Vehicle class
        System.out.println("Car constructor called.");
    }

    void drive() {
        System.out.println("Car is being driven.");
    }
}

// Multilevel Inheritance: SportsCar is a child class of Car
class SportsCar extends Car {
    // Constructor of the SportsCar class invoking the parent class constructor using super
    SportsCar() {
        System.out.println("SportsCar constructor called.");
    }

    void boost() {
        System.out.println("SportsCar is boosting.");
    }
}

// Hierarchical Inheritance: Bike and Truck are child classes of Vehicle
class Bike extends Vehicle {
    // Constructor of the Bike class invoking the parent class constructor using super
    Bike() {
        super("Bike"); // Invoking the parameterized constructor of the Vehicle class
        System.out.println("Bike constructor called.");
    }

    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

class Truck extends Vehicle {
    // Constructor of the Truck class invoking the parent class constructor using super
    Truck() {
        super("Truck"); // Invoking the parameterized constructor of the Vehicle class
        System.out.println("Truck constructor called.");
    }

    void haul() {
        System.out.println("Truck is hauling.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Demonstrating single inheritance
        Car myCar = new Car();
        myCar.startEngine();
        myCar.drive();

        // Demonstrating multilevel inheritance
        SportsCar mySportsCar = new SportsCar();
        mySportsCar.startEngine();
        mySportsCar.drive();
        mySportsCar.boost();

        // Demonstrating hierarchical inheritance
        Bike myBike = new Bike();
        myBike.startEngine();
        myBike.ride();

        Truck myTruck = new Truck();
        myTruck.startEngine();
        myTruck.haul();
    }
}
