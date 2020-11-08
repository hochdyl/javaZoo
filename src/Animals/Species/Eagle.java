package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviour.Fly;
import Animals.Reproduction.Oviparous;

public class Eagle extends Animal implements Oviparous, Fly {

    public Eagle(AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.species = "Eagle";
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public void Fly() {

    }
}
