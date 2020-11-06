import Zoo.Zoo;
import Animals.Reproduction.Species.*;

public class Launcher {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Wolf wolf1 = zoo.addWolf();
        wolf1.makeNoise();
        wolf1.switchAwake();
        wolf1.carryPregnancy();
        wolf1.aboutMe();
    }
}
