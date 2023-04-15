package Structural.Adapter;

public class Layup implements ProfessionalBasketballPlayer {
    @Override
    public void hitThrees() {

    }

    @Override
    public void scoreFromMidrange() {

    }

    @Override
    public void dunk() {

    }

    @Override
    public void layup() {
        System.out.println("Player scored from layup!");
    }
}
