import Zoo.Zoo;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("JavaZoo - Lancement");
        Zoo zoo = new Zoo();
        Menu menu = new Menu();

        menu.menuSelection(zoo);
    }
}
