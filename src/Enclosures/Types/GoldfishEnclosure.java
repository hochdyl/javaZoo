package Enclosures.Types;

import Animals.Species.Goldfish;
import Enclosures.Categories.Aquarium;
import Enclosures.Categories.AquariumWaterDepth;
import Enclosures.Categories.AquariumWaterSalinity;
import Enclosures.Enclosure;

public class GoldfishEnclosure extends Enclosure implements Aquarium {
    public AquariumWaterDepth waterDepth = AquariumWaterDepth.GOOD;
    public AquariumWaterSalinity waterSalinity = AquariumWaterSalinity.GOOD;

    public GoldfishEnclosure(int id, String name, int area, int maxAnimals) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.numberAnimals = 0;
    }

    public void add(Goldfish animal) {
        if (animal instanceof Goldfish) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas un poisson rouge");
        }
    }

    public void remove(Goldfish animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        } else {
            System.out.println("L'animal n'est pas dans cet aquarium");
        }
    }

    @Override
    public void maintains() {
        super.maintains();
        fixWaterDepth();
        fixWaterSalinity();
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
}
