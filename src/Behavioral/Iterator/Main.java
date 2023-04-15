package Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        team.addPlayer(new Player("Muslera", "Goalkeeper"));
        team.addPlayer(new Player("Nelsson", "Defender"));
        team.addPlayer(new Player("Torreira", "Midfielder"));
        team.addPlayer(new Player("Icardi", "Forward"));

        Iterator<Player> iterator = team.createIterator();

        while (iterator.hasNext()) {
            Player player = iterator.next();
            System.out.println(player.getName() + " - " + player.getPosition());
        }
    }
}
