package lowleveldesign.patterns.creational.protoype;

public class Crow extends Bird{
    private String sound = "Kaw";
    public Crow() {

    }
    private Crow(Crow crow) { // private copy constructor
        // we can't just rely of default call to super. The default all to super will simply initialize all parents attributes to their default values
        // In the new object, we want the values of parent to be same as the original Crow object being cloned.
        super(crow);
        this.sound = crow.sound;
    }
    public Crow clone() {
        // how will be copy objects of Parent class?
        // if we use super.clone, it will return Bird object, but bird may have some private attributes with no setters
        // we will use copy constructor. The constructor will take care of calling super which will set all the attributes of parent
        Crow crow = new Crow(this);
        return crow;
    }

    public Crow setSound(String sound) {
        this.sound = sound;
        return this;
    }

    @Override
    public String toString() {
        return "Crow{" +
                "sound='" + sound + '\'' +
                "} " + super.toString();
    }
}
