package Creational.Factory;

public class Samsung implements MobileDevice {
    @Override
    public void build() {
        System.out.println("You built a Samsung device!");
    }
}
