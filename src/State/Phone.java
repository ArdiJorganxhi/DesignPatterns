package State;

public class Phone {

    public static void main(String[] args) {

        PhoneContext context = new PhoneContext();
        State unlock = new UnlockPhone();
        State lock = new LockPhone();

        System.out.println("Unlocking phone...");
        context.setState(unlock);
        context.doAction();

        System.out.println("Locking phone...");
        context.setState(lock);
        context.doAction();
    }
}
