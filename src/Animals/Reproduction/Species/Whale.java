package Animals.Reproduction.Species;

import Animals.AnimalGender;
import Animals.Reproduction.Viviparous;

public class Whale extends Viviparous {

    public Whale(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Whale";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
