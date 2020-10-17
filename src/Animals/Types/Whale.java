package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Whale extends Animal {

    public Whale(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Whale";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
