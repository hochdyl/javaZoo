import Zoo.Zoo;
import Animals.Species.*;

public class Launcher {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Wolf wolf1 = zoo.addWolf();
        wolf1.makeNoise();
        wolf1.wander();
        wolf1.switchAwake();
        wolf1.aboutMe();

        Wolf wolf2 = zoo.addWolf();
        wolf2.makeNoise();
        wolf2.wander();
        wolf2.switchAwake();
        wolf2.aboutMe();
    }
}
