package saengnak.siraspon.lab10;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;

import saengnak.siraspon.lab5.Athlete.Gender;
import saengnak.siraspon.lab6.*;
import saengnak.siraspon.lab9.*;

public class AthleteFormV11 extends AthleteFormV10 {
    protected AthleteFormV11(String title) {
        super(title);
    }

    protected String birthdate, athleteDisplayMessage, searchAthleteInput;
    protected int athleteCounter;
    protected double weightDouble, heightDouble;
    protected Gender gender;
    protected JMenu dataMenu, sortMenu;
    protected JMenuItem addMenuItem, displayMenuItem, clearMenuItem, searchMenuItem, sortByNameMenuItem, sortByHeightMenuItem, sortByHeightAndWeightMenuItem;
    protected ArrayList<JMenuItem> dataMenuItemsList, sortMenuItemsList;
    protected ArrayList<AthleteV2> athleteInfoList;

    protected void addComponents() {
        super.addComponents();

        athleteInfoList = new ArrayList<>();
    }

    protected void addListeners() {
        super.addListeners();

        addMenuItem.addActionListener(this);
        displayMenuItem.addActionListener(this);
        clearMenuItem.addActionListener(this);
        searchMenuItem.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addMenuItem) {
            addAthlete();
        } else if (e.getSource() == displayMenuItem) {
            displayAthlete();
        } else if (e.getSource() == clearMenuItem) {
            clearAthlete();
        } else if (e.getSource() == searchMenuItem) {
            searchAthlete();
        } else {
            super.actionPerformed(e);
        }
    }

    protected void addMenus() {
        super.addMenus();

        dataMenu = new JMenu("Data");
        menuBar.add(dataMenu);
        dataMenu.setFont(menuFont);

        addMenuItem = new JMenuItem("Add");
        displayMenuItem = new JMenuItem("Display");
        clearMenuItem = new JMenuItem("Clear");
        searchMenuItem = new JMenuItem("Search");

        dataMenuItemsList = new ArrayList<>();
        dataMenuItemsList.add(addMenuItem);
        dataMenuItemsList.add(displayMenuItem);
        dataMenuItemsList.add(clearMenuItem);
        dataMenuItemsList.add(searchMenuItem);

        for (JMenuItem i : dataMenuItemsList) {
            dataMenu.add(i);
            i.setFont(menuFont);
            i.setForeground(menuColor);
        }

        sortMenu = new JMenu("Sort");
        dataMenu.add(sortMenu);
        sortMenu.setFont(menuFont);

        sortByNameMenuItem = new JMenuItem("By Name");
        sortByHeightMenuItem = new JMenuItem("By Height");
        sortByHeightAndWeightMenuItem = new JMenuItem("By Height and Weight");

        sortMenuItemsList = new ArrayList<>();
        sortMenuItemsList.add(sortByNameMenuItem);
        sortMenuItemsList.add(sortByHeightMenuItem);
        sortMenuItemsList.add(sortByHeightAndWeightMenuItem);

        for (JMenuItem i : sortMenuItemsList) {
            sortMenu.add(i);
            i.setFont(menuFont);
            i.setForeground(menuColor);
        }
    }

    protected void addAthlete() {
        getInfo();
        weightDouble = Double.parseDouble(weightString);
        heightDouble = Double.parseDouble(heightString);

        if (genderString.equals("Male")) {
            gender = Gender.MALE;
        } else if (genderString.equals("Female")) {
            gender = Gender.FEMALE;
        } else {
            gender = null;
        }

        athleteInfoList.add(new AthleteV2(nameString, weightDouble, heightDouble, gender, nationalityString, birthdateString));
        JOptionPane.showMessageDialog(null, new AthleteV2(nameString, weightDouble, heightDouble, gender, nationalityString, birthdateString));
    }

    protected void displayAthlete() {
        athleteCounter = athleteInfoList.size();
        athleteDisplayMessage = "";
        if (athleteCounter == 0) {
            JOptionPane.showMessageDialog(null, "There is no athlete in the list.");
        } else if (athleteCounter == 1) {
            athleteDisplayMessage += athleteInfoList.get(0);
            JOptionPane.showMessageDialog(null, "There is one athlete as follows : \n1. " + athleteDisplayMessage);
        } else {
            for (AthleteV2 i : athleteInfoList) {
                athleteDisplayMessage += athleteInfoList.indexOf(i) + 1 + ". " + i + "\n";
            }
            JOptionPane.showMessageDialog(null, "There are " + athleteCounter + " athletes as follows :\n" + athleteDisplayMessage);
        }
    }

    protected void clearAthlete() {
        athleteInfoList.clear();
    }

    protected void searchAthlete() {
        searchAthleteInput = JOptionPane.showInputDialog("Please enter the athlete name : ");
        athleteCounter = athleteInfoList.size();

        if (athleteCounter < 1) {
            JOptionPane.showMessageDialog(null, "Athlete " + searchAthleteInput + " is NOT found.");
        } else {
            for (AthleteV2 i : athleteInfoList) {
                if (searchAthleteInput.equalsIgnoreCase(i.getName())) {
                    JOptionPane.showMessageDialog(null, "Athlete " + i + " is found.");
                } else {
                    JOptionPane.showMessageDialog(null, "Athlete " + searchAthleteInput + " is NOT found.");
                }
            }
        }
    }

    protected static void createAndShowGUI() {
        AthleteFormV11 athleteFormV11 = new AthleteFormV11("Athlete Form V11");
        athleteFormV11.addMenus();
        athleteFormV11.addComponents();
        athleteFormV11.initializeValues();
        athleteFormV11.addListeners();
        athleteFormV11.addShortcuts();
        athleteFormV11.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
