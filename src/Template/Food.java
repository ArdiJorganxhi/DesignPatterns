package Template;

public abstract class Food {

    abstract void prepare();
    abstract void cook();
    abstract void ready();

    public final void prepareMeal() {
        prepare();
        cook();
        ready();
        System.out.println("Bon Appetit!");
    }
}
