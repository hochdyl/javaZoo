package Animals.Reproduction.Species;

import Animals.AnimalGender;
import Animals.Reproduction.Oviparous;

public class Goldfish extends Oviparous {

    public Goldfish(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Goldfish";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
