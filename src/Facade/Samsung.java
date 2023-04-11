package Facade;

public class Samsung implements MobileShop {
    @Override
    public void model() {
        System.out.println("Samsung Galaxy");
    }

    @Override
    public void price() {
        System.out.println("1100$");
    }
}
