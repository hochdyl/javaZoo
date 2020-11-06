package Helpers;

import java.security.SecureRandom;

public abstract class randomHelper {

    public static <T extends Enum<?>> T randomEnum(Class<T> c){
        SecureRandom r = new SecureRandom();
        int x = r.nextInt(c.getEnumConstants().length);
        return c.getEnumConstants()[x];
    }

    public static int randomNumber(int minRange, int maxRange) {
        SecureRandom r = new SecureRandom();
        int x = r.nextInt(maxRange-minRange)+minRange;
        return x;
    }
}
