package Animals;

public class Animal {
    public String type;
    public AnimalGender gender;
    public int weight;
    public int size;
    public int age;
    public int hunger = 100;
    public int sleep = 100;
    public AnimalHealth health = AnimalHealth.GOOD;

    public Animal() { }

    public void aboutMe() {
        String info = "";
        info += "Type of animal: " + this.type + "\n";
        info += "Gender of animal: " + this.gender + "\n";
        info += "Weight of animal: " + this.weight + "grams" + "\n";
        info += "Size of animal: " + this.size + "cm" + "\n";
        info += "Hunger status: " + this.hunger + "\n";
        info += "Sleep status: " + this.sleep + "\n";
        info += "Health status: " + this.health + "\n";

        System.out.println(info);
    }

    public void setGender(AnimalGender gender) {
        this.gender = gender;
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

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public AnimalHealth getHealth() {
        return health;
    }

    public void setHealth(AnimalHealth health) {
        this.health = health;
    }
}
