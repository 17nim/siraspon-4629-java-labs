package saengnak.siraspon.lab6;

import java.util.ArrayList;
import saengnak.siraspon.lab5.Athlete.Gender;

public class WorldAthleteV4 {
    public static void main(String[] args) {
        BadmintonPlayerV3 axelsen = new BadmintonPlayerV3("Viktor Axelsen", 85, 1.92, Gender.MALE, "Danish",
                "04/01/1994");
        BadmintonPlayerV3 kento = new BadmintonPlayerV3("Kento Momota", 68, 1.75, Gender.MALE, "Japanese",
                "01/09/1994");

        axelsen.setWorldRanking(1);
        kento.setWorldRanking(19);
        axelsen.setSpeed(4);
        kento.setSpeed(6);

        ArrayList<BadmintonPlayerV3> badmintonPlayers = new ArrayList<BadmintonPlayerV3>();
        badmintonPlayers.add(axelsen);
        badmintonPlayers.add(kento);

        for (BadmintonPlayerV3 badmintonPlayer : badmintonPlayers) {
            System.out.println(badmintonPlayer);
        }
    }
}

/*
 * This program 'WorldAthleteV4' display various information that is
 * stored in the class 'BadmintonPlayerV3', and its interfaces.
 * 
 * This program displays various attributes of a Badminton player
 * that is stored in an ArrayList.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 25, 2023
 */