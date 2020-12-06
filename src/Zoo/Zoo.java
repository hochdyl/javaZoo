package Zoo;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Species.*;
import Enclosures.Enclosure;
import Helpers.colorHelper;
import Helpers.randomHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public int id = 0;
    public String name;
    public Employee employee;
    public int maxEnclosures;
    public List<Enclosure> enclosureList = new ArrayList<>();
    public List<Animal> animalList = new ArrayList<>();

    public Zoo() {
        Scanner input = new Scanner(System.in);

        System.out.print(colorHelper.textCyan("Entrer le nom du zoo : "));
        this.name = input.next();
        System.out.println("Vous commencerez avec 3 enclos maximum. Pas de panique, vous pourrez en ajouter plus tard !");
        this.maxEnclosures = 3;
        System.out.println();

        System.out.println("Passons maintenant à votre employé");
        System.out.println("Est-ce un homme ou une femme ? (Selectionner le numéro correspondant)");
        System.out.println("--------------------");
        System.out.println("1 - Homme");
        System.out.println("2 - Femme");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value < 1 || value > 2) {
            System.out.println(colorHelper.textRed("Erreur"));
            System.out.print(colorHelper.textCyan("Votre choix : "));
            value = input.nextInt();
        }
        EmployeeGender gender = value == 1 ? EmployeeGender.MALE : EmployeeGender.FEMALE;
        System.out.println();

        System.out.print(colorHelper.textCyan("Quel est son nom : "));
        String name = input.next();
        System.out.println();

        System.out.println("C'est noté ! Quel age de "+name+" ? (Compris entre 18 et 99)");
        System.out.print(colorHelper.textCyan("Age de "+name+" : "));
        int age = input.nextInt();
        while (age < 18 || age > 99) {
            System.out.println(colorHelper.textRed("Erreur"));
            System.out.print(colorHelper.textCyan("Age de "+name+" : "));
            age = input.nextInt();
        }
        System.out.println();

        System.out.println("Parfait, on s'occupe d'ajouter "+name+" à votre nouveau zoo.");
        this.employee = new Employee(name,gender,age);
    }

    public void addWolf() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(120,200);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(23000,80000);
        int[] birth = {62,63};
        Wolf animal = new Wolf(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le loup ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addTiger() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(200,350);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(65000,310000);
        int[] birth = {93,112};
        Tiger animal = new Tiger(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le tigre ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addBear() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(140,280);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(80000,500000);
        int[] birth = {42,56};
        Bear animal = new Bear(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("L'ours ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addWhale() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(2300,2500);
        int age = randomHelper.randomNumber(1,90);
        int weight = randomHelper.randomNumber(50000000,150000000);
        int[] birth = {335,365};
        Whale animal = new Whale(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("La baleine ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addGoldfish() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(15,30);
        int age = randomHelper.randomNumber(1,30);
        int weight = randomHelper.randomNumber(80,120);
        int[] birth = {3,5};
        Goldfish animal = new Goldfish(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le poisson rouge ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addShark() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(340,640);
        int age = randomHelper.randomNumber(1,70);
        int weight = randomHelper.randomNumber(520000,1100000);
        int[] birth = {365,547};
        Shark animal = new Shark(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le requin ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addEagle() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(66,110);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(3000,7000);
        int[] birth = {35,45};
        Eagle animal = new Eagle(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("L'aigle ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addPinguin() {
        this.id += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(39,48);
        int age = randomHelper.randomNumber(1,20);
        int weight = randomHelper.randomNumber(650,750);
        int[] birth = {26,32};
        Pinguin animal = new Pinguin(this.id, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le pingouin ["+this.id+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public int getMaxEnclosures() {
        return maxEnclosures;
    }

    public void setMaxEnclosures(int maxEnclosures) {
        this.maxEnclosures = maxEnclosures;
    }

    public List<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
