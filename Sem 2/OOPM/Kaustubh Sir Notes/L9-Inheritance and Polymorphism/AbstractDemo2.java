// Abstract class with a constructor
abstract class Animal {
    String name;

    // Constructor in the abstract class
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (to be implemented by subclasses)
    public abstract void sound();
}

// Concrete subclass extending the abstract class
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call to the constructor of the abstract class
    }

    // Implementation of the abstract method
    @Override
    public void sound() {
        System.out.println(name + " says woof!");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.sound(); // Output: Buddy says woof!
    }
}
