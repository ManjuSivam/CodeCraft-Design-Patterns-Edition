package Behavioural.Strategy;

public class PathCalcFactory {
    public static PathCalculationStrategy getPathStrategy(PathMode mode){
        if(mode.equals(PathMode.BIKE)){
            return new BikePathCalcStrategy();
        }
        else if(mode.equals(PathMode.CAR)){
            return  new CarPathCalcStrategy();
        }
        else if(mode.equals(PathMode.WALK)){
            return new WalkPathCalcStrategy();
        }
        return null;
    }
}
