// Base class (parent class)
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Derived class (child class) inheriting from Animal
class Dog extends Animal {
    // Method overriding: overriding the makeSound() method from the parent class
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    // New method specific to Dog class
    void wagTail() {
        System.out.println("Tail wagging");
    }
}

// Another derived class (child class) inheriting from Animal
class Cat extends Animal {
    // Method overriding: overriding the makeSound() method from the parent class
    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    // New method specific to Cat class
    void purr() {
        System.out.println("Purring");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        // Polymorphism: Method will be decided based on type of the object
	// aka Dynamic Method Dispatch
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Method overriding in action
        dog.makeSound(); // Output: Bark
        cat.makeSound(); // Output: Meow

        // The following lines will cause compilation errors because wagTail() and purr() methods
        // are specific to Dog and Cat classes respectively and cannot be accessed using Animal reference.
        // dog.wagTail(); // Compilation error
        // cat.purr(); // Compilation error
    }
}
