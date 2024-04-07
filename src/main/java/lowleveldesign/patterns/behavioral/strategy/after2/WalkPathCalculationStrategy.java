package lowleveldesign.patterns.behavioral.strategy.after2;

public class WalkPathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Walking from " + from + " to " + to);
    }
}
