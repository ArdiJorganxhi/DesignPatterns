package Behavioral.Template;

public class Pizza extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing pizza...");
    }

    @Override
    void cook() {
        System.out.println("Cooking pizza...");
    }

    @Override
    void ready() {
        System.out.println("Pizza is ready!");
    }
}
