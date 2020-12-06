package Zoo;

import Animals.AnimalGender;
import Animals.Species.*;
import Helpers.randomHelper;

public class Zoo {
    public int id = 0;

    public Zoo() { }

    public Wolf addWolf() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(120,200);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(23000,80000);
        int[] birth = {62,63};

        return new Wolf(this.id, gender, weight, length, age, birth);
    }

    public Tiger addTiger() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(200,350);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(65000,310000);
        int[] birth = {93,112};

        return new Tiger(this.id, gender, weight, length, age, birth);
    }

    public Bear addBear() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(140,280);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(80000,500000);
        int[] birth = {42,56};

        return new Bear(this.id, gender, weight, length, age, birth);
    }

    public Whale addWhale() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(2300,2500);
        int age = randomHelper.randomNumber(1,90);
        int weight = randomHelper.randomNumber(50000000,150000000);
        int[] birth = {335,365};

        return new Whale(this.id, gender, weight, length, age, birth);
    }

    public Goldfish addGoldfish() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(15,30);
        int age = randomHelper.randomNumber(1,30);
        int weight = randomHelper.randomNumber(80,120);
        int[] birth = {3,5};

        return new Goldfish(this.id, gender, weight, length, age, birth);
    }

    public Shark addShark() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(340,640);
        int age = randomHelper.randomNumber(1,70);
        int weight = randomHelper.randomNumber(520000,1100000);
        int[] birth = {365,547};

        return new Shark(this.id, gender, weight, length, age, birth);
    }

    public Eagle addEagle() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(66,110);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(3000,7000);
        int[] birth = {35,45};

        return new Eagle(this.id, gender, weight, length, age, birth);
    }

    public Pinguin addPinguin() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(39,48);
        int age = randomHelper.randomNumber(1,20);
        int weight = randomHelper.randomNumber(650,750);
        int[] birth = {26,32};

        return new Pinguin(this.id, gender, weight, length, age, birth);
    }
}
