package saengnak.siraspon.lab7;

import javax.swing.*;

class AthleteForm extends MySimpleWindow {
    AthleteForm(String title) {
        super(title);
    }

    protected JPanel namePanel, weightPanel, heightPanel, birthdatePanel, genderPanel;
    protected JLabel nameLabel, weightLabel, heightLabel, birthdateLabel, genderLabel;
    protected JTextField nameTextField, weightTextField, heightTextField, birthdateTextField;
    protected ButtonGroup genderButtonGroup;
    protected JRadioButton maleButton, femaleButton;

    protected void addComponents() {
        namePanel = new JPanel();
        nameLabel = new JLabel("Name :");
        nameTextField = new JTextField(15);
        namePanel.add(namePanel);
        namePanel.add(nameTextField);

        this.mainPanel.add(namePanel);
        this.add(mainPanel);
    }

    static void createAndShowGUI() {
        MySimpleWindow athleteForm = new MySimpleWindow("Athlete Form");
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
