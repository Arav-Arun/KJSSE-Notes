// Polymorphism Basics
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }

    void makeSound(String sound) {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    // Method Overloading: same method name, different parameters
    void makeSound(String sound, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(sound);
        }
    }

    // Method Overriding: overriding the makeSound() method from the parent class
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Dynamic Method Dispatch
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}



public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphism : Dynamic Method Dispatch
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Bark
        myCat.makeSound(); // Output: Meow

        // Using Method Overloading
        ((Dog) myDog).makeSound("Woof", 3); // Output: Woof Woof Woof
    }
}
