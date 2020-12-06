import Animals.Animal;
import Helpers.colorHelper;
import Zoo.Zoo;

import java.util.Scanner;

public class Menu {

    public Menu() {}

    public void menuSelection(Zoo zoo) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("Menu principal");
            System.out.println("--------------------");
            System.out.println("1 - Informations sur le zoo");
            System.out.println("2 - Liste des animaux");
            System.out.println("3 - Ajouter un animal");
            System.out.println("4 - Liste des enclos");
            System.out.println("5 - Ajouter un enclos");
            System.out.println("--------------------");
            System.out.print(colorHelper.textCyan("Votre choix : "));

            int value = input.nextInt();

            switch(value) {
                case 1:
                    zooInformationsMenu(input, zoo);
                    break;
                case 2:
                    animalsListMenu(input, zoo);
                    break;
                case 3:
                    addAnimalMenu(input, zoo);
                    break;
                default:
                    System.out.print(colorHelper.textRed("Erreur"));
                    System.out.println();
            }
        }
    }

    public void zooInformationsMenu(Scanner input, Zoo zoo) {
        System.out.println();
        System.out.println("Informations sur le zoo");
        System.out.println("--------------------");
        System.out.println("Nom du zoo : "+zoo.name);
        System.out.println("Employé : "+zoo.employee.name+" ("+zoo.employee.age+" ans)");
        System.out.println("--------------------");
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            System.out.println(colorHelper.textRed("Erreur"));
            System.out.print(colorHelper.textCyan("Votre choix : "));
            value = input.nextInt();
        }
    }

    public void animalsListMenu(Scanner input, Zoo zoo) {
        System.out.println();
        System.out.println("Liste des animaux");
        System.out.println("--------------------");
        if(!zoo.animalList.isEmpty()) {
            for (int i = 0; i < zoo.animalList.size(); i++) {
                Animal animal = zoo.animalList.get(i);
                String line = i+1+" - ["+animal.id+"] "+animal.species;
                if (animal.enclosure != null) {
                    line += " dans "+animal.enclosure.name;
                } else {
                    line += " dans aucun enclos";
                }
                System.out.println(line);
            }
        } else {
            System.out.println("Aucun animaux dans le zoo");
        }
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            if (value-1 >= 0 && value-1 < zoo.animalList.size()) {
                Animal animal = zoo.animalList.get(value-1);
                animalMenu(input, zoo, animal);
            } else {
                System.out.println(colorHelper.textRed("Erreur"));
            }
            System.out.print(colorHelper.textCyan("Votre choix : "));
            value = input.nextInt();
        }
    }

    public void animalMenu(Scanner input, Zoo zoo, Animal animal) {
        System.out.println();
        System.out.println("Menu de l'animal");
        System.out.println("--------------------");
        System.out.println("1 - Informations sur l'animal");
        System.out.println("2 - Supprimer l'animal");
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            switch(value) {
                case 1:
                    zooInformationsMenu(input, zoo);
                    break;
                case 2:
                    animalsListMenu(input, zoo);
                    break;
                default:
                    System.out.print(colorHelper.textRed("Erreur"));
                    System.out.println();
                    value = input.nextInt();
            }
        }
    }

    public void addAnimalMenu(Scanner input, Zoo zoo) {
        System.out.println();
        System.out.println("Ajouter un animal zoo");
        System.out.println("--------------------");
        System.out.println("1 - Ajouter un ours");
        System.out.println("2 - Ajouter un aigle");
        System.out.println("3 - Ajouter un poisson rouge");
        System.out.println("4 - Ajouter un pingouin");
        System.out.println("5 - Ajouter un requin");
        System.out.println("6 - Ajouter un tigre");
        System.out.println("7 - Ajouter une baleine");
        System.out.println("8 - Ajouter un loup");
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            switch(value) {
                case 1:
                    zoo.addBear();
                    value = 0;
                    break;
                case 2:
                    zoo.addEagle();
                    value = 0;
                    break;
                case 3:
                    zoo.addGoldfish();
                    value = 0;
                    break;
                case 4:
                    zoo.addPinguin();
                    value = 0;
                    break;
                case 5:
                    zoo.addShark();
                    value = 0;
                    break;
                case 6:
                    zoo.addTiger();
                    value = 0;
                    break;
                case 7:
                    zoo.addWhale();
                    value = 0;
                    break;
                case 8:
                    zoo.addWolf();
                    value = 0;
                    break;
                default:
                    System.out.print(colorHelper.textRed("Erreur"));
                    System.out.println();
                    value = input.nextInt();
            }
        }
    }
}
