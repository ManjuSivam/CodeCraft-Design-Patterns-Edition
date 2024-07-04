package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        //create orangecone - chocosyrup - choco cone - vanilla scoop - choco scoop -  cherry
        Icecream ic = new Cherry(
                        new ChocolateScoop(
                                new VanillaScoop(
                                        new ChocolateCone(
                                                new ChocolateSyrup(
                                                        new OrangeCone()
                                                )
                                        )
                                )
                        )
        );

        System.out.println(ic.getDesc());
        System.out.println(ic.getCost());
    }
}
