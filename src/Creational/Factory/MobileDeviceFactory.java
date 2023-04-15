package Creational.Factory;

public class MobileDeviceFactory {

    public MobileDevice createDevice(String device) {
        switch (device) {
            case "APPLE":
                return new Apple();
            case "SAMSUNG":
                return new Samsung();
            case "XIAOMI":
                return new Xiaomi();
            case "HUAWEI":
                return new Huawei();
            default:
                throw new IllegalArgumentException("Unknown device:" + device);
        }
    }
}
