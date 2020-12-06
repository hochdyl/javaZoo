package Enclosures.Types;

import Animals.Species.Eagle;
import Enclosures.Categories.Birdcage;
import Enclosures.Categories.BirdcageRoofState;
import Enclosures.Enclosure;
import Helpers.colorHelper;

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
        if (this.animalList.isEmpty()) {
            clean();
            System.out.println(colorHelper.textYellow("L'enclos a bien été nettoyer"));
            repairRoof();
            System.out.println(colorHelper.textYellow("Le toit de l'enclos a bien été réparer"));
        } else {
            System.out.println(colorHelper.textRed("L'enclos n'est pas vide !"));
        }
    }

    @Override
    public void repairRoof() {
        this.roofState = BirdcageRoofState.GOOD;
    }
}
