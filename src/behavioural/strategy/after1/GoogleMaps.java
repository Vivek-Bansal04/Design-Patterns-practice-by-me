package behavioural.strategy.after1;

public class GoogleMaps {
    public void findPath(String from , String to, TransportMode mode){
        PathCalculationStrategy pathCalculationStrategy = PathCalculationStrategyFactory.getPathCalculationStrategy(mode);
        pathCalculationStrategy.calculatePath(from,to);

    }
}
