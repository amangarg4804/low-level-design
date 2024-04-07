package lowleveldesign.patterns.behavioral.strategy.after1;

public class GoogleMaps {
    public void findPath(String from, String to, TransportMode mode) {
        PathCalculationStrategy strategy = PathCalculationStrategyFactory.getStrategy(mode);// but we are wasting memory by creating a new object of strategy class again and again
        strategy.calculatePath(from, to);
    }
}
