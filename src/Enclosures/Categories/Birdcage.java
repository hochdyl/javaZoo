package Enclosures.Categories;

public interface Birdcage {
    public static enum roofState {GOOD,CORRECT,BAD}
    public void getRoofState();
    public void repairRoof();
}
