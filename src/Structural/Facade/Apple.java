package Structural.Facade;

public class Apple implements MobileShop {
    @Override
    public void model() {
        System.out.println("iPhone");
    }

    @Override
    public void price() {
        System.out.println("1200$");
    }
}
