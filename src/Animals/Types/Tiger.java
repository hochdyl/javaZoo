package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Tiger extends Animal {

    public Tiger(AnimalGender gender, int weight, int size, int age) {
        this.type = "Tiger";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }
}
