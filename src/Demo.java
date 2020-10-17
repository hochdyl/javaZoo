import Animals.Types.*;
import Zoo.Zoo;

public class Demo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Wolf wolf1 = zoo.addWolf();
        wolf1.aboutMe();
    }
}
