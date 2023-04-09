package Factory;

public class Main {

    public static void main(String[] args) {
        MobileDeviceFactory factory = new MobileDeviceFactory();
        MobileDevice mobileDevice = factory.createDevice("APPLE");
        mobileDevice.build();
    }
}
