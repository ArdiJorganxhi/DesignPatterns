package Behavioral.State;

public class LockPhone implements State {
    @Override
    public void doAction() {
        System.out.println("Phone is locked!");
    }
}
