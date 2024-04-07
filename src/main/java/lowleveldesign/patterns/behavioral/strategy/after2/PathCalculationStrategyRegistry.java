package lowleveldesign.patterns.behavioral.strategy.after2;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {
    private Map<TransportMode, PathCalculationStrategy> pathCalculationStrategyMap = new HashMap<>();
    public void register(TransportMode mode, PathCalculationStrategy strategy) {
        pathCalculationStrategyMap.put(mode, strategy);
    }
    public PathCalculationStrategy getStrategy(TransportMode mode) {
        return pathCalculationStrategyMap.get(mode);
    }
}
