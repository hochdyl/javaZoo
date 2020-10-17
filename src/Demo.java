import Zoo.Zoo;
import Animals.Reproduction.Species.*;

public class Demo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Wolf wolf1 = zoo.addWolf();
        wolf1.makeNoise();
        wolf1.switchAwake();
        wolf1.getBirth_type();
        wolf1.aboutMe();
    }
}
