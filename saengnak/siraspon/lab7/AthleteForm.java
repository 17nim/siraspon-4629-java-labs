package saengnak.siraspon.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteForm extends MySimpleWindow {
    protected AthleteForm(String title) {
        super(title);
    }

    protected JLabel nameLabel, weightLabel, heightLabel, birthdateLabel, genderLabel;
    protected JTextField nameTextField, weightTextField, heightTextField, birthdateTextField;
    protected JPanel genderButtonPanel;
    protected ButtonGroup genderButtonGroup;
    protected JRadioButton maleButton, femaleButton;
    protected GridBagConstraints mainConstrains;

    protected void addComponents() {
        super.addComponents();

        this.add(mainPanel, BorderLayout.NORTH);

        mainPanel.setLayout(new GridBagLayout());
        mainConstrains = new GridBagConstraints();
        mainConstrains.fill = GridBagConstraints.HORIZONTAL;

        nameLabel = new JLabel("Name :");
        nameTextField = new JTextField(15);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 0;
        mainPanel.add(nameLabel, mainConstrains);
        mainConstrains.gridx = 1;
        mainConstrains.gridy = 0;
        mainPanel.add(nameTextField, mainConstrains);

        weightLabel = new JLabel("Weight :");
        weightTextField = new JTextField(15);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 1;
        mainPanel.add(weightLabel, mainConstrains);
        mainConstrains.gridx = 1;
        mainConstrains.gridy = 1;
        mainPanel.add(weightTextField, mainConstrains);

        birthdateLabel = new JLabel("Height :");
        birthdateTextField = new JTextField(15);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 2;
        mainPanel.add(birthdateLabel, mainConstrains);
        mainConstrains.gridx = 1;
        mainConstrains.gridy = 2;
        mainPanel.add(birthdateTextField, mainConstrains);

        heightLabel = new JLabel("Date of birth (dd-mm-yyyy) :");
        heightTextField = new JTextField(15);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 3;
        mainPanel.add(heightLabel, mainConstrains);
        mainConstrains.gridx = 1;
        mainConstrains.gridy = 3;
        mainPanel.add(heightTextField, mainConstrains);

        genderLabel = new JLabel("Gender :");
        genderButtonGroup = new ButtonGroup();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);
        genderButtonPanel = new JPanel();
        genderButtonPanel.add(maleButton);
        genderButtonPanel.add(femaleButton);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 4;
        mainPanel.add(genderLabel, mainConstrains);
        mainConstrains.gridx = 1;
        mainConstrains.gridy = 4;
        mainPanel.add(genderButtonPanel, mainConstrains);
    }

    protected static void createAndShowGUI() {
        AthleteForm athleteForm = new AthleteForm("Athlete Form");
        athleteForm.addComponents();
        athleteForm.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

/*
 * This program 'AthleteForm' is extended from class 'MySimpleWindow'. It shows
 * a window with the title labelled 'AthleteForm', text fields with labels of
 * 'Name', 'Weight', 'Height', 'Date of birth', a radio button group of 'Male'
 * and 'Female' labelled 'Gender', and three non-functional button: 'Cancel',
 * 'Reset', and 'Submit'.
 * 
 * This program has overridden the method addComponents() to add more
 * components;
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: February 9, 2023
 */