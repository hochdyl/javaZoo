package Enclosures.Types;

import Animals.Species.Pinguin;
import Enclosures.Categories.*;
import Enclosures.Enclosure;

public class PinguinEnclosure extends Enclosure implements Aquarium, Birdcage {
    public AquariumWaterDepth waterDepth = AquariumWaterDepth.GOOD;
    public AquariumWaterSalinity waterSalinity = AquariumWaterSalinity.GOOD;
    public int height;
    public BirdcageRoofState roofState = BirdcageRoofState.GOOD;

    public PinguinEnclosure(int id, String name, int area, int maxAnimals, int height) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.height = height;
    }

    public void add(Pinguin animal) {
        if (animal instanceof Pinguin) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas un pingouin");
        }
    }

    public void remove(Pinguin animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        } else {
            System.out.println("L'animal n'est pas dans cet enclos");
        }
    }

    @Override
    public void maintains() {
        super.maintains();
        fixWaterDepth();
        fixWaterSalinity();
        repairRoof();
    }

    @Override
    public void getWaterDepth() {
        System.out.println(this.waterDepth);
    }

    @Override
    public void fixWaterDepth() {
        this.waterDepth = AquariumWaterDepth.GOOD;
    }

    @Override
    public void getWaterSalinity() {
        System.out.println(this.waterSalinity);
    }

    @Override
    public void fixWaterSalinity() {
        this.waterSalinity = AquariumWaterSalinity.GOOD;
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
