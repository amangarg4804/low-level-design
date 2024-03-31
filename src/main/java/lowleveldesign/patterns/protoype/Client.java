package lowleveldesign.patterns.protoype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Sparrow());
        birds.add(new Crow());
        birds.add(new Crow());
        System.out.println(birds);
        List<Bird> children = new ArrayList<>();
        for(Bird parent: birds) {
            children.add(parent.clone());
            // this won't clone the attributes of Sparrow and Crow if the Sparrow and Crow don't override the clone method themselves.
            // if the parent class is implementing a clone method, then child classes must implemnet clone method. Otherwise we will get random issues.
            // The object type itself will of parent(Bird) and not the child (Sparrow, crow) because the clone method of Bird is creating a new Bird()
        }
        System.out.println(children);
    }
}