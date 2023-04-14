package Command;

public class Main {

    public static void main(String[] args) {

        App app = new App();
        OpenApp openApp = new OpenApp(app);
        CloseApp closeApp = new CloseApp(app);
        openApp.execute();
        closeApp.execute();
    }
}
