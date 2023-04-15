package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {

        NBAGame game = new NBAGame();

        NBATeamFan lakersFan = new NBATeamFan("Lakers Fan");
        NBATeamFan celticsFan = new NBATeamFan("Celtics Fan");

        game.registerObserver(lakersFan);
        game.registerObserver(celticsFan);

        game.setGameUpdate("Lakers lead by 5 points!");

    }
}
