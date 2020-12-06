package Helpers;

public abstract class colorHelper {

    public static String textRed(String text) {
        String colorized = "\033[1;31m"+text+"\033[0m";
        return colorized;
    }

    public static String textYellow(String text) {
        String colorized = "\033[1;33m"+text+"\033[0m";
        return colorized;
    }

    public static String textCyan(String text) {
        String colorized = "\033[1;36m"+text+"\033[0m";
        return colorized;
    }
}
