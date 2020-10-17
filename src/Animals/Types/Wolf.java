package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Wolf extends Animal {

    public Wolf(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Wolf";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
