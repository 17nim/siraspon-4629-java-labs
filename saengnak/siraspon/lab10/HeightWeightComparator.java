package saengnak.siraspon.lab10;

import java.util.Comparator;

import saengnak.siraspon.lab6.*;

public class HeightWeightComparator implements Comparator<AthleteV2> {
    public int compare(AthleteV2 a, AthleteV2 b) {
        double heightDifference = a.getHeight() - b.getHeight();
        double weightDifference = a.getWeight() - b.getWeight();

        if (heightDifference < 0) {
            return -1;
        } else if (heightDifference > 0) {
            return 1;
        } else {
            if (weightDifference < 0) {
                return -1;
            } else if (weightDifference > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
