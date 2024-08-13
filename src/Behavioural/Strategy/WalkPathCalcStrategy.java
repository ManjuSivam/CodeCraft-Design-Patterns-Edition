package Behavioural.Strategy;

public class WalkPathCalcStrategy implements PathCalculationStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println("Walk path found from "+from+" to "+to+". You will reach in 2 hours.");
    }
}
