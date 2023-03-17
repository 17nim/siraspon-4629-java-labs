/*
 * This program 'AthleteFormV13' is extended from 'AthleteFormV12' class.
 * 
 * The program has several additional features from the previous version:
 * checks if user input invalid value or not for weight and height,
 * which have to be number, check if weight is in range of (0, 200],
 * and check if height is in range (0,300].
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: March 17, 2023
 */

package saengnak.siraspon.lab10;

import javax.swing.*;
import java.awt.event.*;

import saengnak.siraspon.lab5.Athlete.Gender;
import saengnak.siraspon.lab6.*;

public class AthleteFormV13 extends AthleteFormV12 {
    protected AthleteFormV13(String title) {
        super(title);
    }

    protected final double MAX_WEIGHT = 200;
    protected final double MAX_HEIGHT = 300;
    protected final String invalidNumberInput = "Please enter a valid number for ";
    protected double parsedValue;
    protected String textFieldName, textFieldValue;

    protected void addComponents() {
        super.addComponents();

        weightTextField.setName("Weight");
        heightTextField.setName("Height");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == weightTextField) {
            notifyTextFieldChange(weightTextField);
            if (!(weightDouble == -1)) {
                JOptionPane.showMessageDialog(null, "Weight is changed to '" + weightDouble + "'");
            }
        } else if (e.getSource() == heightTextField) {
            notifyTextFieldChange(heightTextField);
            if (!(heightDouble == -1)) {
                JOptionPane.showMessageDialog(null, "Height is changed to '" + heightDouble + "'");
            }
        } else if (e.getSource() == addMenuItem) {
            addAthlete();
        } else {
            super.actionPerformed(e);
        }
    }

    protected void notifyTextFieldChange(JTextField textField) {
        textFieldName = textField.getName();
        textFieldValue = textField.getText();

        if (textField == weightTextField) {
            weightDouble = getValidValue(textFieldName, textFieldValue, MAX_WEIGHT);
        } else if (textField == heightTextField) {
            heightDouble = getValidValue(textFieldName, textFieldValue, MAX_HEIGHT);
        }
    }

    protected double getValidValue(String textFieldName, String textFieldValue, double maximumValue) {
        try {
            parsedValue = Double.parseDouble(textFieldValue);

            if (parsedValue <= 0) {
                JOptionPane.showMessageDialog(null, textFieldName + " should be greater than 0.");
                return -1;
            } else if (parsedValue > maximumValue) {
                JOptionPane.showMessageDialog(null, textFieldName + " should be lower than " + maximumValue);
                return -1;
            } else {
                return parsedValue;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for '" + textFieldName + "'");
            return -1;
        }
    }

    protected void addAthlete() {
        getInfo();

        weightDouble = getValidValue(weightTextField.getName(), weightTextField.getText(), MAX_WEIGHT);
        if (weightDouble == -1) {
            return;
        }

        heightDouble = getValidValue(heightTextField.getName(), heightTextField.getText(), MAX_HEIGHT);
        if (heightDouble == -1) {
            return;
        }

        if (genderString.equals("Male")) {
            gender = Gender.MALE;
        } else if (genderString.equals("Female")) {
            gender = Gender.FEMALE;
        } else {
            gender = null;
        }

        athleteInfoList
                .add(new AthleteV2(nameString, weightDouble, heightDouble, gender, nationalityString, birthdateString));
        JOptionPane.showMessageDialog(null,
                new AthleteV2(nameString, weightDouble, heightDouble, gender, nationalityString, birthdateString));
    }

    protected static void createAndShowGUI() {
        AthleteFormV13 athleteFormV13 = new AthleteFormV13("Athlete Form V13");
        athleteFormV13.addMenus();
        athleteFormV13.addComponents();
        athleteFormV13.initializeValues();
        athleteFormV13.addListeners();
        athleteFormV13.addShortcuts();
        athleteFormV13.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
