package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviours.Swim;
import Animals.Reproductions.Oviparous;

public class Goldfish extends Animal implements Oviparous, Swim {

    public Goldfish(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Poisson rouge";
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public void layEgg() {

    }

    @Override
    public void swim() {

    }
}
