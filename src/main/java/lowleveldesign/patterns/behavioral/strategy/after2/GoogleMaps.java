package lowleveldesign.patterns.behavioral.strategy.after2;

public class GoogleMaps {
    private PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();

    public GoogleMaps(PathCalculationStrategyRegistry pathCalculationStrategyRegistry) {
        this.pathCalculationStrategyRegistry = pathCalculationStrategyRegistry;
    }

    public void findPath(String from, String to, TransportMode mode) {
        pathCalculationStrategyRegistry.getStrategy(mode).calculatePath(from, to);
    }
}
