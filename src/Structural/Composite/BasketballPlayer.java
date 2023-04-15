package Structural.Composite;

public class BasketballPlayer implements Player {

    private String name;
    private String position;

    public BasketballPlayer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void playerInfo() {
        System.out.println(this.name + ", " + this.position);
    }
}
