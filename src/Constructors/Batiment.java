package Constructors;

public class Batiment {
    private int healthPoint;
    private int needSkull;
    private int needMeat;
    private int needWood;
    private int needStone;
    private int space;


    public Batiment(int hitPoint, int healthPoint, int needSkull, int needMeat, int needWood, int needStone, int territory) {

        this.healthPoint = healthPoint;
        this.needSkull = needSkull;
        this.needMeat = needMeat;
        this.needWood = needWood;
        this.needStone = needStone;
        this.space = space;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
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

    public int getSpace() {
        return space;
    }
}
