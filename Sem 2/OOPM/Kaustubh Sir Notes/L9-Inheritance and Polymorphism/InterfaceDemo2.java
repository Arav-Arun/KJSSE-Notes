// Abstract class example
abstract class Shape {
    // Abstract method: to be implemented by subclasses
    abstract void draw();

    // Concrete method: can be overridden
    void resize() {
        System.out.println("Resizing the shape");
    }
}

interface Drawable {
    void draw();

    default void rotate() {
        System.out.println("Rotating the drawable");
    }

    static void info() {
        System.out.println("This is a drawable interface");
    }
}

// Multiple inheritance
class Circle extends Shape implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        // Abstract class example
        Circle circle = new Circle();
        circle.draw(); // Output: Drawing a circle
        circle.resize(); // Output: Resizing the shape

        // Interface example
        Square square = new Square();
        square.draw(); // Output: Drawing a square
        square.rotate(); // Output: Rotating the drawable

        // Calling static method on interface
        Drawable.info(); // Output: This is a drawable interface
    }
}
