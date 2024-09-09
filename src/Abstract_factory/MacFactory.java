package Abstract_factory;

// Concrete Factory 2
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Dialog createDialog() {
        return new MacDialog();
    }
}