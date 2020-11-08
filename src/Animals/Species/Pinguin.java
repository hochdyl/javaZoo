package Animals.Species;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Behaviour.Fly;
import Animals.Behaviour.Swim;
import Animals.Reproduction.Oviparous;

public class Pinguin extends Animal implements Oviparous, Fly, Swim {

    public Pinguin(int id, AnimalGender gender, int weight, int length, int age, int[] birth) {
        this.id = id;
        this.species = "Pinguin";
        this.gender = gender;
        this.weight = weight;
        this.length = length;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public void layEgg() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
