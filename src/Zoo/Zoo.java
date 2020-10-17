package Zoo;

import Animals.AnimalGender;
import Animals.Types.*;
import Helpers.randomHelper;

public class Zoo {

    public Wolf addWolf() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(66,81);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(23000,80000);

        return new Wolf(gender, weight, size, age);
    }

    public Tiger addTiger() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(70,120);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(65000,310000);

        return new Tiger(gender, weight, size, age);
    }

    public Bear addBear() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(70,150);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(80000,500000);

        return new Bear(gender, weight, size, age);
    }

    public Whale addWhale() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(2000,2300);
        int age = randomHelper.randomNumber(1,90);
        int weight = randomHelper.randomNumber(50000000,150000000);

        return new Whale(gender, weight, size, age);
    }

    public Goldfish addGoldfish() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(15,30);
        int age = randomHelper.randomNumber(1,30);
        int weight = randomHelper.randomNumber(80,120);

        return new Goldfish(gender, weight, size, age);
    }

    public Shark addShark() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(340,640);
        int age = randomHelper.randomNumber(1,70);
        int weight = randomHelper.randomNumber(520000,1100000);

        return new Shark(gender, weight, size, age);
    }

    public Eagle addEagle() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(66,110);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(3000,7000);

        return new Eagle(gender, weight, size, age);
    }

    public Pinguin addPinguin() {
        AnimalGender gender = AnimalGender.random();
        int size = randomHelper.randomNumber(39,48);
        int age = randomHelper.randomNumber(1,20);
        int weight = randomHelper.randomNumber(650,750);

        return new Pinguin(gender, weight, size, age);
    }
}
