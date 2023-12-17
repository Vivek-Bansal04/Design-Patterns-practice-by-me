package behavioural.strategy.after2;

public class WalkPathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("finding path for walk");
    }
}
