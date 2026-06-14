public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public Engine getEngine() {
        return this.engine;
    }
}

public class Engine {
    // ...
}
