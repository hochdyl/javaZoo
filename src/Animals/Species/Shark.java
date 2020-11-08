package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Reproduction.Oviparous;

public class Shark extends Animal implements Oviparous {

    public Shark(AnimalGender gender, int weight, int size, int age, int[] birth) {
        this.type = "Shark";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.birth = birth;
    }
}
