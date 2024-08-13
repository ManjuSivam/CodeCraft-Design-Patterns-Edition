package Behavioural.Strategy;

public class GoogleMaps {
    public void findPath(PathMode mode, String from, String to){
        PathCalculationStrategy pathCalcStrategy = PathCalcFactory.getPathStrategy(mode);
        pathCalcStrategy.findPath(from, to);
    }
}
