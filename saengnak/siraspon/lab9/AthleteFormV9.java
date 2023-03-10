/*
 * This program 'AthleteFormV9' is extended from 'AthleteFormV8' class and implements the 'ItemListener' interface.
 * The program has overridden the method addComponents() for adding an ArrayList of JMenuItems.
 * The program has overridden the method addListeners() for adding listeners to various components.
 * The program has additional method called 'addShortcuts()' that sets keyboard shortcuts for the menu items 
 * using 'setAccelerator()' method and sets mnemonic keys for the menu items using 'setMnemonic()' method.
 * The program detects the change in the components and shows a pop-up window using JOptionPane.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: March 10, 2023
 */

package saengnak.siraspon.lab9;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {
    protected AthleteFormV9(String title) {
        super(title);
    }

    protected Object sourceItem;
    protected ArrayList<JMenuItem> menuItemsList;

    protected void addComponents() {
        super.addComponents();

        menuItemsList = new ArrayList<>();
        menuItemsList.add(newMenuItem);
        menuItemsList.add(openMenuItem);
        menuItemsList.add(saveMenuItem);
        menuItemsList.add(exitMenuItem);
    }

    protected void addListeners() {
        super.addListeners();

        nameTextField.addActionListener(this);
        weightTextField.addActionListener(this);
        heightTextField.addActionListener(this);
        birthdateTextField.addActionListener(this);

        nationalityComboBox.addItemListener(this);
        maleButton.addItemListener(this);
        femaleButton.addItemListener(this);

        hobbiesCheckBox_reading.addActionListener(this);
        hobbiesCheckBox_gardening.addActionListener(this);
        hobbiesCheckBox_watchingMovies.addActionListener(this);
        hobbiesCheckBox_shopping.addActionListener(this);
        hobbiesCheckBox_others.addActionListener(this);

        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
    }

    protected void addShortcuts() {
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));

        newMenuItem.setMnemonic(KeyEvent.VK_N);
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        exitMenuItem.setMnemonic(KeyEvent.VK_Q);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        if (sourceObject == nameTextField) {
            JOptionPane.showMessageDialog(null, "Name is changed to '" + nameTextField.getText() + "'");
        }
        if (sourceObject == weightTextField) {
            JOptionPane.showMessageDialog(null, "Weight is changed to '" + weightTextField.getText() + "'");
        }
        if (sourceObject == heightTextField) {
            JOptionPane.showMessageDialog(null, "Height is changed to '" + heightTextField.getText() + "'");
        }
        if (sourceObject == birthdateTextField) {
            JOptionPane.showMessageDialog(null, "Date of birth is changed to '" + birthdateTextField.getText() + "'");
        }

        for (JCheckBox i : hobbiesList) {
            if (sourceObject == i) {
                if (i.isSelected()) {
                    JOptionPane.showMessageDialog(null, "'" + i.getText() + "' is also your hobby");
                } else {
                    JOptionPane.showMessageDialog(null, "'" + i.getText() + "' is no longer your hobby");
                }
            }
        }

        for (JMenuItem i : menuItemsList) {
            if (sourceObject == i) {
                if (i == exitMenuItem) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "You chose menu '" + i.getText() + "'");
                }
            }
        }
    }

    public void itemStateChanged(ItemEvent e) {
        sourceItem = e.getSource();

        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (sourceItem == nationalityComboBox) {
                JOptionPane.showMessageDialog(null,
                        "Nationality is changed to '" + nationalityComboBox.getSelectedItem() + "'");
            }
            if (sourceItem == maleButton) {
                JOptionPane.showMessageDialog(null, "Gender is changed to '" + maleButton.getActionCommand() + "'");
            }
            if (sourceItem == femaleButton) {
                JOptionPane.showMessageDialog(null, "Gender is changed to '" + femaleButton.getActionCommand() + "'");
            }
        }
    }

    protected static void createAndShowGUI() {
        AthleteFormV9 athleteFormV9 = new AthleteFormV9("Athlete Form V9");
        athleteFormV9.addMenus();
        athleteFormV9.addComponents();
        athleteFormV9.initializeValues();
        athleteFormV9.addListeners();
        athleteFormV9.addShortcuts();
        athleteFormV9.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
