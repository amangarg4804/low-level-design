package lowleveldesign.patterns.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType, Bullet> bullets = new HashMap<>();
    public Bullet getBullet(BulletType bulletType) {
        return bullets.get(bulletType);
    }
    public void registerBullet(BulletType bulletType, Bullet bullet) {
        bullets.put(bulletType, bullet);
    }
}
