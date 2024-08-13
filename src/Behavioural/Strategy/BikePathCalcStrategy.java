package Behavioural.Strategy;

public class BikePathCalcStrategy implements PathCalculationStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Bike path found from "+from+" to "+to+". You will reach in 30 minutes.");
    }
}
