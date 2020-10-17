package Animals;

import Helpers.randomHelper;

public enum AnimalGender {
    MALE,
    FEMALE;

    public static AnimalGender random() {
        AnimalGender randomGender = randomHelper.randomEnum(AnimalGender.class);
        return randomGender;
    }
}
