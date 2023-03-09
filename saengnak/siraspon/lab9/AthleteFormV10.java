package saengnak.siraspon.lab9;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class AthleteFormV10 extends AthleteFormV9 implements ListSelectionListener, ChangeListener {
    protected AthleteFormV10(String title) {
        super(title);
    }

    protected String sportsMessage;
    protected JSlider sliderSource;

    protected void addListeners() {
        super.addListeners();

        sportsList.addListSelectionListener(this);
        experienceYearSlider.addChangeListener(this);
    }

    public void valueChanged(ListSelectionEvent e) {
        sportsArrayList = new ArrayList<>(sportsList.getSelectedValuesList());
        sportsMessage = "";

        if (!e.getValueIsAdjusting()) {
            for (String i : sportsArrayList) {
                sportsMessage += i + ", ";
            }

            if (sportsMessage.length() >= 2) {
                sportsMessage = sportsMessage.substring(0, sportsMessage.length() - 2);
            }

            if (sportsArrayList.size() == 1) {
                JOptionPane.showMessageDialog(null, "Selected sport is " + sportsMessage);
            } else if (sportsArrayList.size() == 0) {
                JOptionPane.showMessageDialog(null, "Selected sports is none.");
            } else {
                JOptionPane.showMessageDialog(null, "Selected sports are " + sportsMessage);
            }
        }
    }

    public void stateChanged(ChangeEvent e) {
        sliderSource = (JSlider) e.getSource();
        if (!sliderSource.getValueIsAdjusting()) {
            JOptionPane.showMessageDialog(null, "# of experience years is " + sliderSource.getValue());
        }
    }

    protected static void createAndShowGUI() {
        AthleteFormV10 athleteFormV10 = new AthleteFormV10("Athlete Form V10");
        athleteFormV10.addMenus();
        athleteFormV10.addComponents();
        athleteFormV10.initializeValues();
        athleteFormV10.addListeners();
        athleteFormV10.addShortcuts();
        athleteFormV10.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
