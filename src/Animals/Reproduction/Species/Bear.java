package Animals.Reproduction.Species;

import Animals.AnimalGender;
import Animals.Reproduction.Viviparous;

public class Bear extends Viviparous {

    public Bear(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Bear";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
