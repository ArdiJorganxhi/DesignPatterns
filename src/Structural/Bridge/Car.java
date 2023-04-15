package Structural.Bridge;

public abstract class Car {
    protected Color color;

    public Car(Color color) {
        this.color = color;
    }

    abstract public void fill();
}
