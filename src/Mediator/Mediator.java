package Mediator;

public class Mediator {
    private Television television = new Television();
    public void press() {
        if(television.isTurnedOn()) {
            television.turnOff();
        } else {
            television.turnOn();
        }
    }

}
