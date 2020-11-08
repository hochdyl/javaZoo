package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Reproduction.Viviparous;

public class Wolf extends Animal implements Viviparous {

    public Wolf(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Wolf";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }

}
