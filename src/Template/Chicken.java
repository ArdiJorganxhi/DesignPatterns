package Template;

public class Chicken extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing chicken...");
    }

    @Override
    void cook() {
        System.out.println("Cooking chicken...");
    }

    @Override
    void ready() {
        System.out.println("Chicken is ready!");
    }
}
