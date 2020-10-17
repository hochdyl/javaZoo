package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Bear extends Animal {

    public Bear(AnimalGender gender, int weight, int size, int age) {
        this.type = "Bear";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }
}
