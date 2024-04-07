package lowleveldesign.patterns.structural.flyweight.after;

public class FlyingBullet {
    private double speed;
    private BulletStatus bulletStatus;
    private double x_coord;
    private double y_coord;
    private double z_coord;
    private double x_dir;
    private double y_dir;
    private double z_dir;
    private Bullet bullet;

    public double getSpeed() {
        return speed;
    }

    public FlyingBullet setSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public FlyingBullet setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
        return this;
    }

    public double getX_coord() {
        return x_coord;
    }

    public FlyingBullet setX_coord(double x_coord) {
        this.x_coord = x_coord;
        return this;
    }

    public double getY_coord() {
        return y_coord;
    }

    public FlyingBullet setY_coord(double y_coord) {
        this.y_coord = y_coord;
        return this;
    }

    public double getZ_coord() {
        return z_coord;
    }

    public FlyingBullet setZ_coord(double z_coord) {
        this.z_coord = z_coord;
        return this;
    }

    public double getX_dir() {
        return x_dir;
    }

    public FlyingBullet setX_dir(double x_dir) {
        this.x_dir = x_dir;
        return this;
    }

    public double getY_dir() {
        return y_dir;
    }

    public FlyingBullet setY_dir(double y_dir) {
        this.y_dir = y_dir;
        return this;
    }

    public double getZ_dir() {
        return z_dir;
    }

    public FlyingBullet setZ_dir(double z_dir) {
        this.z_dir = z_dir;
        return this;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public FlyingBullet setBullet(Bullet bullet) {
        this.bullet = bullet;
        return this;
    }
}
