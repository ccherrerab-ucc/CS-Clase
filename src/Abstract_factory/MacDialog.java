package Abstract_factory;

public class MacDialog implements Dialog {
    @Override
    public void render() {
        System.out.println("Rendering a dialog in Mac style.");
    }
}