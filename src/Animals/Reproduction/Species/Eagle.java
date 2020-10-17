package Animals.Reproduction.Species;

import Animals.AnimalGender;
import Animals.Reproduction.Oviparous;

public class Eagle extends Oviparous {

    public Eagle(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Eagle";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
