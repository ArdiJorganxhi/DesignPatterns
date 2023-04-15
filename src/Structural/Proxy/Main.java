package Structural.Proxy;

public class Main {

    public static void main(String[] args) {
        User user = new User("ardijorganxhiu@gmail.com", "123");
        ProxyAuthentication authentication = new ProxyAuthentication(user);
        authentication.message();
    }
}
