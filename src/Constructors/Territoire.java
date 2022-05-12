package Constructors;

public class Territoire {
    private int totalSpace;
    private int rock;
    private int forest;
    private int food;

    public Territoire(int totalSpace, int rock, int forest, int food) {
        this.totalSpace = totalSpace;
        this.rock = rock;
        this.forest = forest;
        this.food = food;
    }

    public int getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(int totalSpace) {
        this.totalSpace = totalSpace;
    }

    public int getRock() {
        return rock;
    }

    public void setRock(int rock) {
        this.rock = rock;
    }

    public int getForest() {
        return forest;
    }

    public void setForest(int forest) {
        this.forest = forest;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
