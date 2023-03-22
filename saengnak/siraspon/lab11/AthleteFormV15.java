package saengnak.siraspon.lab11;

import javax.swing.*;
import java.io.*;

public class AthleteFormV15 extends AthleteFormV14 {
    protected AthleteFormV15(String title) {
        super(title);
    }

    FileInputStream fis;
    DataInputStream dis;

    FileOutputStream fos;
    DataOutputStream dos;

    String stringData;
    int intData, experience;

    protected void openFile() {
        super.openFile();

        fc.setSelectedFile(new File("years"));
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(fc.getSelectedFile());
                dis = new DataInputStream(fis);

                stringData = dis.readUTF();
                intData = dis.readInt();

                if (intData == 1) {
                    bioTextArea.append(stringData + " has " + intData + " year of experience\n");
                } else {
                    bioTextArea.append(stringData + " has " + intData + " years of experience\n");
                }

                dis.close();
                fis.close();
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

        fc.setSelectedFile(new File("years"));
        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                fos = new FileOutputStream(fc.getSelectedFile());
                dos = new DataOutputStream(fos);

                experience = experienceYearSlider.getValue();

                dos.writeUTF(nameString);
                dos.writeInt(experience);

                dos.close();
                fos.close();

                JOptionPane.showMessageDialog(null,
                        "Saving years of experience in file \n" + fc.getSelectedFile().getPath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error while saving file " + fc.getSelectedFile());
                e.printStackTrace();
            }
        }
    }

    protected static void createAndShowGUI() {
        AthleteFormV15 athleteFormV15 = new AthleteFormV15("Athlete Form V15");
        athleteFormV15.addMenus();
        athleteFormV15.addComponents();
        athleteFormV15.initializeValues();
        athleteFormV15.addListeners();
        athleteFormV15.addShortcuts();
        athleteFormV15.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
