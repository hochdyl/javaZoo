package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviour.Swim;
import Animals.Reproduction.Viviparous;

public class Whale extends Animal implements Viviparous, Swim {

    public Whale(AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.species = "Whale";
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
    public void Swim() {

    }
}
