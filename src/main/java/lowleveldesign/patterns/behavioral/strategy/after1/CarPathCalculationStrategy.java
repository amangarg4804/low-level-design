package lowleveldesign.patterns.behavioral.strategy.after1;

public class CarPathCalculationStrategy implements PathCalculationStrategy{
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Driving from " + from + " to " + to);
    }
}
