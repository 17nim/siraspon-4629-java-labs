package saengnak.siraspon.lab7;

import javax.swing.*;

class MySimpleWindow extends JFrame {
    protected JButton cancelButton, resetButton, submitButton;
    protected JPanel mainPanel, buttonPanel;

    MySimpleWindow(String title) {
        super(title);
    }

    public void addComponents() {
        mainPanel = new JPanel();
        buttonPanel = new JPanel();
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");

        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);

        mainPanel.add(buttonPanel);
        this.add(mainPanel);
    }

    protected void setFrameFeatures() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void createAndShowGUI() {
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