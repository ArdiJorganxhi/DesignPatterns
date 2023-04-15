package Structural.Proxy;

public class ProxyAuthentication implements Authentication {

    private User user;
    private RealAuthentication realAuthentication = new RealAuthentication();

    public ProxyAuthentication(User user) {
        this.user = user;
    }

    @Override
    public void message() {
        if(user.getEmail() != "" && user.getPassword() != "") {
           realAuthentication.message();
        } else {
            System.out.println("You are not authenticated!");
        }
    }
}
