package lowleveldesign.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// the producer class
public class Flipkart {
    private static final Map<Event, List<Observer>> observers = new HashMap<>();
    public static void register(Event event, Observer observer) {
        List<Observer> existingObservers = observers.getOrDefault(event, new ArrayList<>());
        existingObservers.add(observer);
        observers.put(event, existingObservers);
    }
    public void unregister(Event event, Observer observer) {
        List<Observer> existingObservers = observers.getOrDefault(event, new ArrayList<>());
        existingObservers.remove(observer);
        observers.put(event, existingObservers);
    }
    public void notify(Event event, Order order) {
        for(Observer observer: observers.get(event)) {
            observer.listen(event, order);
        }
    }
    public void placeOrder(Order order) {
        System.out.println("placed order");
        notify(Event.ORDER_PLACED, order);
    }
}
