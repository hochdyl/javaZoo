import Animals.Animal;
import Enclosures.Enclosure;
import Helpers.colorHelper;
import Zoo.Zoo;

import java.util.ArrayList;
import java.util.List;
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
                case 4:
                    enclosuresListMenu(input, zoo);
                    break;
                case 5:
                    addEnclosureMenu(input, zoo);
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
        System.out.println("Nombre d'animaux dans le zoo : "+zoo.animalList.size());
        System.out.println("Nombre d'enclos dans le zoo : "+zoo.enclosureList.size());
        System.out.println("Maximum d'enclos : "+zoo.maxEnclosures);
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
            value = input.nextInt();
        }
    }

    public void animalMenu(Scanner input, Zoo zoo, Animal animal) {
        System.out.println();
        System.out.println("Menu de l'animal");
        System.out.println("--------------------");
        System.out.println("1 - Informations sur l'animal");
        System.out.println("2 - Soigner l'animal");
        System.out.println("3 - Endormir/Reveiller l'animal");
        System.out.println("4 - Emettre un son de l'animal");
        System.out.println("5 - Supprimer l'animal");
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            switch(value) {
                case 1:
                    animal.aboutMe();
                    value = 0;
                    break;
                case 2:
                    animal.beHealed();
                    value = 0;
                    break;
                case 3:
                    animal.switchAwake();
                    value = 0;
                    break;
                case 4:
                    animal.makeNoise();
                    value = 0;
                    break;
                case 5:
                    if (animal.enclosure != null) {
                        animal.enclosure.animalList.remove(animal);
                    }
                    zoo.animalList.remove(animal);
                    System.out.println(colorHelper.textYellow("L'animal a été supprimé"));
                    value = 0;
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

    public void enclosuresListMenu(Scanner input, Zoo zoo) {
        System.out.println();
        System.out.println("Liste des enclos");
        System.out.println("--------------------");
        if(!zoo.enclosureList.isEmpty()) {
            for (int i = 0; i < zoo.enclosureList.size(); i++) {
                Enclosure enclosure = zoo.enclosureList.get(i);
                String line = i+1+" - ["+enclosure.id+"] "+enclosure.name;
                if (enclosure.animalList.isEmpty()) {
                    line += " contient "+enclosure.animalList.size()+ "/"+enclosure.maxAnimals+" animau(x)";
                } else {
                    line += " contient 0/"+enclosure.maxAnimals+"animaux";
                }
                System.out.println(line);
            }
        } else {
            System.out.println("Aucun enclos dans le zoo");
        }
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            if (value-1 >= 0 && value-1 < zoo.enclosureList.size()) {
                Enclosure enclosure = zoo.enclosureList.get(value-1);
                enclosureMenu(input, zoo, enclosure);
            } else {
                System.out.println(colorHelper.textRed("Erreur"));
            }
            System.out.println();
            System.out.println("Liste des enclos");
            System.out.println("--------------------");
            if(!zoo.enclosureList.isEmpty()) {
                for (int i = 0; i < zoo.enclosureList.size(); i++) {
                    Enclosure enclosure = zoo.enclosureList.get(i);
                    String line = i+1+" - ["+enclosure.id+"] "+enclosure.name;
                    if (enclosure.animalList.isEmpty()) {
                        line += " contient "+enclosure.animalList.size()+ "/"+enclosure.maxAnimals+" animau(x)";
                    } else {
                        line += " contient 0/"+enclosure.maxAnimals+"animaux";
                    }
                    System.out.println(line);
                }
            } else {
                System.out.println("Aucun enclos dans le zoo");
            }
            System.out.println("0 - Sortir");
            System.out.println("--------------------");
            System.out.print(colorHelper.textCyan("Votre choix : "));
            value = input.nextInt();
        }
    }

    public void enclosureMenu(Scanner input, Zoo zoo, Enclosure enclosure) {
        System.out.println();
        System.out.println("Menu de l'enclos ("+enclosure.animalList.size()+"/"+enclosure.maxAnimals+")");
        System.out.println("--------------------");
        System.out.println("1 - Informations sur l'enclos");
        System.out.println("2 - Ajouter un animal dans l'enclos");
        System.out.println("3 - Retirer un animal dans l'enclos");
        System.out.println("4 - Nourrir les animaux de l'enclos");
        System.out.println("5 - Maintenance de l'enclos");
        System.out.println("6 - Supprimer l'enclos");
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            switch(value) {
                case 1:
                    enclosure.aboutMe();
                    value = 0;
                    break;
                case 2:
                    addAnimalToEnclosureMenu(input, zoo, enclosure);
                    value = 0;
                    break;
                case 3:
                    removeAnimalToEnclosureMenu(input, zoo, enclosure);
                    value = 0;
                    break;
                case 4:
                    enclosure.feed();
                    value = 0;
                    break;
                case 5:
                    enclosure.maintains();
                    value = 0;
                    break;
                case 6:
                    if (enclosure.animalList.isEmpty()) {
                        zoo.enclosureList.remove(enclosure);
                        System.out.println(colorHelper.textYellow("L'enclos a été supprimé"));
                    } else {
                        System.out.print(colorHelper.textRed("L'enclos n'est pas vide"));
                    }
                    value = 0;
                    break;
                default:
                    System.out.print(colorHelper.textRed("Erreur"));
                    System.out.println();
                    value = input.nextInt();
            }
        }
    }

    public void addAnimalToEnclosureMenu(Scanner input, Zoo zoo, Enclosure enclosure) {
        List<Animal> animalsList = new ArrayList<>();

        System.out.println();
        System.out.println("Liste des animaux ajoutables ("+enclosure.animalList.size()+"/"+enclosure.maxAnimals+")");
        System.out.println("--------------------");
        if(!zoo.animalList.isEmpty()) {
            for (int i = 0; i < zoo.animalList.size(); i++) {
                Animal animal = zoo.animalList.get(i);
                if (animal.enclosure == null) {
                    animalsList.add(animal);
                }
            }
            if (!animalsList.isEmpty()) {
                for (int i = 0; i < animalsList.size(); i++) {
                    Animal animal = animalsList.get(i);
                    System.out.println(i+1+" - ["+animal.id+"] "+animal.species);
                }
            } else {
                System.out.println("Aucun animaux ajoutable");
            }
        } else {
            System.out.println("Aucun animaux dans le zoo");
        }
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            if (value-1 >= 0 && value-1 < animalsList.size()) {
                Animal animal = zoo.animalList.get(value-1);
                value = 0;
                /*
                    Impossible d'ajouter un animal a un enclos avec mon code car
                    je n'ai pas de méthodes add dans la classe parent Enclosure.
                 */
            } else {
                System.out.println(colorHelper.textRed("Erreur"));
            }
        }
    }

    public void removeAnimalToEnclosureMenu(Scanner input, Zoo zoo, Enclosure enclosure) {
        System.out.println();
        System.out.println("Liste des animaux de l'enclos ("+enclosure.animalList.size()+"/"+enclosure.maxAnimals+")");
        System.out.println("--------------------");
        if(!zoo.animalList.isEmpty()) {
            if (!enclosure.animalList.isEmpty()) {
                for (int i = 0; i < enclosure.animalList.size(); i++) {
                    Animal animal = enclosure.animalList.get(i);
                    System.out.println(i+1+" - ["+animal.id+"] "+animal.species);
                }
            } else {
                System.out.println("Aucun animaux dans l'enclos");
            }
        } else {
            System.out.println("Aucun animaux dans le zoo");
        }
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            if (value-1 >= 0 && value-1 < enclosure.animalList.size()) {
                Animal animal = enclosure.animalList.get(value-1);
                enclosure.animalList.remove(animal);
                System.out.println(colorHelper.textYellow("L'animal a été retirer de cet enclos"));
                value = 0;
            } else {
                System.out.println(colorHelper.textRed("Erreur"));
            }
        }
    }

    public void addEnclosureMenu(Scanner input, Zoo zoo) {
        String name;
        int area;
        int height;

        System.out.println();
        System.out.println("Ajouter un animal zoo");
        System.out.println("--------------------");
        System.out.println("1 - Ajouter un enclos à ours");
        System.out.println("2 - Ajouter une cage à aigle");
        System.out.println("3 - Ajouter un aquarium à poisson rouge");
        System.out.println("4 - Ajouter une cage à pingouin");
        System.out.println("5 - Ajouter un aquarium à requin");
        System.out.println("6 - Ajouter un enclos à tigre");
        System.out.println("7 - Ajouter un aquarium à baleine");
        System.out.println("8 - Ajouter un enclos à loup");
        System.out.println("0 - Sortir");
        System.out.println("--------------------");
        System.out.print(colorHelper.textCyan("Votre choix : "));
        int value = input.nextInt();
        while (value != 0) {
            switch(value) {
                case 1:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    zoo.addBearEnclosure(name, area);
                    value = 0;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    System.out.println();
                    System.out.println("Enfin, quelle hauteur fait t-il (en m)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    height = input.nextInt();
                    zoo.addEagleEnclosure(name, area, height);
                    value = 0;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    zoo.addGoldfishEnclosure(name, area);
                    value = 0;
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    System.out.println();
                    System.out.println("Enfin, quelle hauteur fait t-il (en m)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    height = input.nextInt();
                    zoo.addPinguinEnclosure(name, area, height);
                    value = 0;
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    zoo.addSharkEnclosure(name, area);
                    value = 0;
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    zoo.addTigerEnclosure(name, area);
                    value = 0;
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    zoo.addWhaleEnclosure(name, area);
                    value = 0;
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Nom de votre nouvel enclos");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    name = input.next();
                    System.out.println();
                    System.out.println("Super, quelle surface fait t-il (en m²)");
                    System.out.print(colorHelper.textCyan("Votre choix : "));
                    area = input.nextInt();
                    zoo.addWolfEnclosure(name, area);
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
