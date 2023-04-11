package Decorator;

public class BasketballPlayerDecorator implements BasketballPlayer {

    protected BasketballPlayer basketballPlayer;
    public BasketballPlayerDecorator(BasketballPlayer basketballPlayer) {
        this.basketballPlayer = basketballPlayer;
    }
    @Override
    public String position() {
        return basketballPlayer.position();
    }


}
