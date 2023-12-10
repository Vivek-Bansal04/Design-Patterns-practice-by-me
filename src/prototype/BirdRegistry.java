package prototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    //improvement that can be done here is using enum rather than string
    private Map<String,Bird> birds = new HashMap<>();

    public void registerBird(String name, Bird bird){
        birds.put(name,bird);
    }

    public Bird getBird(String name){
        return birds.get(name).clone();
    }
}
