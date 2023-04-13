package Template;

public class Main {
    public static void main(String[] args) {

        Food pizza = new Pizza();
        pizza.prepareMeal();

        System.out.println();

        Food chicken = new Chicken();
        chicken.prepareMeal();
    }
}
