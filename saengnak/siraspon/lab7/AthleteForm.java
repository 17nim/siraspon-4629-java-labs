package saengnak.siraspon.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteForm extends MySimpleWindow {
    protected AthleteForm(String title) {
        super(title);
    }

    protected JLabel nameLabel, weightLabel, heightLabel, birthdateLabel, genderLabel;
    protected JTextField nameTextField, weightTextField, heightTextField, birthdateTextField;
    protected JPanel topPanel, genderButtonPanel;
    protected ButtonGroup genderButtonGroup;
    protected JRadioButton maleButton, femaleButton;
    protected GridBagConstraints topConstrains;

    protected void addComponents() {
        super.addComponents();

        topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        topConstrains = new GridBagConstraints();
        topConstrains.fill = GridBagConstraints.HORIZONTAL;
        topConstrains.weightx = 1;
        topConstrains.weighty = 1;

        nameLabel = new JLabel("Name :");
        nameTextField = new JTextField(15);
        topConstrains.gridx = 0;
        topConstrains.gridy = 0;
        topPanel.add(nameLabel, topConstrains);
        topConstrains.gridx = 1;
        topPanel.add(nameTextField, topConstrains);

        weightLabel = new JLabel("Weight :");
        weightTextField = new JTextField(15);
        topConstrains.gridx = 0;
        topConstrains.gridy++;
        topPanel.add(weightLabel, topConstrains);
        topConstrains.gridx = 1;
        topPanel.add(weightTextField, topConstrains);

        heightLabel = new JLabel("Height :");
        heightTextField = new JTextField(15);
        topConstrains.gridx = 0;
        topConstrains.gridy++;
        topPanel.add(heightLabel, topConstrains);
        topConstrains.gridx = 1;
        topPanel.add(heightTextField, topConstrains);

        birthdateLabel = new JLabel("Date of birth (dd-mm-yyyy) :");
        birthdateTextField = new JTextField(15);
        topConstrains.gridx = 0;
        topConstrains.gridy++;
        topPanel.add(birthdateLabel, topConstrains);
        topConstrains.gridx = 1;
        topPanel.add(birthdateTextField, topConstrains);

        genderLabel = new JLabel("Gender :");
        genderButtonGroup = new ButtonGroup();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);
        genderButtonPanel = new JPanel();
        genderButtonPanel.add(maleButton);
        genderButtonPanel.add(femaleButton);
        topConstrains.gridx = 0;
        topConstrains.gridy++;
        topPanel.add(genderLabel, topConstrains);
        topConstrains.gridx = 1;
        topPanel.add(genderButtonPanel, topConstrains);

        mainPanel.add(topPanel, BorderLayout.NORTH);
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