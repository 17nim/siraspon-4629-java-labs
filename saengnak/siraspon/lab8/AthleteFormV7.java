/*
 * This program 'AthleteFormV7' is extended from class 'AthleteFormV6'. It has
 * an additional component from previous program: an Olympic-related image  
 * at the bottom of the window using the graphics class. 
 * 
 * This program has overridden the method addComponents(), and implementing 
 * the class ReadImage for adding more components.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: February 15, 2023
 */

package saengnak.siraspon.lab8;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

class ReadImage extends JPanel {
    BufferedImage image;
    String fileDirectory = "saengnak/siraspon/lab8/images/Athlete.png";

    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    protected ReadImage() {
        try {
            image = ImageIO.read(new File(fileDirectory));
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}

public class AthleteFormV7 extends AthleteFormV6 {
    protected AthleteFormV7(String title) {
        super(title);
    }

    ReadImage readImage;

    protected void addComponents() {
        super.addComponents();

        readImage = new ReadImage();
        readImage.setPreferredSize(new Dimension(400, 300));
        middleConstrains.gridy++;

        middleBottomPanel.add(readImage, middleConstrains);
    }

    protected static void createAndShowGUI() {
        AthleteFormV7 athleteFormV7 = new AthleteFormV7("Athlete Form V7");
        athleteFormV7.addMenus();
        athleteFormV7.addComponents();
        athleteFormV7.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
