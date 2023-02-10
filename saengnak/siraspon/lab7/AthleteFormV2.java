package saengnak.siraspon.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV2 extends AthleteForm {
    protected AthleteFormV2(String title) {
        super(title);
    }

    protected JPanel middlePanel, middleTopPanel;
    protected JLabel nationalityLabel, sportsLabel, bioLabel;
    protected JComboBox<String> nationalityComboBox;
    protected JList<String> sportsList;
    protected String[] sportsArray;
    protected JTextArea bioTextArea;
    protected JScrollPane bioScrollPane;
    protected GridBagConstraints middleConstrains;

    protected void addComponents() {
        super.addComponents();

        middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());

        middleTopPanel = new JPanel();
        middleTopPanel.setLayout(new GridBagLayout());
        middleConstrains = new GridBagConstraints();
        middleConstrains.fill = GridBagConstraints.HORIZONTAL;
        middleConstrains.weightx = 1;
        middleConstrains.weighty = 1;

        nationalityLabel = new JLabel("Nationality :");
        nationalityComboBox = new JComboBox<>();
        nationalityComboBox.addItem("American");
        nationalityComboBox.addItem("Chinese");
        nationalityComboBox.addItem("Indonesian");
        nationalityComboBox.addItem("Japanese");
        nationalityComboBox.addItem("Thai");
        nationalityComboBox.addItem("Vietnamese");
        nationalityComboBox.setSelectedIndex(4);
        middleConstrains.gridx = 0;
        middleConstrains.gridy = 0;
        middleTopPanel.add(nationalityLabel, middleConstrains);
        middleConstrains.gridx = 1;
        middleTopPanel.add(nationalityComboBox, middleConstrains);

        sportsLabel = new JLabel("Sport :");
        String[] sportsArray = { "Badminton", "Boxing", "Football", "Running" };
        sportsList = new JList<>(sportsArray);
        sportsList.setSelectedIndex(2);
        middleConstrains.gridx = 0;
        middleConstrains.gridy++;
        middleTopPanel.add(sportsLabel, middleConstrains);
        middleConstrains.gridx = 1;
        middleTopPanel.add(sportsList, middleConstrains);

        bioLabel = new JLabel("Bio :");
        middleConstrains.gridx = 0;
        middleConstrains.gridy++;
        middleTopPanel.add(bioLabel, middleConstrains);

        bioTextArea = new JTextArea(5, 0);
        bioTextArea.setLineWrap(true);
        bioTextArea.setWrapStyleWord(true);
        bioScrollPane = new JScrollPane(bioTextArea);

        middlePanel.add(middleTopPanel, BorderLayout.NORTH);
        middlePanel.add(bioScrollPane, BorderLayout.CENTER);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
    }

    protected static void createAndShowGUI() {
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