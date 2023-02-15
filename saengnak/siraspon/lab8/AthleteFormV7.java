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
