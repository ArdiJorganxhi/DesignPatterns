package Adapter;

public class BasketballPlayerImpl implements BasketballPlayer {

    private BasketballPlayerAdapter basketballPlayerAdapter;
    @Override
    public void score(String choice) {

        if (choice.toUpperCase() == "DUNK" || choice.toUpperCase() == "LAYUP" || choice.toUpperCase() == "THREE" || choice.toUpperCase() == "MIDRANGE") {
                basketballPlayerAdapter = new BasketballPlayerAdapter(choice.toUpperCase());
                basketballPlayerAdapter.score(choice.toUpperCase());
        } else {
            System.out.println("Player scored!");
        }
    }
}
