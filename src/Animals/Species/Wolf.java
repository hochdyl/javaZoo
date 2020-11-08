package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviour.Wander;
import Animals.Reproduction.Viviparous;

public class Wolf extends Animal implements Viviparous, Wander {

    public Wolf(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Wolf";
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
        if (this.awake) System.out.println("The " + this.species + " is wandering !");
    }
}
