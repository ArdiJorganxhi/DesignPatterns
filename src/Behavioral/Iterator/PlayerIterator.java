package Behavioral.Iterator;

import java.util.List;

public class PlayerIterator implements Iterator<Player> {

    private List<Player> players;
    private int position;

    public PlayerIterator(List<Player> players) {
        this.players = players;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        return position < players.size();
    }

    @Override
    public Player next() {
        if (!hasNext()) {
            return null;
        }

        Player player = players.get(position);
        position++;
        return player;
    }
}
