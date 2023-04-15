package Behavioral.Observer;

public interface NBAObserver {

    void registerObserver(NBAFan fan);

    void unregisterObserver(NBAFan fan);
    void notifyObservers(String gameUpdate);
}
