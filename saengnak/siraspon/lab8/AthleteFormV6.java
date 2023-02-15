/*
 * This program 'AthleteFormV6' is extended from class 'AthleteFormV5'. It has
 * an additional component from previous program: a drawing of Olympic symbol 
 * at the top of the window using the graphics class. 
 * 
 * This program has overridden the method addComponents(), and implementing 
 * the class OlympicSymbol for adding more components.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: February 15, 2023
 */

package saengnak.siraspon.lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class OlympicSymbol extends JPanel {
    Ellipse2D.Double blueCircle, redCircle, yellowCircle, greenCircle, blackCircle;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        blueCircle = new Ellipse2D.Double(10, 10, 50, 50);
        redCircle = new Ellipse2D.Double(60, 10, 50, 50);
        yellowCircle = new Ellipse2D.Double(110, 10, 50, 50);
        greenCircle = new Ellipse2D.Double(35, 35, 50, 50);
        blackCircle = new Ellipse2D.Double(85, 35, 50, 50);

        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.BLUE);
        g2d.draw(blueCircle);

        g2d.setColor(Color.RED);
        g2d.draw(redCircle);

        g2d.setColor(Color.YELLOW);
        g2d.draw(yellowCircle);

        g2d.setColor(Color.GREEN);
        g2d.draw(greenCircle);

        g2d.setColor(Color.BLACK);
        g2d.draw(blackCircle);
    }
}

public class AthleteFormV6 extends AthleteFormV5 {
    protected AthleteFormV6(String title) {
        super(title);
    }

    protected OlympicSymbol olympicSymbol;

    protected void addComponents() {
        super.addComponents();

        olympicSymbol = new OlympicSymbol();
        olympicSymbol.setPreferredSize(new Dimension(200, 100));
        this.add(olympicSymbol, BorderLayout.NORTH);
    }

    protected static void createAndShowGUI() {
        AthleteFormV6 athleteFormV6 = new AthleteFormV6("Athlete Form V6");
        athleteFormV6.addMenus();
        athleteFormV6.addComponents();
        athleteFormV6.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
