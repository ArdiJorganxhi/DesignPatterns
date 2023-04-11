package Strategy;

public class TrainTravelStrategy implements TravelStrategy {
    @Override
    public String travel() {
        return "traveled by Train!";
    }
}
