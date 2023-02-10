package saengnak.siraspon.lab7;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected MySimpleWindow(String title) {
        super(title);
    }

    protected JPanel mainPanel, buttonPanel;
    protected JButton cancelButton, resetButton, submitButton;

    protected void addComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        buttonPanel = new JPanel();
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");

        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        this.setLayout(new BorderLayout());
        this.add(mainPanel, BorderLayout.CENTER);
    }

    protected void setFrameFeatures() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    protected static void createAndShowGUI() {
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