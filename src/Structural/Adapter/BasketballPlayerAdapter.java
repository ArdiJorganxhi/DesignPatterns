package Structural.Adapter;

public class BasketballPlayerAdapter implements BasketballPlayer {

    private ProfessionalBasketballPlayer player;

    public BasketballPlayerAdapter(String player) {
        switch (player) {
            case "DUNK":
                this.player = new Dunk();
                break;
            case "LAYUP":
                this.player = new Layup();
                break;
            case "THREE":
                this.player = new HitThree();
                break;
            case "MIDRANGE":
                this.player = new ScoreMidrange();
                break;
        }
    }

    @Override
    public void score(String choice) {

        switch (choice) {
            case "DUNK":
                player.dunk();
                break;
            case "LAYUP":
                player.layup();
                break;
            case "THREE":
                player.hitThrees();
                break;
            case "MIDRANGE":
                player.scoreFromMidrange();
                break;
        }

    }
}
