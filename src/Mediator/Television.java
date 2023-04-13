package Mediator;

public class Television {

    private boolean isTurnedOn = false;


    public void turnOn() {
        System.out.println("Television is turning on...");
        setTurnedOn(true);
    }


    public void turnOff() {
        System.out.println("Television is turning off...");
        setTurnedOn(false);
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }
}
