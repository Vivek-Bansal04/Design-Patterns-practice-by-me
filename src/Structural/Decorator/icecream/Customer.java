package Structural.Decorator.icecream;
//pizza
//coffee machine
// decorator design patterns are used in building UI designs

public class Customer {
    public static void main(String[] args) {
        //chocobar : blue cone + 2 choco scoop
        // kesar pista : blue cone + 1 vanilla
        IceCreamCone iceCreamCone = new VanillaScoop(new ChocolateScoop(new VanillaScoop(new OrangeCone())));
        IceCreamCone chocobar = new ChocolateScoop(new ChocolateScoop(new BlueCone()));
        IceCreamCone kesarPista = new VanillaScoop(new BlueCone());

        //chocobar with one more vanilla scoop
        IceCreamCone chocoExtra = new VanillaScoop(chocobar);
        System.out.println(iceCreamCone.getCost());
        System.out.println(iceCreamCone.getConstituents());
    }
}
