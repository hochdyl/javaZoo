package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviour.Swim;
import Animals.Reproduction.Oviparous;

public class Goldfish extends Animal implements Oviparous, Swim {

    public Goldfish(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Goldfish";
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
