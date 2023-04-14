package Command;

public class CloseApp implements Command {

    private App app;

    public CloseApp(App app) {
        this.app = app;
    }

    @Override
    public void execute() {
        app.close();
    }
}
