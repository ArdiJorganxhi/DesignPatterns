package Behavioral.Mediator;

public class TVRemote {

    private Mediator mediator = new Mediator();

    public void press() {
        mediator.press();
    }
}
