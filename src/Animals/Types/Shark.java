package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Shark extends Animal {

    public Shark(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Shark";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
