package Enclosures;

import Animals.Animal;
import Animals.AnimalGender;
import Helpers.converterHelper;

import java.util.ArrayList;
import java.util.List;

public abstract class Enclosure {
    public int id;
    public String name;
    public float area;
    public int maxAnimals;
    public List<Animal> animalList = new ArrayList<>();
    public EnclosureCleanliness cleanliness = EnclosureCleanliness.GOOD;

    public void aboutMe() {
        String info = "L'id de l'enclos: " + this.id + "\n";
        info += "Le nom de l'enclos: " + this.name + "\n";
        info += "La surface de l'enclos: " + this.area + "m\n";
        info += "Nombre maximum d'animaux: "+this.maxAnimals+"\n";
        info += "Nombre d'animaux: " + this.animalList.size() + "\n";
        info += "Etat de l'enclos: " + this.cleanliness + "\n";
        System.out.println(info);
        System.out.println();
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

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public EnclosureCleanliness getCleanliness() {
        return cleanliness;
    }
}