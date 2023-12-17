package behavioural.after1;

import behavioural.after1.TransportMode;

public class PathCalculationStrategyFactory {
    public static PathCalculationStrategy getPathCalculationStrategy(TransportMode mode){
        if(mode == TransportMode.CAR){
            System.out.println("finding path for car");
        } else if (mode == TransportMode.WALK) {
            System.out.println("finding path for walk");
        } else if (mode == TransportMode.BIKE) {
            System.out.println("finding path for bike");
        }
        throw new RuntimeException("Illegal mode");
    }
}
