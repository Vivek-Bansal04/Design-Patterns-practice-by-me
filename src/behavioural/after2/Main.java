package behavioural.after2;

public class Main {
    public static void main(String[] args) {
        PathCalculationRegistryStrategy registryStrategy = new PathCalculationRegistryStrategy();
        registryStrategy.register(TransportMode.BIKE,new BikePathCalculationStrategy());
        registryStrategy.register(TransportMode.CAR,new CarPathCalculationStrategy());
        registryStrategy.register(TransportMode.WALK,new WalkPathCalculationStrategy());


        GoogleMaps maps = new GoogleMaps(registryStrategy);
        maps.findPath("cp","gurgaon",TransportMode.BIKE);
    }
}
