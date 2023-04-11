package Facade;

public class MobileShopOwner {
    private MobileShop iPhone;
    private MobileShop samsung;


    public MobileShopOwner() {
        this.iPhone = new Apple();
        this.samsung = new Samsung();
    }

    public void appleSale() {
        iPhone.model();
        iPhone.price();
    }

    public void samsungSale() {
        samsung.model();
        samsung.price();
    }

}
