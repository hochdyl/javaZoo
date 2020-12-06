package Zoo;

import Animals.AnimalGender;
import Animals.Species.*;
import Enclosures.Enclosure;
import Helpers.colorHelper;
import Helpers.randomHelper;

import java.util.List;
import java.util.Scanner;

public class Zoo {
    public int id = 0;
    public String name;
    public Employee employee;
    public int maxEnclosures;
    public List<Enclosure> enclosureList;

    public Zoo() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer le nom du zoo : ");
        this.name = input.next();
        System.out.println("Vous commencerez avec 3 enclos. Pas de panique, vous pourrez en ajouter plus tard !");
        this.maxEnclosures = 3;
        System.out.println();

        System.out.println("Passons maintenant à votre employé");
        System.out.println("Est-ce un homme ou une femme ? (Selectionner le numéro correspondant)");
        System.out.println("--------------------");
        System.out.println("1 - Homme");
        System.out.println("2 - Femme");
        System.out.println("--------------------");
        System.out.print("Votre choix : ");
        int value = input.nextInt();
        while (value < 1 || value > 2) {
            System.out.println(colorHelper.textRed("Erreur : Séléctionner un nombre entre 1 et 2"));
            System.out.print("Votre choix : ");
            value = input.nextInt();
        }
        EmployeeGender gender = value == 1 ? EmployeeGender.MALE : EmployeeGender.FEMALE;
        System.out.println();

        System.out.print("Quel est son nom : ");
        String name = input.next();
        System.out.println();

        System.out.println("C'est noté ! Quel age de "+name+" ? (Compris entre 18 et 99)");
        System.out.print("Age de "+name+" : ");
        int age = input.nextInt();
        while (age < 18 || age > 99) {
            System.out.println(colorHelper.textRed("Erreur : Séléctionner un nombre entre 18 et 99"));
            System.out.print("Age de "+name+" : ");
            age = input.nextInt();
        }
        System.out.println();

        System.out.println("Parfait, on s'occupe d'ajouter "+name+" à votre nouveau zoo.");
        this.employee = new Employee(name,gender,age);
    }

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
