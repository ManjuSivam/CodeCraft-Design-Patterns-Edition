package Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();
        maps.findPath(PathMode.BIKE,"Thoraipakkam","Navalur");
    }
}
