package lowleveldesign.patterns.structural.flyweight.after;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();
        Bullet fiveMMBullet = new Bullet(BulletType.FIVE_MM);
        bulletRegistry.registerBullet(BulletType.FIVE_MM, fiveMMBullet);

        Bullet sevenMMBullet = new Bullet(BulletType.SEVEN_MM);
        bulletRegistry.registerBullet(BulletType.SEVEN_MM, sevenMMBullet);

        List<FlyingBullet> flyingBullets = new ArrayList<>();

        for(int i=0; i< 200000; i++) {
            FlyingBullet flyingBullet = new FlyingBullet();
            flyingBullet.setSpeed(120.);
            flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
            flyingBullets.add(flyingBullet);
        }
        // we created 200000 flying bullets but only 2 objects of Bullet
        System.out.println("hello");
    }
}
