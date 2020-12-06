package Enclosures.Types;

import Animals.Species.Whale;
import Enclosures.Categories.Aquarium;
import Enclosures.Categories.AquariumWaterDepth;
import Enclosures.Categories.AquariumWaterSalinity;
import Enclosures.Enclosure;
import Helpers.colorHelper;

public class WhaleEnclosure extends Enclosure implements Aquarium {
    public AquariumWaterDepth waterDepth = AquariumWaterDepth.GOOD;
    public AquariumWaterSalinity waterSalinity = AquariumWaterSalinity.GOOD;

    public WhaleEnclosure(int id, String name, int area, int maxAnimals) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
    }

    public void add(Whale animal) {
        if (animal instanceof Whale) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas une baleine");
        }
    }

    public void remove(Whale animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        } else {
            System.out.println("L'animal n'est pas dans cet aquarium");
        }
    }

    @Override
    public void maintains() {
        if (this.animalList.isEmpty()) {
            clean();
            System.out.println(colorHelper.textYellow("L'enclos a bien été nettoyer"));
            fixWaterDepth();
            System.out.println(colorHelper.textYellow("Le niveau de l'eau a bien été ajustée"));
            fixWaterSalinity();
            System.out.println(colorHelper.textYellow("La salinité de l'eau a bien été ajustée"));
        } else {
            System.out.println(colorHelper.textRed("L'enclos n'est pas vide !"));
        }
    }

    @Override
    public void fixWaterDepth() {
        this.waterDepth = AquariumWaterDepth.GOOD;
    }

    @Override
    public void fixWaterSalinity() {
        this.waterSalinity = AquariumWaterSalinity.GOOD;
    }
}
