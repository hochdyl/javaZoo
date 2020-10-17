package Animals.Types;

import Animals.Animal;
import Animals.AnimalGender;

public class Pinguin extends Animal {

    public Pinguin(AnimalGender gender, int weight, int size, int age) {
        this.type = "Pinguin";
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }
}
