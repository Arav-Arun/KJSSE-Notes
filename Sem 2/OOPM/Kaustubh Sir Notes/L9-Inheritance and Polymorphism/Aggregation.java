public class Car {
    private ArrayList<Wheel> wheels;

    public Car() {
        this.wheels = new ArrayList<>();
    }

    public void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }

    public ArrayList<Wheel> getWheels() {
        return this.wheels;
    }
}

public class Wheel {
    // ...
}
