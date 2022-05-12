package Constructors;

public class Unité {
    private int hitPoint;
    private int healthPoint;
private int needSkull;
private int needMeat;

    private int place;

    private int needWood;
    private int needStone;
    private int level;

    public Unité(int hitPoint, int healthPoint, int needSkull, int needMeat, int needWood, int needStone, int level) {
        this.hitPoint = hitPoint;
        this.healthPoint = healthPoint;
        this.needSkull = needSkull;
        this.needMeat = needMeat;
        this.needWood = needWood;
        this.needStone = needStone;
        this.level = level;
        this.place = place;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNeedSkull() {
        return needSkull;
    }

    public int getNeedMeat() {
        return needMeat;
    }

    public int getNeedWood() {
        return needWood;
    }

    public int getNeedStone() {
        return needStone;
    }
    public int getPlace(){
        return place;
    }


}
