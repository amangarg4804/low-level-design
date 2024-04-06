package lowleveldesign.patterns.structural.decorator;

// this is a base class, you can't decorate something with a cone, cone is the base class to start with
public class BlueCone implements IceCreamCone{

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getConstituents() {
        return "Blue Cone";
    }
}
