package Composite;

public class FootballPlayer implements Player {

    private String name;
    private String position;

    public FootballPlayer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void playerInfo() {
        System.out.println(this.name + ", " + this.position);
    }
}
