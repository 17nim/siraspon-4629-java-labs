/*
 * This class 'HeightComparator' is used in 'AthleteFormV12'.
 * 
 * The class allows the user to sort athlete info in the list by height
 * in ascending order.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: March 17, 2023
 */

package saengnak.siraspon.lab10;

import java.util.Comparator;

import saengnak.siraspon.lab6.*;

public class HeightComparator implements Comparator<AthleteV2> {
    public int compare(AthleteV2 a, AthleteV2 b) {
        double heightDifference = a.getHeight() - b.getHeight();
        
        if (heightDifference < 0) {
            return -1;
        } else if (heightDifference > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}