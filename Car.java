package JavaBasics2;

public final class Car extends Vehicle {
    private boolean convertible;

    public Car(String color, int wheels, double speed, boolean convertible) {
        super(color, wheels, speed);
        this.convertible = convertible;
    }
}
