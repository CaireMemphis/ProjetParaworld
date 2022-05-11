package Constructors;

public class Ressources {

    private int totalPlace;
    private int skull;
    private int meat;
    private int stone;
    private int wood;
    private int era;

    public Ressources(int totalPlace, int skull, int meat, int stone, int wood, int era) {
        this.totalPlace = totalPlace;
        this.skull = skull;
        this.meat = meat;
        this.stone = stone;
        this.wood = wood;
        this.era = era;
    }

    public int getTotalPlace() {
        return totalPlace;
    }

    public void setTotalPlace(int totalPlace) {
        this.totalPlace = totalPlace;
    }

    public int getSkull() {
        return skull;
    }

    public void setSkull(int skull) {
        this.skull = skull;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getEra() {
        return era;
    }

    public void setEra(int era) {
        this.era = era;
    }
}
