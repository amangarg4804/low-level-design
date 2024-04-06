package lowleveldesign.patterns.structural.decorator;

public class VanillaScoop implements IceCreamCone {
    private IceCreamCone iceCreamCone;

    public VanillaScoop(IceCreamCone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }


    @Override
    public int getCost() {
        return iceCreamCone.getCost() +10;
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + " vanilla";
    }
}
