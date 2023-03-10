/*
 * This program 'AthleteFormV8' is extended from 'AthleteFormV6' class and implements the ActionListener interface.
 * The program includes various Swing components that are used in methods that handle 'Cancel', 'Reset', and 'Submit' buttons.
 * The program has overridden the method addComponents() for adding more components.
 * The program uses ArrayList to store lists of hobbies and sports.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: March 10, 2023
 */

package saengnak.siraspon.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import saengnak.siraspon.lab8.*;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    protected AthleteFormV8(String title) {
        super(title);
    }

    protected String nameString, weightString, heightString, birthdateString, genderString, hobbyString,
            nationalityString, sportString, experienceString;
    protected ArrayList<JCheckBox> hobbiesList;
    protected ArrayList<String> sportsArrayList;
    protected Color newTextFieldColor, resetTextFieldColor;
    protected Object sourceObject;

    protected void addComponents() {
        super.addComponents();

        maleButton.setActionCommand("Male");
        femaleButton.setActionCommand("Female");
        hobbiesList = new ArrayList<>(Arrays.asList(hobbiesCheckBox_reading, hobbiesCheckBox_gardening,
                hobbiesCheckBox_watchingMovies, hobbiesCheckBox_shopping, hobbiesCheckBox_others));
        sportsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    protected void addListeners() {
        cancelButton.addActionListener(this);
        resetButton.addActionListener(this);
        submitButton.addActionListener(this);
    }

    protected void setTextFieldBackgroundColor(Color c) {
        nameTextField.setBackground(c);
        weightTextField.setBackground(c);
        heightTextField.setBackground(c);
        birthdateTextField.setBackground(c);
    }

    protected void initializeValues() {
        newTextFieldColor = new Color(255, 253, 175);
        setTextFieldBackgroundColor(newTextFieldColor);

        nameTextField.setText("Siraspon");
        weightTextField.setText("61");
        heightTextField.setText("180");
        birthdateTextField.setText("09/10/2003");
        maleButton.setSelected(true);
        experienceYearSlider.setValue(10);
    }

    protected void getInfo() {
        nameString = nameTextField.getText();
        weightString = weightTextField.getText();
        heightString = heightTextField.getText();
        birthdateString = birthdateTextField.getText();

        if (genderButtonGroup.getSelection() == null) {
            genderString = "";
        } else {
            genderString = genderButtonGroup.getSelection().getActionCommand();
        }

        hobbyString = "";
        for (JCheckBox i : hobbiesList) {
            if (i.isSelected()) {
                hobbyString += i.getText() + ", ";
            }
        }

        if (hobbyString.length() >= 2) {
            hobbyString = hobbyString.substring(0, hobbyString.length() - 2);
        }

        nationalityString = (String) nationalityComboBox.getSelectedItem();
        if (nationalityString == null) {
            nationalityString = "";
        }

        sportString = "";
        sportsArrayList = new ArrayList<>(sportsList.getSelectedValuesList());
        for (String i : sportsArrayList) {
            sportString += i + ", ";
        }

        if (sportString.length() >= 2) {
            sportString = sportString.substring(0, sportString.length() - 2);
        }

        experienceString = Integer.toString(experienceYearSlider.getValue());
    }

    protected void handleCancelButton() {
        setTextFieldBackgroundColor(textFieldColor);

        nameTextField.setText("");
        weightTextField.setText("");
        heightTextField.setText("");
        birthdateTextField.setText("");
        genderButtonGroup.clearSelection();

        for (JCheckBox i : hobbiesList) {
            if (i == hobbiesCheckBox_watchingMovies) {
                i.setSelected(true);
            } else {
                i.setSelected(false);
            }
        }

        nationalityComboBox.setSelectedIndex(4);
        sportsList.setSelectedIndex(2);
        experienceYearSlider.setValue(0);
        bioTextArea.setText("");
    }

    protected void handleResetButton() {
        handleCancelButton();
        setTextFieldBackgroundColor(Color.WHITE);

        for (JCheckBox i : hobbiesList) {
            i.setSelected(false);
        }

        nationalityComboBox.setSelectedIndex(-1);
        sportsList.clearSelection();
    }

    protected void handleSubmitButton() {
        getInfo();
        bioTextArea.setText("Name : " + nameString +
                "\nWeight : " + weightString +
                "\nHeight : " + heightString +
                "\nDate of birth : " + birthdateString +
                "\nGender : " + genderString +
                "\nHobby : " + hobbyString +
                "\nNationality : " + nationalityString +
                "\nSport : " + sportString +
                "\nYear(s) of experience : " + experienceString + "\n");
        bioTextArea.select(0, 0);
    }

    public void actionPerformed(ActionEvent e) {
        sourceObject = e.getSource();

        if (sourceObject == cancelButton) {
            handleCancelButton();
        }
        if (sourceObject == resetButton) {
            handleResetButton();
        }
        if (sourceObject == submitButton) {
            handleSubmitButton();
        }
    }

    protected static void createAndShowGUI() {
        AthleteFormV8 athleteFormV8 = new AthleteFormV8("Athlete Form V8");
        athleteFormV8.addMenus();
        athleteFormV8.addComponents();
        athleteFormV8.addListeners();
        athleteFormV8.initializeValues();
        athleteFormV8.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
