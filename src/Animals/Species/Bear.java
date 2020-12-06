package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Reproductions.Viviparous;

public class Bear extends Animal implements Viviparous {

    public Bear(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Ours";
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public void giveBirth() {

    }
}
