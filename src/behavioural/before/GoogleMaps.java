package behavioural.before;

public class GoogleMaps {
    public void findPath(String from ,String to,TransportMode mode){
        if(mode == TransportMode.CAR){
            System.out.println("finding path for car");
        } else if (mode == TransportMode.WALK) {
            System.out.println("finding path for walk");
        } else if (mode == TransportMode.BIKE) {
            System.out.println("finding path for bike");
        }

    }
}
