package Abstract_factory;

// Concrete Factory 1
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dialog createDialog() {
        return new WindowsDialog();
    }
}
