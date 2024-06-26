package Factory;

public class IOSFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosBtn();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }
}
