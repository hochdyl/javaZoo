package Enclosures.Types;

import Animals.Species.Shark;
import Enclosures.Categories.Aquarium;
import Enclosures.Categories.AquariumWaterDepth;
import Enclosures.Categories.AquariumWaterSalinity;
import Enclosures.Enclosure;

public class SharkEnclosure extends Enclosure implements Aquarium {
    public AquariumWaterDepth waterDepth = AquariumWaterDepth.GOOD;
    public AquariumWaterSalinity waterSalinity = AquariumWaterSalinity.GOOD;

    public SharkEnclosure(int id, String name, int area, int maxAnimals) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
    }

    public void add(Shark animal) {
        if (animal instanceof Shark) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas un requin");
        }
    }

    public void remove(Shark animal) {
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
