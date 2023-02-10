package saengnak.siraspon.lab7;

import javax.swing.*;

public class AthleteFormV3 extends AthleteFormV2 {
    protected AthleteFormV3(String title) {
        super(title);
    }

    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu, colorMenu, sizeMenu;
    protected JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem, colorMenuItem_red, colorMenuItem_green,
            colorMenuItem_blue, sizeMenuItem_16, sizeMenuItem_20, sizeMenuItem_24;
    protected ImageIcon newIcon, openIcon, saveIcon, exitIcon;

    protected void addMenus() {

        fileMenu = new JMenu("File");

        newIcon = new ImageIcon("saengnak/siraspon/lab7/icons/plus-circle.png");
        openIcon = new ImageIcon("saengnak/siraspon/lab7/icons/folder-open.png");
        saveIcon = new ImageIcon("saengnak/siraspon/lab7/icons/save.png");
        exitIcon = new ImageIcon("saengnak/siraspon/lab7/icons/signout.png");

        newMenuItem = new JMenuItem("New", newIcon);
        openMenuItem = new JMenuItem("Open", openIcon);
        saveMenuItem = new JMenuItem("Save", saveIcon);
        exitMenuItem = new JMenuItem("Exit", exitIcon);

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        configMenu = new JMenu("Config");

        colorMenu = new JMenu("Color");
        colorMenuItem_red = new JMenuItem("Red");
        colorMenuItem_green = new JMenuItem("Green");
        colorMenuItem_blue = new JMenuItem("Blue");
        colorMenu.add(colorMenuItem_red);
        colorMenu.add(colorMenuItem_green);
        colorMenu.add(colorMenuItem_blue);

        sizeMenu = new JMenu("Size");
        sizeMenuItem_16 = new JMenuItem("16");
        sizeMenuItem_20 = new JMenuItem("20");
        sizeMenuItem_24 = new JMenuItem("24");
        sizeMenu.add(sizeMenuItem_16);
        sizeMenu.add(sizeMenuItem_20);
        sizeMenu.add(sizeMenuItem_24);

        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);

        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(configMenu);

        this.setJMenuBar(menuBar);
    }

    protected static void createAndShowGUI() {
        AthleteFormV3 athleteFormV3 = new AthleteFormV3("Athlete Form V3");
        athleteFormV3.addMenus();
        athleteFormV3.addComponents();
        athleteFormV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

/*
 * This program 'AthleteFormV3' is extended from class 'AthleteFormV2'. It has
 * additional components from previous program: a menu bar with two menus
 * labelled 'File' and 'Config'.
 * 
 * The menu 'File' has four menu items which are 'New', 'Open', 'Save', and
 * 'Exit'.
 * The menu 'Config' has two submenu which are 'Color', and 'Size'.
 * The submenu 'Color' has three menu items: Red, Green, and Blue.
 * The submenu 'Size' has three menu items: 16, 20, and 24.
 * 
 * This program has overridden the method addComponents() to add more
 * components;
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: February 9, 2023
 */