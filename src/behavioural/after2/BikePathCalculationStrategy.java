package behavioural.after2;

public class BikePathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("finding path for bike");
    }
}
