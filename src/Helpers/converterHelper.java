package Helpers;

public abstract class converterHelper {

    public static String isCentimeterOrMeter(double value) {
        String result = "centimeters";
        if (value > 100) {
            value /= 100;
            result = "meters";
        }
        result = value+" "+result;
        return result;
    }

    public static String isGramOrKilogram(double value) {
        String result = "grams";
        if (value > 1000) {
            value /= 1000;
            result = "kilograms";
        }
        result = value+" "+result;
        return result;
    }
}
