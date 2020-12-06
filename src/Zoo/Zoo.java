package Zoo;

import Animals.Animal;
import Animals.AnimalGender;
import Animals.Species.*;
import Enclosures.Enclosure;
import Enclosures.Types.*;
import Helpers.colorHelper;
import Helpers.randomHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public int animalId = 0;
    public int enclosureId = 0;
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
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(120,200);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(23000,80000);
        int[] birth = {62,63};
        Wolf animal = new Wolf(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le loup ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addTiger() {
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(200,350);
        int age = randomHelper.randomNumber(1,10);
        int weight = randomHelper.randomNumber(65000,310000);
        int[] birth = {93,112};
        Tiger animal = new Tiger(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le tigre ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addBear() {
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(140,280);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(80000,500000);
        int[] birth = {42,56};
        Bear animal = new Bear(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("L'ours ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addWhale() {
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(2300,2500);
        int age = randomHelper.randomNumber(1,90);
        int weight = randomHelper.randomNumber(50000000,150000000);
        int[] birth = {335,365};
        Whale animal = new Whale(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("La baleine ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addGoldfish() {
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(15,30);
        int age = randomHelper.randomNumber(1,30);
        int weight = randomHelper.randomNumber(80,120);
        int[] birth = {3,5};
        Goldfish animal = new Goldfish(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le poisson rouge ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addShark() {
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(340,640);
        int age = randomHelper.randomNumber(1,70);
        int weight = randomHelper.randomNumber(520000,1100000);
        int[] birth = {365,547};
        Shark animal = new Shark(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le requin ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addEagle() {
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(66,110);
        int age = randomHelper.randomNumber(1,25);
        int weight = randomHelper.randomNumber(3000,7000);
        int[] birth = {35,45};
        Eagle animal = new Eagle(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("L'aigle ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addPinguin() {
        this.animalId += 1;
        AnimalGender gender = AnimalGender.random();
        int length = randomHelper.randomNumber(39,48);
        int age = randomHelper.randomNumber(1,20);
        int weight = randomHelper.randomNumber(650,750);
        int[] birth = {26,32};
        Pinguin animal = new Pinguin(this.animalId, gender, weight, length, age, birth);
        System.out.println(colorHelper.textYellow("Le pingouin ["+this.animalId+"] a été ajouté à votre zoo !"));
        this.animalList.add(animal);
    }

    public void addWolfEnclosure(String name, int area) {
        this.enclosureId += 1;
        WolfEnclosure enclosure = new WolfEnclosure(this.enclosureId, name, area, 5);
        System.out.println(colorHelper.textYellow("L'enclos à loups ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public void addTigerEnclosure(String name, int area) {
        this.enclosureId += 1;
        TigerEnclosure enclosure = new TigerEnclosure(this.enclosureId, name, area, 5);
        System.out.println(colorHelper.textYellow("L'enclos à tigres ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public void addBearEnclosure(String name, int area) {
        this.enclosureId += 1;
        BearEnclosure enclosure = new BearEnclosure(this.enclosureId, name, area, 5);
        System.out.println(colorHelper.textYellow("L'enclos à ours ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public void addWhaleEnclosure(String name, int area) {
        this.enclosureId += 1;
        WhaleEnclosure enclosure = new WhaleEnclosure(this.enclosureId, name, area, 5);
        System.out.println(colorHelper.textYellow("L'aquarium à baleines ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public void addGoldfishEnclosure(String name, int area) {
        this.enclosureId += 1;
        GoldfishEnclosure enclosure = new GoldfishEnclosure(this.enclosureId, name, area, 5);
        System.out.println(colorHelper.textYellow("L'aquarium à poissons rouge ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public void addSharkEnclosure(String name, int area) {
        this.enclosureId += 1;
        SharkEnclosure enclosure = new SharkEnclosure(this.enclosureId, name, area, 5);
        System.out.println(colorHelper.textYellow("L'aquarium à requins ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public void addEagleEnclosure(String name, int area, int height) {
        this.enclosureId += 1;
        EagleEnclosure enclosure = new EagleEnclosure(this.enclosureId, name, area, 5, height);
        System.out.println(colorHelper.textYellow("La cage à aigles ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public void addPinguinEnclosure(String name, int area, int height) {
        this.enclosureId += 1;
        PinguinEnclosure enclosure = new PinguinEnclosure(this.enclosureId, name, area, 5, height);
        System.out.println(colorHelper.textYellow("La cage à pingouins ["+this.enclosureId+"] a été ajouté à votre zoo !"));
        this.enclosureList.add(enclosure);
    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
