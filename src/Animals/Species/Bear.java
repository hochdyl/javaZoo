package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Reproduction.Viviparous;

public class Bear extends Animal implements Viviparous {

    public Bear(AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.species = "Bear";
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.age = age;
        this.birth = birth;
    }
}
