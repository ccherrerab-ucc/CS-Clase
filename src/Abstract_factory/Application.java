package Abstract_factory;

public class Application {
    private Button button;
    private Dialog dialog;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        dialog = factory.createDialog();
    }

    public void renderUI() {
        button.paint();
        dialog.render();
    }

    public static void main(String[] args) {
        // Create a Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.renderUI();

        // Create a Mac GUI
        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.renderUI();
    }
}
