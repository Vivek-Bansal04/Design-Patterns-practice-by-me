package Structural.flyweight.after;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();
        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.FIVE_MM);

        Bullet sevenMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.SEVEN_MM);

        Bullet nineeMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.NINE_MM);

        bulletRegistry.registerBullet(BulletType.FIVE_MM,fiveMMBullet);
        bulletRegistry.registerBullet(BulletType.SEVEN_MM,sevenMMBullet);
        bulletRegistry.registerBullet(BulletType.NINE_MM,nineeMMBullet);


        List<FlyingBullet> bulletList = new ArrayList<>();
        for (int i=0;i<20000;i++){
            FlyingBullet bullet = new FlyingBullet();
            bullet.setSpeed(120);
            bullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
            bulletList.add(bullet);
        }
    }
}
