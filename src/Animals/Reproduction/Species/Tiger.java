package Animals.Reproduction.Species;

import Animals.AnimalGender;
import Animals.Reproduction.Viviparous;

public class Tiger extends Viviparous {

    public Tiger(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Tiger";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
