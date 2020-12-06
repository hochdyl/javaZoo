package Enclosures.Types;

import Animals.Species.Tiger;
import Enclosures.Enclosure;

public class TigerEnclosure extends Enclosure {

    public TigerEnclosure(int id, String name, int area, int maxAnimals) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.numberAnimals = 0;
    }

    public void add(Tiger animal) {
        if (animal instanceof Tiger) {
            this.animalList.add(animal);
        } else {
            System.out.println("L'animal n'est pas un tigre");
        }
    }

    public void remove(Tiger animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        } else {
            System.out.println("L'animal n'est pas dans cet enclos");
        }
    }
}
