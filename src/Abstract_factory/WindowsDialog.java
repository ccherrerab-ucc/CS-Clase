package Abstract_factory;

public class WindowsDialog implements Dialog {
    @Override
    public void render() {
        System.out.println("Rendering a dialog in Windows style.");
    }
}