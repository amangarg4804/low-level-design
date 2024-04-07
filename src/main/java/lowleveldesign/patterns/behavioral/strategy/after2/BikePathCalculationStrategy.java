package lowleveldesign.patterns.behavioral.strategy.after2;

public class BikePathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Biking from " + from + " to " + to);
    }
}
