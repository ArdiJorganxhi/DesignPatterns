package
        Structural.Bridge;

public class Main {

    public static void main(String[] args) {

        Car mercedes = new Mercedes(new Red());
        mercedes.fill();

        Car wolkswagen = new Wolkswagen(new Green());
        wolkswagen.fill();
    }
}
