package Enclosures;

import Animals.Animal;
import Helpers.colorHelper;

import java.util.ArrayList;
import java.util.List;

public abstract class Enclosure {
    public int id;
    public String name;
    public int area;
    public int maxAnimals;
    public List<Animal> animalList = new ArrayList<>();
    public EnclosureCleanliness cleanliness = EnclosureCleanliness.GOOD;

    public Enclosure() {}

    public void aboutMe() {
        System.out.println();
        String info = "Informations sur l'enclos\n";
        info += "--------------------\n";
        info += "L'id de l'enclos: " + this.id + "\n";
        info += "Le nom de l'enclos: " + this.name + "\n";
        info += "La surface de l'enclos: " + this.area + "m\n";
        info += "Nombre maximum d'animaux: "+this.maxAnimals+"\n";
        info += "Nombre d'animaux: " + this.animalList.size() + "\n";
        info += "Etat de l'enclos: " + this.cleanliness + "\n";
        info += "--------------------";
        System.out.println(info);
    }

    public void maintains() {
        if (this.animalList.isEmpty()) {
            clean();
            System.out.println(colorHelper.textYellow("L'enclos a bien été nettoyer"));
        } else {
            System.out.println(colorHelper.textRed("L'enclos n'est pas vide !"));
        }
    }

    public void clean() {
        this.cleanliness = EnclosureCleanliness.GOOD;
    }

    public void feed() {
        for (int i = 0; i < this.animalList.size(); i++) {
            this.animalList.get(i).Eat();
        }
        System.out.println(colorHelper.textYellow("Les animaux de l'enclos ont bien été nourris"));
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

    public void setArea(int area) {
        this.area = area;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}