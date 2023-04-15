package Structural.Composite;

public class Team {

    public static void main(String[] args) {

        FootballPlayer ronaldo = new FootballPlayer("Cristiano Ronaldo", "Forward");
        FootballPlayer mbappe = new FootballPlayer("Kylian Mbappe", "Forward");
        Squads footballTeam = new Squads();
        footballTeam.addPlayer(ronaldo);
        footballTeam.addPlayer(mbappe);

        BasketballPlayer lebron = new BasketballPlayer("Lebron James", "Small Forward");
        BasketballPlayer doncic = new BasketballPlayer("Luka Doncic", "Point Guard");
        Squads basketballTeam = new Squads();
        basketballTeam.addPlayer(lebron);
        basketballTeam.addPlayer(doncic);

        System.out.println("Football Team:");
        footballTeam.playerInfo();
        System.out.println();
        System.out.println("Basketball Team:");
        basketballTeam.playerInfo();
    }
}
