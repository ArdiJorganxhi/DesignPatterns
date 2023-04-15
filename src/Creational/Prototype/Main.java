package Creational.Prototype;

public class Main {

    public static void main(String[] args) {

        ComputerEngineer computerEngineer = new ComputerEngineer();
        ComputerEngineer computerEngineerCopy = (ComputerEngineer) computerEngineer.getClone();
        CivilEngineer civilEngineer = new CivilEngineer();
        CivilEngineer civilEngineerCopy = (CivilEngineer) civilEngineer.getClone();
        computerEngineer.message("I'm a Computer Engineer!");
        computerEngineerCopy.message("I'm a Computer Engineer copy!");
        civilEngineer.message("I'm a Civil Engineer!");
        civilEngineerCopy.message("I'm a Civil Engineer copy!");
    }
}
