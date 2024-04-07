package lowleveldesign.patterns.behavioral.observer;

public interface Observer {// could also make it Observer<T>
    public void listen(Event event, Order order); // we could pass T
}
