package Enclosures;

import Animals.Animal;
import java.util.List;

public abstract class Enclosure {
    public int id;
    public String name;
    public float area;
    public int maxAnimals;
    public int numberAnimals;
    public List<Animal> animalList;
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

    public void maintains() {
        if (this.cleanliness != EnclosureCleanliness.GOOD && animalList.isEmpty()) {
            clean();
        }
    }

    private void clean() {
        this.cleanliness = EnclosureCleanliness.GOOD;
    }

    public void feed() {
        for (int i = 0; i < this.animalList.size(); i++) {
            this.animalList.get(i).setHunger(100);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getMaxAnimals() {
        return maxAnimals;
    }

    public void setMaxAnimals(int maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public int getNumberAnimals() {
        return numberAnimals;
    }

    public void setNumberAnimals(int numberAnimals) {
        this.numberAnimals = numberAnimals;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public EnclosureCleanliness getCleanliness() {
        return cleanliness;
    }
}