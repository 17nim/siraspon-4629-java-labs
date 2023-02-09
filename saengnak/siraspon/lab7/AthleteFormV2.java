package saengnak.siraspon.lab7;

import javax.swing.*;

class AthleteFormV2 extends AthleteForm {
    AthleteFormV2(String title) {
        super(title);
    }

    protected JLabel nationalityLabel, sportsLabel, bioLabel;
    protected JComboBox<String> nationalityComboBox;
    protected JList<String> sportsList;
    protected String[] sportsArray;
    protected JTextArea bioTextArea;
    protected JScrollPane bioScrollPane;

    void addComponents() {
        super.addComponents();

        nationalityLabel = new JLabel("Nationality :");
        nationalityComboBox = new JComboBox<>();
        nationalityComboBox.addItem("American");
        nationalityComboBox.addItem("Chinese");
        nationalityComboBox.addItem("Indonesian");
        nationalityComboBox.addItem("Japanese");
        nationalityComboBox.addItem("Thai");
        nationalityComboBox.addItem("Vietnamese");
        nationalityComboBox.setSelectedIndex(4);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 5;
        mainPanel.add(nationalityLabel, mainConstrains);
        mainConstrains.gridx = 1;
        mainConstrains.gridy = 5;
        mainPanel.add(nationalityComboBox, mainConstrains);

        sportsLabel = new JLabel("Sport :");
        String[] sportsArray = { "Badminton", "Boxing", "Football", "Running" };
        sportsList = new JList<>(sportsArray);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 6;
        mainPanel.add(sportsLabel, mainConstrains);
        mainConstrains.gridx = 1;
        mainConstrains.gridy = 6;
        mainPanel.add(sportsList, mainConstrains);

        bioLabel = new JLabel("Bio :");
        bioTextArea = new JTextArea(5,0);
        bioTextArea.setLineWrap(true);
        bioTextArea.setWrapStyleWord(true);
        bioScrollPane = new JScrollPane(bioTextArea);
        mainConstrains.gridx = 0;
        mainConstrains.gridy = 7;
        mainPanel.add(bioLabel, mainConstrains);
        mainConstrains.gridy = 8;
        mainConstrains.gridwidth = 2;
        mainPanel.add(bioScrollPane, mainConstrains);
    }

    static void createAndShowGUI() {
        AthleteFormV2 athleteFormV2 = new AthleteFormV2("Athlete Form V2");
        athleteFormV2.addComponents();
        athleteFormV2.setFrameFeatures();
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
 * This program 'AthleteFormV2' is extended from class 'AthleteForm'. It has
 * additional components from previous program: a combo box of nationalities 
 * labelled 'Nationality', a list of sports labelled 'Sport', and a text area 
 * with scroll pane labelled 'Bio'.
 * 
 * This program has overridden the method addComponents() to add more
 * components;
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: February 9, 2023
 */