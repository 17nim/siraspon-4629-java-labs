package saengnak.siraspon.lab7;

import javax.swing.*;
import java.awt.*;

class AthleteForm extends MySimpleWindow {
    AthleteForm(String title) {
        super(title);
    }

    protected JLabel nameLabel, weightLabel, heightLabel, birthdateLabel, genderLabel;
    protected JTextField nameTextField, weightTextField, heightTextField, birthdateTextField;
    protected JPanel genderButtonPanel;
    protected ButtonGroup genderButtonGroup;
    protected JRadioButton maleButton, femaleButton;

    void addComponents() {
        super.addComponents();

        mainPanel.setLayout(new GridLayout(0, 2));

        nameLabel = new JLabel("Name :");
        nameTextField = new JTextField(15);
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);

        weightLabel = new JLabel("Weight :");
        weightTextField = new JTextField(15);
        mainPanel.add(weightLabel);
        mainPanel.add(weightTextField);
        
        birthdateLabel = new JLabel("Height :");
        birthdateTextField = new JTextField(15);
        mainPanel.add(birthdateLabel);
        mainPanel.add(birthdateTextField);
        
        heightLabel = new JLabel("Date of birth (dd-mm-yyyy) :");
        heightTextField = new JTextField(15);
        mainPanel.add(heightLabel);
        mainPanel.add(heightTextField);

        genderLabel = new JLabel("Gender :");
        genderButtonGroup = new ButtonGroup();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);
        genderButtonPanel = new JPanel();
        genderButtonPanel.add(maleButton);
        genderButtonPanel.add(femaleButton);
        mainPanel.add(genderLabel);
        mainPanel.add(genderButtonPanel);

        this.add(mainPanel, BorderLayout.NORTH);
    }

    static void createAndShowGUI() {
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
