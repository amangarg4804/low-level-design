package lowleveldesign.patterns.behavioral.strategy.after1;

public class PathCalculationStrategyFactory {
    public static PathCalculationStrategy getStrategy(TransportMode mode) {
        switch (mode) {
            case CAR:
                return new CarPathCalculationStrategy();
            case WALK:
                return new WalkPathCalculationStrategy();
            case BIKE:
                return new BikePathCalculationStrategy();
            default:
                throw new IllegalArgumentException("Invalid transport mode: " + mode);
        }
    }
}
