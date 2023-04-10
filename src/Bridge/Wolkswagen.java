package Bridge;

public class Wolkswagen extends Car {

    public Wolkswagen(Color color) {
        super(color);
    }
    @Override
    public void fill() {
        System.out.println("Wolkswagen's color:");
        color.fill();

    }
}
