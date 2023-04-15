package Creational.Factory;

public class Huawei implements MobileDevice {
    @Override
    public void build() {
        System.out.println("You built a Huawei device!");
    }
}
