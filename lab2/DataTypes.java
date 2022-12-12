package saengnak.siraspon.lab2;

public class DataTypes {
    public static void main(String[] args) {
        String name = "Siraspon Saengnak";
        String id = "6530404629";
        char firstLetterOfName = name.charAt(0);
        boolean bool = true;
        int octLastTwoDigits = 035;
        int hexLastTwoDigits = 0x1D;
        long longLastTwoDigits = 29L;
        float lastTwoAndFirstTwo = 29.65f;
        double lastTwoAndCurrentYear = 29.22;
        System.out.println("My name is " + name + ".");
        System.out.println("My student ID is " + id + ".");
        System.out.println(firstLetterOfName + " " + bool + " " + octLastTwoDigits + " " + hexLastTwoDigits);
        System.out.print(longLastTwoDigits + " " + lastTwoAndFirstTwo + " " + lastTwoAndCurrentYear);
    }
}

/**
 * This program 'DataTypes' provides various types of data.
 * 
 * The output format is
 * "My name is <name>.
 * My student ID is <id>.
 * <firstLetterOfName> <bool> <octLastTwoDigits> <hexLastTwoDigits>
 * <longLastTwoDigits> <lastTwoAndFirstTwo> <lastTwoAndCurrentYear>"
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: December 12, 2022
 **/