package Creational.Singleton;

public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello World! I'm a Creational.Singleton object.");
    }
}
