package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NBAGame implements NBAObserver {

    private List<NBAFan> fans = new ArrayList<>();
    private String gameUpdate;
    @Override
    public void registerObserver(NBAFan fan) {
        fans.add(fan);
    }

    @Override
    public void unregisterObserver(NBAFan fan) {
        fans.remove(fan);
    }

    @Override
    public void notifyObservers(String gameUpdate) {
        for (NBAFan fan : fans) {
            fan.update(gameUpdate);
        }
    }

    public void setGameUpdate(String gameUpdate) {
        this.gameUpdate = gameUpdate;
        notifyObservers(gameUpdate);
    }
}
