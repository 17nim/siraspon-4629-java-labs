package saengnak.siraspon.lab6;

import java.util.ArrayList;
import saengnak.siraspon.lab5.Athlete.Gender;

public class WorldAthleteV3 {
    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>();

        BadmintonPlayerV2 axelsen = new BadmintonPlayerV2("Viktor Axelsen", 85, 1.92, Gender.MALE, "Danish",
                "04/01/1994");
        BoxerV2 pacquiao = new BoxerV2("Manny Pacquiao", 66, 1.660, Gender.MALE, "Filipino", "17/12/1978");
        FootballerV2 graham = new FootballerV2("Brandon Graham", 120.2, 1.88, Gender.MALE, "American", "03/04/1988");

        athletes.add(axelsen);
        athletes.add(pacquiao);
        athletes.add(graham);

        for (AthleteV2 athlete : athletes) {
            System.out.println(athlete);
            athlete.practice();
        }
    }
}

/*
 * This program 'WorldAthleteV3' display athletes information that
 * is stored in the superclass 'AthleteV2', and its subclasses.
 * 
 * This program displays athletes names and their practice routines
 * that stored using ArrayList.
 *  
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 25, 2023
 */