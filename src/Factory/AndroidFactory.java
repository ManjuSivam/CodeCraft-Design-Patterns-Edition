package Factory;

public class AndroidFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndriodBtn();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }
}
