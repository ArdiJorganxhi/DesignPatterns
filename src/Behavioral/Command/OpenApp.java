package Behavioral.Command;

public class OpenApp implements Command {

    private App app;

    public OpenApp(App app) {
        this.app = app;
    }

    @Override
    public void execute() {
        app.open();
    }
}
