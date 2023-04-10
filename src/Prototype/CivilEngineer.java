package Prototype;

public class CivilEngineer implements Engineer {

    public void message(String message) {
        System.out.println(message);
    }
    @Override
    public Engineer getClone() {
        return new CivilEngineer();
    }
}
