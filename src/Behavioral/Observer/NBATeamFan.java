package Behavioral.Observer;

public class NBATeamFan implements NBAFan {

    private String name;

    public NBATeamFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String gameUpdate) {
        System.out.println(name + " received update: " + gameUpdate);
    }
}
