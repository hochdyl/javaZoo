package Animals;

import Enclosures.Enclosure;
import Helpers.converterHelper;

public abstract class Animal {
    public int id;
    public String species;
    public AnimalGender gender;
    public int weight;
    public int length;
    public int age;
    public int birth[]; // Nombre de jours avant une nouvelle naissance
    public int hunger = 100;
    public boolean awake = true;
    public AnimalHealth health = AnimalHealth.GOOD;
    public Enclosure enclosure;

    public void Eat() {
        if (this.awake) {
            int new_hunger = this.hunger + 70;
            if (new_hunger > 100) new_hunger = 100;
            this.hunger = new_hunger;
        }
    }

    public void makeNoise() {
        if (this.awake) System.out.println("The " + this.species + " make a noise !");
    }

    public void beHealed() {
        this.health = AnimalHealth.GOOD;
    }

    public void switchAwake() {
        if (this.awake) this.awake = false;
        else this.awake = true;
    }

    public void aboutMe() {
        String info = "L'id de l'animal: " + this.id + "\n";
        info += "Espèce de l'animal: " + this.species + "\n";
        info += "Genre de l'animal: " + this.gender + "\n";
        if (this.gender == AnimalGender.FEMALE)
        {
            info += "Nouvelle naissance : " + this.birth[0] + "-" + this.birth[1] + " Jours\n";
        }
        info += "Poids de l'animal: " + converterHelper.isGramOrKilogram(this.weight) + "\n";
        info += "Taille de l'animal: " + converterHelper.isCentimeterOrMeter(this.length) + "\n";
        info += "Faim de l'animal: " + this.hunger + "\n";
        info += "L'animal est réveiller : " + this.awake + "\n";
        info += "Etat de santé de l'animal: " + this.health + "\n";
        System.out.println(info);
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public void addAnimalInEnclos(Animal theAnimal) {
        
    }

    public String getSpecies() {
        return species;
    }

    public AnimalGender getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLenght() {
        return length;
    }

    public void setLenght(int length) {
        this.length = length;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public boolean getAwake() {
        return awake;
    }

    public AnimalHealth getHealth() {
        return health;
    }

    public void setHealth(AnimalHealth health) {
        this.health = health;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }
}
