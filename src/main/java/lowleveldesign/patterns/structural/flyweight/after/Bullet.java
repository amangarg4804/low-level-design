package lowleveldesign.patterns.structural.flyweight.after;

public class Bullet {
    private double radius;
    private double weight;
    private BulletType bulletType;
    private byte[] image;

    public Bullet(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public double getRadius() {
        return radius;
    }

    public Bullet setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Bullet setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public Bullet setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public Bullet setImage(byte[] image) {
        this.image = image;
        return this;
    }
}
