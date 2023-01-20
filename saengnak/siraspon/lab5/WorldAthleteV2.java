package saengnak.siraspon.lab5;

import saengnak.siraspon.lab5.Athlete.Gender;

public class WorldAthleteV2 {
    static boolean isTaller(Athlete athleteA, Athlete athleteB) {
        return athleteA.getHeight() > athleteB.getHeight();
    }

    public static void main(String[] args) {
        BadmintonPlayer axelsen = new BadmintonPlayer("Viktor Axelsen", 85, 1.92, Gender.MALE, "Danish", "04/01/1994",
                647, 1);
        Boxer pacquiao = new Boxer("Manny Pacquiao", 66, 1.660, Gender.MALE, "Filipino", "17/12/1978", "Welterweight",
                "M");
        Footballer graham = new Footballer("Brandon Graham", 120.2, 1.88, Gender.MALE, "American", "03/04/1988",
                "Defensive End", "Philadelphia Eagles");

        System.out.println(axelsen);
        System.out.println(pacquiao);
        System.out.println(graham);

        BadmintonPlayer sungjihyun = new BadmintonPlayer("Sung Ji-Hyun", 64, 1.72, Gender.FEMALE, "Korean",
                "03/01/1989", 675, 17);
        System.out.println("Both " + axelsen.getName() + " and " + sungjihyun.getName() + " play Badminton.");

        axelsen.compareAge(pacquiao);
        axelsen.compareAge(graham);

        if (isTaller(pacquiao, graham)) {
            System.out.println(pacquiao.getName() + " is taller than " + graham.getName() + ".");
        } else {
            System.out.println(pacquiao.getName() + " is not taller than " + graham.getName() + ".");
        }
    }
}

/*
 * This program 'WorldAthleteV2' display athletes information that
 * is stored in the superclass 'Athlete', and its subclasses.
 * 
 * This program includes an additional method called isTaller(),
 * which compares the heights between athleteA and athleteB,
 * and returns a boolean determined by whether athleteA's height
 * is more than athleteB's or not.
 *  
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 19, 2023
 */