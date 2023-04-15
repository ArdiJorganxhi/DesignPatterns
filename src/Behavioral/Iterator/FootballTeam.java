package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class FootballTeam implements Aggregate<Player> {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public Iterator<Player> createIterator() {
        return new PlayerIterator(players);
    }
}
