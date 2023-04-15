package Behavioral.Strategy;

public class Travel {

    private TravelStrategy travelStrategy;

    public Travel(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel(String user) {
        System.out.println(user + " " + travelStrategy.travel());
    }
}
