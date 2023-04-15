package Structural.Proxy;

public class RealAuthentication implements Authentication {
    @Override
    public void message() {
        System.out.println("You are authenticated!");
    }
}
