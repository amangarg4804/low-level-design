package lowleveldesign.patterns.creational.protoype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    Map<String, Bird> birds = new HashMap<>(); // improvement - use Enum in place of String
    public void registerBird(String name, Bird b) {
        birds.put(name, b);
    }

    public Bird get(String name) {
        return birds.get(name).clone();
    }
}
