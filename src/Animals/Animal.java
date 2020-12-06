package Animals;

import Enclosures.Enclosure;
import Helpers.colorHelper;
import Helpers.converterHelper;

public abstract class Animal {
    public int id;
    public String species;
    public AnimalGender gender;
    public int weight;
    public int length;
    public int age;
    public int birth[];
    public int hunger = 100;
    public boolean awake = true;
    public AnimalHealth health = AnimalHealth.GOOD;
    public Enclosure enclosure;

    public Animal() {}

    public void Eat() {
        if (this.awake) {
            int new_hunger = this.hunger + 70;
            if (new_hunger > 100) new_hunger = 100;
            this.hunger = new_hunger;
        }
    }

    public void makeNoise() {
        if (this.awake) {
            System.out.println(colorHelper.textYellow("L'animal à fait un bruit !"));
        } else {
            System.out.println(colorHelper.textYellow("L'animal ne peut pas faire de bruit, il dort !'"));
        }
    }

    public void beHealed() {
        this.health = AnimalHealth.GOOD;
        System.out.println(colorHelper.textYellow("L'animal a été soigné'"));
    }

    public void switchAwake() {
        if (this.awake) {
            this.awake = false;
            System.out.println(colorHelper.textYellow("L'animal s'endort !'"));
        }
        else {
            this.awake = true;
            System.out.println(colorHelper.textYellow("L'animal se reveil !"));
        }
    }

    public void aboutMe() {
        System.out.println();
        String info = "Informations sur l'animal\n";
        info += "--------------------\n";
        info += "L'id de l'animal: " + this.id + "\n";
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
        info += "--------------------";
        System.out.println(info);
    }

    public int getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public AnimalGender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }
}
