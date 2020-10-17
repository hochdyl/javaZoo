package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Goldfish extends Animal {

    public Goldfish(AnimalGender gender, int weight, int size, int age) {
        this.type = "Goldfish";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }
}
