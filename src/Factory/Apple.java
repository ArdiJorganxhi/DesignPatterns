package Factory;

public class Apple implements MobileDevice {
    @Override
    public void build() {
        System.out.println("You built an iPhone device!");
    }
}
