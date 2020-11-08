package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviour.Fly;
import Animals.Reproduction.Oviparous;

public class Eagle extends Animal implements Oviparous, Fly {

    public Eagle(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Eagle";
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
    public void fly() {

    }
}
