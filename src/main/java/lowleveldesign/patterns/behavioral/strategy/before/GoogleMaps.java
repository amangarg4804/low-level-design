package lowleveldesign.patterns.behavioral.strategy.before;

public class GoogleMaps {
    public void findPath(String from, String to, TransportMode mode) {
        if(mode == TransportMode.WALK) {
            System.out.println("Walking from " + from + " to " + to);
        } else if (mode == TransportMode.CAR) {
            System.out.println("Driving from " + from + " to " + to);
        } else if(mode == TransportMode.BIKE) {
            System.out.println("Biking from " + from + " to " + to);
        }
    }
}
