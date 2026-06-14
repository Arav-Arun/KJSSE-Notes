// Abstract class example
abstract class Shape {
    // Abstract method: to be implemented by subclasses
    abstract void draw();

    // Concrete method: partial implementation
    void resize() {
        System.out.println("Resizing the shape");
    }
}

interface Drawable {
    // Abstract method
    void draw();

    // Default method
    default void rotate() {
        System.out.println("Rotating the drawable");
        privateMethodDemo();
    }

    // Static method: can be called on the interface directly
    static void info() {
        System.out.println("This is a drawable interface");
        staticPrivateDemo();
    }
    //Static Private Method
    static private void staticPrivateDemo(){
        System.out.println("Message from the static private method.");
    }
    //Non-static Private Method
    private void privateMethodDemo(){
        System.out.println("Message from the private interface method.");
    }

}

// Multiple inheritance implementation
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

public class InterfaceDemo1 {
    public static void main(String[] args) {
        // Abstract class example
        Circle circle = new Circle();
        circle.draw(); // Output: Drawing a circle
        circle.resize(); // Output: Resizing the shape

        // Interface example
        Square square = new Square();
        square.draw(); // Output: Drawing a square
        square.rotate(); // Output: Rotating the drawable

        // Static method in interfaces
        Drawable.info(); // Output: This is a drawable interface
    }
}
