package Factory;

public class Xiaomi implements MobileDevice {
    @Override
    public void build() {
        System.out.println("You built a Xiaomi device!");
    }
}
