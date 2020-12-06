package Enclosures;

import Animals.Animal;
import java.util.List;

public abstract class Enclosure {
    public int id;
    public String name;
    public float area;
    public int maxAnimals;
    public int numberAnimals;
    public List<? extends Animal> animalList;
    public EnclosureCleanliness cleanliness = EnclosureCleanliness.GOOD;

    public void aboutMe() {
        String info = "============================\n";
        info += "Id of enclosure: " + this.id + "\n";
        info += "Name of enclosure: " + this.name + "\n";
        info += "Area of enclosure: " + this.area + "\n";
        info += "Max amount of animals: " + this.maxAnimals + "\n";
        info += "Number of animals: " + this.numberAnimals + "\n";
        info += "List of animals: " + this.animalList + "\n";
        info += "Cleanliness of enclosure: " + this.cleanliness + "\n";
        info += "=============================\n";

        System.out.println(info);
    }
}