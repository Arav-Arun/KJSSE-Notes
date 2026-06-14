// Abstract Classes and Methods
abstract class Shape {
    // Abstract Method: no implementation in the abstract class
    abstract void draw();

    // Concrete Method: has implementation in the abstract class
    void display() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    // Implementing abstract method in the concrete class
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    // Implementing abstract method in the concrete class
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Abstract Classes and Methods
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        myCircle.draw(); // Output: Drawing circle
        myRectangle.draw(); // Output: Drawing rectangle

        myCircle.display(); // Output: Displaying shape
        myRectangle.display(); // Output: Displaying shape
    }
}
