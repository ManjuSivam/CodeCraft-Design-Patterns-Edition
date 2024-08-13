package Behavioural.Strategy;

public class CarPathCalcStrategy implements PathCalculationStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Car path found from "+from+" to "+to+". You will reach in 20 minutes.");
    }
}
