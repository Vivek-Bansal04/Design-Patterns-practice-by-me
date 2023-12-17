package behavioural.strategy.after2;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationRegistryStrategy {
    private Map<TransportMode,PathCalculationStrategy> registryMap = new HashMap<>();

    public void register(TransportMode mode,PathCalculationStrategy pathCalculationStrategy){
        registryMap.put(mode,pathCalculationStrategy);
    }

    public PathCalculationStrategy getStrategy(TransportMode mode){
        return registryMap.get(mode);
    }
}
