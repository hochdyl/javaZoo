package Enclosures.Types;

import Animals.Species.Wolf;
import Enclosures.Enclosure;

public class WolfEnclosure extends Enclosure {

    public WolfEnclosure(int id, String name, int area, int maxAnimals) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
    }

    public void add(Wolf animal) {
        if (animal instanceof Wolf) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas un loup");
        }
    }

    public void remove(Wolf animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        } else {
            System.out.println("L'animal n'est pas dans cet enclos");
        }
    }
}
