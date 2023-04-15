package Structural.Bridge;

public class Mercedes extends Car {

    public Mercedes(Color color){
        super(color);
    }
    @Override
    public void fill() {
        System.out.println("Mercedes color:");
        color.fill();
    }
}
