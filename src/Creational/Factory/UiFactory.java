package Creational.Factory;

//contains abstract factory methods that returns objects as per user input
public interface UiFactory {
    Button createButton();
    Menu createMenu();
}
