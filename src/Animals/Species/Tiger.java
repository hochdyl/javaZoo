package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviours.Wander;
import Animals.Reproductions.Viviparous;

public class Tiger extends Animal implements Viviparous, Wander {

    public Tiger(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Tigre";
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public void giveBirth() {

    }

    @Override
    public void wander() {

    }
}
