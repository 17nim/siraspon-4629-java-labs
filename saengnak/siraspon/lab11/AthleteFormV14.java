package saengnak.siraspon.lab11;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

import saengnak.siraspon.lab10.*;

public class AthleteFormV14 extends AthleteFormV13 {
    protected AthleteFormV14(String title) {
        super(title);
    }

    protected JFileChooser fc;
    protected File file;

    protected ArrayList<JCheckBox> selectedHobbiesList;
    protected int hobbyCounter;
    protected StringBuffer multipleHobbiesString;
    protected PrintWriter p;

    protected FileReader fileReader;
    protected BufferedReader bufferedReader;
    protected String line;

    protected void addComponents() {
        super.addComponents();

        file = new File("saengnak\\siraspon\\lab11");
        fc = new JFileChooser(file.getAbsolutePath());

        selectedHobbiesList = new ArrayList<>();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openMenuItem) {
            openFile();
        } else if (e.getSource() == saveMenuItem) {
            saveFile();
        } else {
            super.actionPerformed(e);
        }
    }

    protected void openFile() {
        fc.setSelectedFile(new File("hobbies.txt"));
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                fileReader = new FileReader(fc.getSelectedFile());
                bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    bioTextArea.setText(line);
                }
                bioTextArea.append("\n");
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "Error while opening file " + fc.getSelectedFile().getName() + "\n(File not found)");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error while opening file " + fc.getSelectedFile().getName());
                e.printStackTrace();
            }
        }
    }

    protected void saveFile() {
        fc.setSelectedFile(new File("hobbies.txt"));
        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            getInfo();
            selectedHobbiesList.clear();
            for (JCheckBox i : hobbiesList) {
                if (i.isSelected()) {
                    selectedHobbiesList.add(i);
                }
            }
            hobbyCounter = selectedHobbiesList.size();

            try {
                p = new PrintWriter(fc.getSelectedFile());

                if (hobbyCounter == 0) {
                    p.print(nameString + " does not have any hobby");
                } else if (hobbyCounter == 1) {
                    p.print(nameString + " has a hobby as " + selectedHobbiesList.get(0).getText().toLowerCase());
                } else {
                    multipleHobbiesString = new StringBuffer();
                    multipleHobbiesString.append(nameString + " has hobbies as ");
                    for (int i = 0; i < hobbyCounter; i++) {
                        multipleHobbiesString.append(selectedHobbiesList.get(i).getText().toLowerCase());
                        if (i != hobbyCounter - 2) {
                            multipleHobbiesString.append(", ");
                        } else {
                            multipleHobbiesString.append(", and ");
                        }
                    }
                    p.print(multipleHobbiesString.substring(0, multipleHobbiesString.length() - 2));
                }
                p.close();

                JOptionPane.showMessageDialog(null, "Saving hobbies in file \n" + fc.getSelectedFile().getPath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error while saving file " + fc.getSelectedFile());
                e.printStackTrace();
            }
        }
    }

    protected static void createAndShowGUI() {
        AthleteFormV14 athleteFormV14 = new AthleteFormV14("Athlete Form V14");
        athleteFormV14.addMenus();
        athleteFormV14.addComponents();
        athleteFormV14.initializeValues();
        athleteFormV14.addListeners();
        athleteFormV14.addShortcuts();
        athleteFormV14.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
