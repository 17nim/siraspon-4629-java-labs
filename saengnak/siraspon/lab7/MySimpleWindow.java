package saengnak.siraspon.lab7;

import javax.swing.*;
import java.awt.*;

class MySimpleWindow extends JFrame {
    MySimpleWindow(String title) {
        super(title);
    }

    protected JPanel mainPanel, buttonPanel;
    protected JButton cancelButton, resetButton, submitButton;

    void addComponents() {
        mainPanel = new JPanel();
        buttonPanel = new JPanel();
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");

        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);

        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    protected void setFrameFeatures() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
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
 * This program 'MySimpleWindow' is extended from class 'JFrame'. It shows a
 * window with the title labelled 'MySimpleWindow', and three non-functional
 * button: 'Cancel', 'Reset', and 'Submit'.
 * 
 * This program has three methods: addComponents(), setFrameFeatures(),
 * and createAndShowGUI().
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: February 9, 2023
 */