package Creational.Factory;

//Creational.Factory method that produces Creational.Factory based on the User input
public class UIFactoryFactory {
    static UiFactory getFactory(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.IOS)){
            return new IOSFactory();
        }
        else if(platform.equals(SupportedPlatforms.ANDROID)){
            return new AndroidFactory();
        }
        return null;
    }
}
