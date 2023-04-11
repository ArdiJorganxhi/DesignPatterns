package Composite;

import java.util.ArrayList;
import java.util.List;

public class Squads implements Player {

    private List<Player> players = new ArrayList<>();
    @Override
    public void playerInfo() {
        for(Player player: players) {
            player.playerInfo();
        }
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }
}
