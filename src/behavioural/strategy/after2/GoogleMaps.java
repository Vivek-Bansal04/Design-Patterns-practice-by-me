package behavioural.strategy.after2;

public class GoogleMaps {
    private PathCalculationRegistryStrategy registryStrategy;

    public GoogleMaps(PathCalculationRegistryStrategy registryStrategy) {
        this.registryStrategy = registryStrategy;
    }


    public void findPath(String from , String to, TransportMode mode){
        PathCalculationStrategy pathCalculationStrategy = registryStrategy.getStrategy(mode);
        pathCalculationStrategy.calculatePath(from,to);
    }
}
