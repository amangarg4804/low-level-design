package lowleveldesign.designproblems.pen;

import lowleveldesign.designproblems.pen.strategy.write.WriteBehaviour;

public abstract class Pen {
    private String name;
    private String company;
    private int price;

    private PenType type;

    private WriteBehaviour writeBehaviour;

    public abstract void write();

    public abstract Color getColor(); //Notice that we created getters and setters for all attributes that
    // are part of abstract class Pen. We created abstract methods for behaviours that we wanted all Pens to have. All pens must return their colour by implementing getColor method

    public Pen(PenType penType, WriteBehaviour writeBehaviour) { // Whenever we have multiple subclasses of a Parent class, it is a good practice to have
        // a Type enum attribute in parent class and the let the child classes set its value in their constructor
        this.type = penType;
        this.writeBehaviour = writeBehaviour;
    }
    public PenType getType() {
        return type;
    }

    public Pen setType(PenType type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pen setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Pen setCompany(String company) {
        this.company = company;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Pen setPrice(int price) {
        this.price = price;
        return this;
    }
}
