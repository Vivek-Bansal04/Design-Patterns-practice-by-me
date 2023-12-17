package behavioural.after1;

public class CarPathCalculationStrategy implements PathCalculationStrategy{
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("finding path for car");
    }
}
