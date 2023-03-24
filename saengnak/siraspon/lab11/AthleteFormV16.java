/*
 * This program 'AthleteFormV16' is extended from 'AthleteFormV15' class.
 * 
 * The program has several additional features from the previous version:
 * user can save and open file that collect the athlete's object,
 * which is from class AthleteV2, in the form of binary file.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: March 24, 2023
 */

package saengnak.siraspon.lab11;

import javax.swing.*;
import java.io.*;

import saengnak.siraspon.lab5.Athlete.Gender;
import saengnak.siraspon.lab6.*;

public class AthleteFormV16 extends AthleteFormV15 {
    protected AthleteFormV16(String title) {
        super(title);
    }

    ObjectInputStream ois;
    ObjectOutputStream oos;

    protected void openFile() {
        super.openFile();

        fc.setSelectedFile(new File("athlete"));
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(fc.getSelectedFile());
                ois = new ObjectInputStream(fis);

                AthleteV2 inputAthlete = (AthleteV2) ois.readObject();

                bioTextArea.append(inputAthlete.toString());

                ois.close();
                fis.close();
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "Error while opening file " + fc.getSelectedFile().getName() + "\n(Class not found)");
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "Error while opening file " + fc.getSelectedFile().getName() + "\n(File not found)");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error while opening file " + fc.getSelectedFile().getName());
                e.printStackTrace(System.err);
            }
        }
    }

    protected void saveFile() {
        super.saveFile();

        fc.setSelectedFile(new File("athlete"));
        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                fos = new FileOutputStream(fc.getSelectedFile());
                oos = new ObjectOutputStream(fos);

                weightDouble = Double.parseDouble(weightString);
                heightDouble = Double.parseDouble(heightString);

                if (genderString.equals("Male")) {
                    gender = Gender.MALE;
                } else if (genderString.equals("Female")) {
                    gender = Gender.FEMALE;
                } else {
                    gender = null;
                }

                oos.writeObject(
                        new AthleteV2(nameString, weightDouble, heightDouble, gender, nationalityString,
                                birthdateString));

                oos.close();
                fos.close();

                JOptionPane.showMessageDialog(null,
                        "Saving athlete in file \n" + fc.getSelectedFile().getPath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error while saving file " + fc.getSelectedFile());
                e.printStackTrace();
            }
        }
    }

    protected static void createAndShowGUI() {
        AthleteFormV16 athleteFormV16 = new AthleteFormV16("Athlete Form V16");
        athleteFormV16.addMenus();
        athleteFormV16.addComponents();
        athleteFormV16.initializeValues();
        athleteFormV16.addListeners();
        athleteFormV16.addShortcuts();
        athleteFormV16.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
