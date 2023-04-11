package Decorator;

public class KobeBryantDecorator extends BasketballPlayerDecorator {
    public KobeBryantDecorator(BasketballPlayer basketballPlayer) {
        super(basketballPlayer);
    }

    @Override
    public String position(){
        return basketballPlayer.position() + secondPosition();
    }

    private String secondPosition() {
        return ", Small Forward";
    }
}
