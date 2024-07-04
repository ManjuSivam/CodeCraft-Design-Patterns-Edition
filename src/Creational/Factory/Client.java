package Creational.Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.getFactory(SupportedPlatforms.IOS);

        Button btn = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();

        flutter.refreshPage();
        flutter.setTheme();

        btn.click();
        menu.showMenu();
    }

}
