package saengnak.siraspon.lab6;

import java.util.ArrayList;

public class InterestingCompetitions {
    public static void main(String[] args) {
        AFFChampionship aff2022 = new AFFChampionship("AFF 2022", "Thailand", "Vietnam");
        AFFChampionship aff2020 = new AFFChampionship("AFF 2020", "Thailand", "Indonesia");
        System.out.println(aff2020);
        System.out.println(aff2022);

        ArrayList<String> places = new ArrayList<String>();
        places.add("Hanoi");
        places.add("Bangkok");
        aff2022.setPlaces(places);

        ArrayList<String> sponsors = new ArrayList<String>();
        sponsors.add("Mitsubishi Electronics");
        aff2022.setSponsorship(sponsors);

        places.remove("Hanoi");
        places.add("Kallang");
        aff2020.setPlaces(places);

        sponsors.remove("Mitsubishi Electronics");
        sponsors.add("Suzuki");
        sponsors.add("Yanmar");
        aff2020.setSponsorship(sponsors);
    }
}

/*
 * This program 'InterestingCompetitions' display various information that is
 * stored in the superclass 'Competition', and its subclass 'AFFChampionship'.
 * 
 * This program displays competitions names, locations, and sponsors.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 25, 2023
 */