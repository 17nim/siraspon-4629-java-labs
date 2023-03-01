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

    protected String name, weight, height, birthdate, gender, hobby, nationality, sport, experience;
    protected ArrayList<JCheckBox> hobbiesList;
    protected Color newTextFieldColor, resetTextFieldColor;
    protected Object sourceObject;

    protected void addComponents() {
        super.addComponents();
        maleButton.setActionCommand("Male");
        femaleButton.setActionCommand("Female");
        hobbiesList = new ArrayList<>(Arrays.asList(hobbiesCheckBox_reading, hobbiesCheckBox_gardening,
                hobbiesCheckBox_watchingMovies, hobbiesCheckBox_shopping, hobbiesCheckBox_others));
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
        name = nameTextField.getText();
        weight = weightTextField.getText();
        height = heightTextField.getText();
        birthdate = birthdateTextField.getText();

        if (genderButtonGroup.getSelection() == null) {
            gender = "";
        } else {
            gender = genderButtonGroup.getSelection().getActionCommand();
        }

        hobby = "";
        for (JCheckBox i : hobbiesList) {
            if (i.isSelected()) {
                hobby += i.getText() + ", ";
            }
        }

        if (hobby.length() >= 2) {
            hobby = hobby.substring(0, hobby.length() - 2);
        }

        nationality = (String) nationalityComboBox.getSelectedItem();
        if (nationality == null) {
            nationality = "";
        }

        sport = sportsList.getSelectedValue();
        if (sport == null) {
            sport = "";
        }

        experience = Integer.toString(experienceYearSlider.getValue());
    }

    protected void handleCancelButton() {
        setTextFieldBackgroundColor(textFieldColor);

        nameTextField.setText("");
        weightTextField.setText("");
        heightTextField.setText("");
        birthdateTextField.setText("");
        genderButtonGroup.clearSelection();
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
        bioTextArea.setText("Name : " + name +
                "\nWeight : " + weight +
                "\nHeight : " + height +
                "\nDate of birth : " + birthdate +
                "\nGender : " + gender +
                "\nHobby : " + hobby +
                "\nNationality : " + nationality +
                "\nSport : " + sport +
                "\nYear(s) of experience : " + experience + "\n");
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
