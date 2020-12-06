package Enclosures.Types;

import Animals.Species.Bear;
import Enclosures.Enclosure;

public class BearEnclosure extends Enclosure {

    public BearEnclosure(int id, String name, int area, int maxAnimals) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
    }

    public void add(Bear animal) {
        if (animal instanceof Bear) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas un ours");
        }
    }

    public void remove(Bear animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        } else {
            System.out.println("L'animal n'est pas dans cet enclos");
        }
    }
}
