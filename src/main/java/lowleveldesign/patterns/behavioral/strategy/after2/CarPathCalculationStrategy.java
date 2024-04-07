package lowleveldesign.patterns.behavioral.strategy.after2;

public class CarPathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Driving from " + from + " to " + to);
    }
}
