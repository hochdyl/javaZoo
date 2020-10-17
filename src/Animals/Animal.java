package Animals;

public class Animal {
    public String type;
    public AnimalGender gender;
    public int weight;
    public int size;
    public int age;
    public int birth[];
    public int hunger = 100;
    public boolean awake = true;
    public AnimalHealth health = AnimalHealth.GOOD;

    public void Eat() {
        int new_hunger = this.hunger + 70;
        if (new_hunger > 100) new_hunger = 100;
        this.hunger = new_hunger;
    }

    public void makeNoise() {
        System.out.println("The " + this.type + " make a noise !");
    }

    public void beHealed() {
        this.health = AnimalHealth.GOOD;
    }

    public void switchAwake() {
        if (this.awake) this.awake = false;
        else this.awake = true;
    }

    public void aboutMe() {
        String info = "============================\n";
        info += "Type of animal: " + this.type + "\n";
        info += "Gender of animal: " + this.gender + "\n";
        if (this.gender == AnimalGender.FEMALE)
        {
            info += "Birth time of animal : " + this.birth[0] + "-" + this.birth[1] + " days\n";
        }
        info += "Weight of animal: " + this.weight + "grams" + "\n";
        info += "Size of animal: " + this.size + "cm" + "\n";
        info += "Hunger status: " + this.hunger + "\n";
        info += "Awake status: " + this.awake + "\n";
        info += "Health status: " + this.health + "\n";
        info += "=============================\n";

        System.out.println(info);
    }

    public String getType() {
        return type;
    }

    public AnimalGender getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public boolean isAwake() {
        return awake;
    }

    public AnimalHealth getHealth() {
        return health;
    }

    public void setHealth(AnimalHealth health) {
        this.health = health;
    }
}
