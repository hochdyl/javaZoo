package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Eagle extends Animal {

    public Eagle(AnimalGender gender, int weight, int size, int age) {
        this.type = "Eagle";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }
}
