package Structural.flyweight.after;

public class Bullet {
    private double radius;
    private double weight;
    private BulletType bulletType;
    private BulletStatus bulletStatus;
    private byte[] image;
    private long userId;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public byte[] getImage() {
        return image;
    }

    public long getUserId() {
        return userId;
    }
}
