package Enclosures.Types;

import Animals.Species.Eagle;
import Enclosures.Categories.Birdcage;
import Enclosures.Categories.BirdcageRoofState;
import Enclosures.Enclosure;

public class EagleEnclosure extends Enclosure implements Birdcage {
    public int height;
    public BirdcageRoofState roofState = BirdcageRoofState.GOOD;

    public EagleEnclosure(int id, String name, int area, int maxAnimals, int height) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.height = height;
    }

    public void add(Eagle animal) {
        if (animal instanceof Eagle) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas un aigle");
        }
    }

    public void remove(Eagle animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        } else {
            System.out.println("L'animal n'est pas dans cet cage");
        }
    }

    @Override
    public void maintains() {
        super.maintains();
        repairRoof();
    }

    @Override
    public void getRoofState() {
        System.out.println(this.roofState);
    }

    @Override
    public void repairRoof() {
        this.roofState = BirdcageRoofState.GOOD;
    }
}
