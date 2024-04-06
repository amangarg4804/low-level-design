package lowleveldesign.patterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamCone vanillaChocolateSandwichCone = new VanillaScoop(new ChocolateScoop(new VanillaScoop(new OrangeCone())));
        System.out.println(vanillaChocolateSandwichCone.getConstituents());
        System.out.println(vanillaChocolateSandwichCone.getCost());

        IceCreamCone chocobar = new ChocolateScoop((new OrangeCone()));
        System.out.println(chocobar.getConstituents());
        System.out.println(chocobar.getCost());
        // Pizza and coffee machie are popular design questions
    }
}
