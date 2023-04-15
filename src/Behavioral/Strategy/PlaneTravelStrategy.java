package Behavioral.Strategy;

public class PlaneTravelStrategy implements TravelStrategy {
    @Override
    public String travel() {
        return "traveled by Plane";
    }
}
