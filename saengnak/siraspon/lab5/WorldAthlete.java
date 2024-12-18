package saengnak.siraspon.lab5;

import saengnak.siraspon.lab5.Athlete.Gender;

public class WorldAthlete {
    public static void main(String[] args) {
        Athlete kento = new Athlete("Kento Momota", 68, 1.75, Gender.MALE, "Japanese", "01/09/1994");
        System.out.println(kento.getName() + "'s height is " + kento.getHeight() + " m.");
        kento.setHeight(1.7526);
        System.out.println(kento.getName() + "'s height has increased to " + kento.getHeight() + " m.");
        System.out.println(kento);

        Athlete axelsen = new Athlete("Viktor Axelsen", 85, 1.92, Gender.MALE, "Danish", "04/01/1994");
        System.out.println(axelsen);

        Athlete sungjihyun = new Athlete("Sung Ji-Hyun", 64, 1.72, Gender.FEMALE, "Korean", "03/01/1989");
        System.out.println(sungjihyun);

        axelsen.compareAge(sungjihyun);
        kento.compareAge(axelsen);
        sungjihyun.compareAge(kento);
    }
}

/*
 * This program 'WorldAthlete' display athletes information that
 * is stored in class 'Athlete', which contains attributes for each object
 * of the class. The class also has setter and getter methods for each
 * attributes, and compareAge() method for comparing ages of two athletes
 * using attributes of their birthdate. This class has an enum called Gender,
 * that contains two types of gender for the athletes, MALE and FEMALE.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 19, 2023
 */