package Structural.flyweight.before;

import Structural.flyweight.before.Bullet;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bullet> bulletList = new ArrayList<>();
        for (int i=0;i<20000;i++){
           Bullet bullet = new Bullet();
            bulletList.add(bullet);
        }
    }
}
