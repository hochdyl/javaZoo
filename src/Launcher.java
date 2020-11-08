import Zoo.Zoo;
import Animals.Species.*;

public class Launcher {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Wolf wolf1 = zoo.addWolf();
        wolf1.makeNoise();
        wolf1.switchAwake();
        wolf1.aboutMe();

        Bear bear1 = zoo.addBear();
        bear1.makeNoise();
        bear1.switchAwake();
        bear1.aboutMe();
    }
}
