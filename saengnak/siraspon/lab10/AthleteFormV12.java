/*
 * This program 'AthleteFormV12' is extended from 'AthleteFormV11' class.
 * 
 * The program has an additional feature from the previous version:
 * sorting athlete info in the list by name, height, and height and weight
 * using comparator classes for each sorting types.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: March 17, 2023
 */

package saengnak.siraspon.lab10;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class AthleteFormV12 extends AthleteFormV11 {
    protected AthleteFormV12(String title) {
        super(title);
    }

    protected void addListeners() {
        super.addListeners();

        sortByNameMenuItem.addActionListener(this);
        sortByHeightMenuItem.addActionListener(this);
        sortByHeightAndWeightMenuItem.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sortByNameMenuItem) {
            sortByName();
        } else if (e.getSource() == sortByHeightMenuItem) {
            sortByHeight();
        } else if (e.getSource() == sortByHeightAndWeightMenuItem) {
            sortByHeightAndWeight();
        } else {
            super.actionPerformed(e);
        }
    }

    protected void sortByName() {
        Collections.sort(athleteInfoList, new NameComparator());
        displayAthlete();
    }

    protected void sortByHeight() {
        Collections.sort(athleteInfoList, new HeightComparator());
        displayAthlete();
    }

    protected void sortByHeightAndWeight() {
        Collections.sort(athleteInfoList, new HeightWeightComparator());
        displayAthlete();
    }

    protected static void createAndShowGUI() {
        AthleteFormV12 athleteFormV12 = new AthleteFormV12("Athlete Form V12");
        athleteFormV12.addMenus();
        athleteFormV12.addComponents();
        athleteFormV12.initializeValues();
        athleteFormV12.addListeners();
        athleteFormV12.addShortcuts();
        athleteFormV12.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
