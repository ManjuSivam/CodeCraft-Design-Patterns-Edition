package Creational.Factory;

public class Flutter {
    void refreshPage(){
        System.out.println("Page refreshed...");
    }
    void setTheme(){
        System.out.println("Setting theme...");
    }

    UiFactory getFactory(SupportedPlatforms platform){
        return UIFactoryFactory.getFactory(platform);
    }
}
