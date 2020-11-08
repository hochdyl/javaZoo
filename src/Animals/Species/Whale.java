package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Reproduction.Viviparous;

public class Whale extends Animal implements Viviparous {

    public Whale(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Whale";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
