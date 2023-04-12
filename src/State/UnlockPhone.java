package State;

public class UnlockPhone implements State {
    @Override
    public void doAction() {
        System.out.println("Phone is unlocked!");
    }
}
