package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviours.Swim;
import Animals.Reproductions.Viviparous;

public class Whale extends Animal implements Viviparous, Swim {

    public Whale(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Baleine";
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public void giveBirth() {

    }

    @Override
    public void swim() {

    }
}
