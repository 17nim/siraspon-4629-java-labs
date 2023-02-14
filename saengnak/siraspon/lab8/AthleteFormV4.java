package saengnak.siraspon.lab8;

import javax.swing.*;
import java.awt.*;
import saengnak.siraspon.lab7.*;

public class AthleteFormV4 extends AthleteFormV3 {
    protected AthleteFormV4(String title) {
        super(title);
    }

    protected JPanel hobbiesPanel, middleBottomPanel;
    protected JLabel hobbiesLabel, experienceYearLabel;
    protected JCheckBox hobbiesCheckBox_reading, hobbiesCheckBox_gardening, hobbiesCheckBox_watchingMovies, hobbiesCheckBox_shopping, hobbiesCheckBox_others;
    protected JSlider experienceYearSlider;

    protected void addComponents() {
        super.addComponents();

        hobbiesLabel = new JLabel("Hobbies :");
        topConstrains.gridwidth = 0;
        topConstrains.gridx = 0;
        topConstrains.gridy++;
        topPanel.add(hobbiesLabel, topConstrains);

        hobbiesCheckBox_reading = new JCheckBox("Reading");
        hobbiesCheckBox_gardening = new JCheckBox("Gardening");
        hobbiesCheckBox_watchingMovies = new JCheckBox("Watching movies", true);
        hobbiesCheckBox_shopping = new JCheckBox("Shopping");
        hobbiesCheckBox_others = new JCheckBox("Others");

        hobbiesPanel = new JPanel();
        hobbiesPanel.add(hobbiesCheckBox_reading);
        hobbiesPanel.add(hobbiesCheckBox_gardening);
        hobbiesPanel.add(hobbiesCheckBox_watchingMovies);
        hobbiesPanel.add(hobbiesCheckBox_shopping);
        hobbiesPanel.add(hobbiesCheckBox_others);
        topConstrains.gridy++;
        topPanel.add(hobbiesPanel, topConstrains);

        experienceYearLabel = new JLabel("Year of experience in this sport :");
        experienceYearSlider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        experienceYearSlider.setMajorTickSpacing(5);
        experienceYearSlider.setMinorTickSpacing(1);
        experienceYearSlider.setPaintTicks(true);
        experienceYearSlider.setPaintLabels(true);

        middleBottomPanel = new JPanel();
        middleBottomPanel.setLayout(new GridBagLayout());
        middleBottomPanel.add(experienceYearLabel, middleConstrains);
        middleConstrains.gridy++;
        middleBottomPanel.add(experienceYearSlider, middleConstrains);
        
        middlePanel.add(middleBottomPanel, BorderLayout.SOUTH);
    }

    protected static void createAndShowGUI() {
        AthleteFormV4 athleteFormV4 = new AthleteFormV4("Athlete Form V4");
        athleteFormV4.addMenus();
        athleteFormV4.addComponents();
        athleteFormV4.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
