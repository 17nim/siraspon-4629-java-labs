package saengnak.siraspon.lab6;

import java.util.ArrayList;

public class AFFChampionship extends Competition {
    String teamA, teamB;

    AFFChampionship(String name, String region, String teamA, String teamB) {
        setName(name);
        setRegion(region);
        this.teamA = teamA;
        this.teamB = teamB;
    }

    AFFChampionship(String name, String teamA, String teamB) {
        this(name, null, teamA, teamB);
    }

    public String toString() {
        return name + " in the final round was the game between " + teamA + " vs. " + teamB;
    }

    void setPlaces(ArrayList<String> places) {
        System.out.println(name + " played at these stadiums");
        System.out.println(places);
    }

    void setSponsorship(ArrayList<String> sponsors) {
        if (sponsors.size() > 1) {
            System.out.println("Sponsors of " + name + " are " + sponsors);
        } else {
            System.out.println(sponsors.get(0) + " is a sponsor of " + name);
        }
    }

    void setDescription() {
    };
}

/*
 * This class 'AFFChampionship' is a subclass that is extended from the class
 * 'Competition'. This class includes two additional attributes, teamA and teamB
 * 
 * This program includes an additional method called setPlaces(), which displays
 * the competition name and the location. It also overrides setSponsorship() and
 * setDescription().
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 19, 2023
 */