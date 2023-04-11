package Strategy;

public class BusTravelStrategy implements TravelStrategy {
    @Override
    public String travel() {
        return "traveled by Bus!";
    }
}
