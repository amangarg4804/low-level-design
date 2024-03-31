package lowleveldesign.patterns.protoype;

public class Bird implements Cloneable<Bird>{

    private String name;
    private String color;
    private int weight;
    public Bird() {

    }
    public Bird(Bird bird) {
        this.name = bird.name;
        this.color = bird.color;
        this.weight = bird.weight;
    }

    @Override
    public Bird clone() {
//        Bird b = new Bird();
//        b.name = this.name;
//        b.color = this.color;
//        b.weight = this.weight;
//        return b;
        // the above method of cloning only works for parent object. For child class it doesn't work, because in the child class, we need to set the attributes of parents too
        // Parent has to provide the copy constructor to support cloning in child classes. since we have to add a copy constructor anyway for the child's copy constructor, we can remove the above code and use the copy constructor here as well
        return new Bird(this);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
