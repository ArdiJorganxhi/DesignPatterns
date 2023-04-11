package Decorator;

public class Main {

    public static void main(String[] args) {

        BasketballPlayer shootingGuard = new ShootingGuard();
        BasketballPlayer kobeBryant = new KobeBryantDecorator(shootingGuard);
        System.out.println("Kobe Bryant's court position:" + " " +  kobeBryant.position());

    }
}
