package lowleveldesign.patterns.behavioral.strategy.after2;

public class Main {
    // Main class is not the client. Assume that main class is the class that starts up the server and initializes the registry
    public static void main(String[] args) {
        PathCalculationStrategyRegistry registry = new PathCalculationStrategyRegistry();
        registry.register(TransportMode.WALK, new WalkPathCalculationStrategy());
        registry.register(TransportMode.CAR, new CarPathCalculationStrategy());
        registry.register(TransportMode.BIKE, new BikePathCalculationStrategy());
        GoogleMaps maps = new GoogleMaps(registry);
        maps.findPath("Mumbai", "Delhi", TransportMode.WALK);
        maps.findPath("Mumbai", "Delhi", TransportMode.CAR);
        maps.findPath("Mumbai", "Delhi", TransportMode.BIKE);
    }
}
