package Creational.Prototype;

public class ComputerEngineer implements Engineer {

    public void message(String message) {
        System.out.println(message);
    }
    @Override
    public Engineer getClone() {
        return new ComputerEngineer();
    }
}
