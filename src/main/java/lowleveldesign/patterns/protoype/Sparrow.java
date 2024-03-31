package lowleveldesign.patterns.protoype;

public class Sparrow extends Bird {

    public Sparrow() {

    }
    public Sparrow(Sparrow sparrow) {
        super(sparrow);
    }

    public Sparrow clone() {
        // how will be copy objects of Parent class?
        // if we use super.clone, it will return Bird object, but bird may have some private attributes with no setters
        // we will use copy constructor. The constructor will take care of calling super which will set all the attributes of parent
        return new Sparrow(this);
    }

    @Override
    public String toString() {
        return "Sparrow{} " + super.toString();
    }
}
