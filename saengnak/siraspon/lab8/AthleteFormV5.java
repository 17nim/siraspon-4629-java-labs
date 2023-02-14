package saengnak.siraspon.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV5 extends AthleteFormV4 {
    protected AthleteFormV5(String title) {
        super(title);
    }

    protected Color textFieldColor, sportsListColor, textAreaColor, menuColor;
    protected Font labelFont, buttonFont, menuFont;
    
    protected void addComponents() {
        super.addComponents();

        textFieldColor = new Color(167, 59, 36);
        nameTextField.setBackground(textFieldColor);
        weightTextField.setBackground(textFieldColor);
        heightTextField.setBackground(textFieldColor);
        birthdateTextField.setBackground(textFieldColor);

        labelFont = new Font(Font.SERIF, 1, 14);
        nameLabel.setFont(labelFont);
        weightLabel.setFont(labelFont);
        heightLabel.setFont(labelFont);
        birthdateLabel.setFont(labelFont);
        genderLabel.setFont(labelFont);
        hobbiesLabel.setFont(labelFont);
        nationalityLabel.setFont(labelFont);
        sportsLabel.setFont(labelFont);
        bioLabel.setFont(labelFont);
        experienceYearLabel.setFont(labelFont);

        sportsListColor = new Color(35, 45, 222);
        sportsList.setForeground(sportsListColor);

        buttonFont = new Font(Font.SERIF, 3, 16);
        cancelButton.setFont(buttonFont);
        resetButton.setFont(buttonFont);
        submitButton.setFont(buttonFont);

        textAreaColor = new Color(200, 200, 200);
        bioTextArea.setBackground(textAreaColor);

        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submitButton.setToolTipText("Press the submit button to submit this form");
    }

    protected void addMenus() {
        super.addMenus();

        menuFont = new Font(Font.SANS_SERIF, 1, 14);
        fileMenu.setFont(menuFont);
        configMenu.setFont(menuFont);
        newMenuItem.setFont(menuFont);
        openMenuItem.setFont(menuFont);
        saveMenuItem.setFont(menuFont);
        exitMenuItem.setFont(menuFont);
        colorMenu.setFont(menuFont);
        colorMenuItem_red.setFont(menuFont);
        colorMenuItem_green.setFont(menuFont);
        colorMenuItem_blue.setFont(menuFont);
        sizeMenu.setFont(menuFont);
        sizeMenuItem_16.setFont(menuFont);
        sizeMenuItem_20.setFont(menuFont);
        sizeMenuItem_24.setFont(menuFont);

        menuColor = new Color(6, 57, 112);
        newMenuItem.setForeground(menuColor);
        openMenuItem.setForeground(menuColor);
        saveMenuItem.setForeground(menuColor);
        exitMenuItem.setForeground(menuColor);
        colorMenu.setForeground(menuColor);
        colorMenuItem_red.setForeground(menuColor);
        colorMenuItem_green.setForeground(menuColor);
        colorMenuItem_blue.setForeground(menuColor);
        sizeMenu.setForeground(menuColor);
        sizeMenuItem_16.setForeground(menuColor);
        sizeMenuItem_20.setForeground(menuColor);
        sizeMenuItem_24.setForeground(menuColor);

        fileMenu.setToolTipText("To create new, open, save form or exit");
        configMenu.setToolTipText("To configure size and color of a component");
    }

    protected static void createAndShowGUI() {
        AthleteFormV5 athleteFormV5 = new AthleteFormV5("Athlete Form V5");
        athleteFormV5.addMenus();
        athleteFormV5.addComponents();
        athleteFormV5.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
