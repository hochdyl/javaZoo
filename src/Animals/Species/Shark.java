package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviour.Swim;
import Animals.Reproduction.Oviparous;

public class Shark extends Animal implements Oviparous, Swim {

    public Shark(AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.species = "Shark";
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
    public void Swim() {

    }
}
